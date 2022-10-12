


/*정규표현식 : 형식 언어*/

//0.아이콘
let sicon='<i class="fas fa-check-circle"></i>'
let bicon='<i class="fas fa-ban"></i>'


//1. col3 div 모두 가져오기
let col3 = document.querySelectorAll('.col3') //class가 col3이면 모두 호출 [all->배열]


/** 아이디*/

function mevent1(){
	let mid = document.querySelector("#mid").value
	let midj = /^[a-z0-9]{5,20}$/
	
	if(midj.test(mid)){// 정규표현식이 동일하면 
		$.ajax({ // 아이디 중복 체크 [비동기식]
			url:"/jspweb/member/idcheck",
			data :{"mid" :mid},
			success : function(서블릿받은데이터){
				if(서블릿받은데이터==='true'){col3[0].innerHTML = bicon+"사용중인 아이디 입니다." }
				else{col3[0].innerHTML = sicon}
				}			
		})
	}else{ col3[0].innerHTML = bicon+'소문자/숫자 조합 5~20글자.'} //정규표현식이 다르면 
}
/** 비밀번호	*/
function mevent2(){
	let mpassword = document.querySelector("#mpassword").value
	let mpasswordj = /^[a-zA-Z0-9]{8,20}$/
	
	if(mpasswordj.test(mpassword)){
		col3[1].innerHTML = sicon
	}else{
		col3[1].innerHTML = bicon+'영대소문자/숫자 조합 5~20글자.'
	}
	
	}
/** 비번확인*/
function mevent3(){
	let mpassword = document.querySelector("#mpassword").value
	let mpasswordconfirm = document.querySelector("#mpasswordconfirm").value
	let mpasswordj = /^[a-zA-Z0-9]{8,20}$/
	if(!mpasswordj.test(mpasswordconfirm)){col3[1].innerHTML = bicon+'영대소문자/숫자 조합 5~20글자작성.'} // 정규표현식이 다르면
	else if(mpasswordconfirm != mpassword){col3[1].innerHTML = bicon+'비밀번호 서로가 다릅니다.'} //두 비밀번호가 다르면
	else{col3[1].innerHTML = sicon; mevent2();} //정규표현식도 맞고 두 비밀번호도 맞으면
}
/** 이름*/
function mevent4(){
	let mname = document.querySelector("#mname").value
	let mnamej= /^[a-zA-Z가-힣]{2,20}$/
	if(mnamej.test(mname)){col3[2].innerHTML = sicon;}
	else{col3[2].innerHTML = bicon+"영대소문자 혹은 한글 2~20글자만 작성하세요"}
}
/** 전회번호*/
function mevent5(){
	let mphone = document.querySelector("#mphone").value
	let mphonej = /^([0-9]{2,3})-([0-9]{3,4})-([0-9]{3,4})$/
	if(mphonej.test(mphone)){
		col3[3].innerHTML = sicon;
	}else{
		col3[3].innerHTML = bicon+"010-xxxx-xxxx 형식으로 입력해주세요.-작성";
	}
}
/*이메일확인 */
function mevent6(){
	let memail = document.querySelector("#memail").value
	let memailj =/^[a-zA-Z0-9+-_.]+@[a-zA-Z0-9-]+\.[a-zA-Z0-9-]+$/ 
	if(memailj.test(memail)){
		$.ajax({
			url : "/jspweb/member/emailcheck",
			data:{"memail" :memail },
			success : function(re){
				if(re==='true'){
					col3[4].innerHTML = bicon+"사용중인 이메일입니다..";
				}else{
					col3[4].innerHTML = sicon;
				}
			}
			
		})		
	}else{
		col3[4].innerHTML = bicon+"이메일 형식으로 입력해주세요. abcd@naver.com작성";
	}
}

/** 주소*/

let sample4_postcode = document.querySelector("#sample4_postcode")
let sample4_roadAddress = document.querySelector("#sample4_roadAddress")
let sample4_jibunAddress = document.querySelector("#sample4_jibunAddress")
let sample4_detailAddress = document.querySelector("#sample4_detailAddress")

function addresscheck(e){
	console.log(e)
	let a = e.target.value;
	if(a.indexOf(",")!==-1){col3[5].innerHTML = bicon+"주소에 [쉼표] [특수문자] 포함 불가능";}
	else{col3[5].innerHTML = sicon}
}

sample4_postcode.addEventListener('change' ,addresscheck) //change된 객체의 정보를 addresscheck함수로 정보를 넘겨줌
sample4_roadAddress.addEventListener('change' ,addresscheck)
sample4_jibunAddress.addEventListener('change' ,addresscheck)

sample4_detailAddress.addEventListener('change' ,addresscheck)


/** 회원가입 전송*/

function formsubmit(){
	
	for(let i = 0; i<=5; i++){
		if(col3[i].innerHTML !== sicon){alert('입력이 안된 정보가 있습니다');return false;}
}

	if(document.querySelector("#confirm1").checked ==false){
		//tag객체명 .checked  :체크가 되어있으면 true 아니면 false
		alert("이용약관에 동의해주세요"); return false;
}
	if(document.querySelector("#confirm2").checked==false){
		alert("개인정보 수집에 동의해주세요"); return false;
	}
	document.querySelector(".signupform").submit();
	

}









/** 카카오 우편 api
 * 
 */
  function sample4_execDaumPostcode() {
        new daum.Postcode({
            oncomplete: function(data) {
                // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

                // 도로명 주소의 노출 규칙에 따라 주소를 표시한다.
                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
                var roadAddr = data.roadAddress; // 도로명 주소 변수
                var extraRoadAddr = ''; // 참고 항목 변수

                // 법정동명이 있을 경우 추가한다. (법정리는 제외)
                // 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
                if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
                    extraRoadAddr += data.bname;
                }
                // 건물명이 있고, 공동주택일 경우 추가한다.
                if(data.buildingName !== '' && data.apartment === 'Y'){
                   extraRoadAddr += (extraRoadAddr !== '' ? ', ' + data.buildingName : data.buildingName);
                }
                // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
                if(extraRoadAddr !== ''){
                    extraRoadAddr = ' (' + extraRoadAddr + ')';
                }

                // 우편번호와 주소 정보를 해당 필드에 넣는다.
                document.getElementById('sample4_postcode').value = data.zonecode;
                document.getElementById("sample4_roadAddress").value = roadAddr;
                document.getElementById("sample4_jibunAddress").value = data.jibunAddress;
                
                // 참고항목 문자열이 있을 경우 해당 필드에 넣는다.
                if(roadAddr !== ''){
                    document.getElementById("sample4_extraAddress").value = extraRoadAddr;
                } else {
                    document.getElementById("sample4_extraAddress").value = '';
                }

                var guideTextBox = document.getElementById("guide");
                // 사용자가 '선택 안함'을 클릭한 경우, 예상 주소라는 표시를 해준다.
                if(data.autoRoadAddress) {
                    var expRoadAddr = data.autoRoadAddress + extraRoadAddr;
                    guideTextBox.innerHTML = '(예상 도로명 주소 : ' + expRoadAddr + ')';
                    guideTextBox.style.display = 'block';

                } else if(data.autoJibunAddress) {
                    var expJibunAddr = data.autoJibunAddress;
                    guideTextBox.innerHTML = '(예상 지번 주소 : ' + expJibunAddr + ')';
                    guideTextBox.style.display = 'block';
                } else {
                    guideTextBox.innerHTML = '';
                    guideTextBox.style.display = 'none';
                }
            }
        }).open();
    }