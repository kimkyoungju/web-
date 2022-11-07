package model.Dao;

import java.sql.Statement;
import java.util.ArrayList;

import controller.admin.regist;
import controller.board.bdelete;
import model.Dto.CartDto;
import model.Dto.orderDto;
import model.Dto.pcatagoryDto;
import model.Dto.productDto;
import model.Dto.stockDto;

public class productDao extends Dao {
		
		//카테고리 등록 [c
		public boolean setpcatagory(String pcname) {
			String sql = "insert into pcatagory(pcname)values(?)";
			try {
				ps = con.prepareStatement(sql);
				ps.setString(1, pcname);
				ps.executeUpdate(); return true;
				
			} catch (Exception e) {
				System.out.println(e);
				}return false;
		}
		//카테도리 출력 [r
		public  ArrayList<pcatagoryDto>getpcategory(){
			ArrayList<pcatagoryDto>list =new  ArrayList<>();
			String sql = "select *from pcatagory";
			try {
				ps = con.prepareStatement(sql);
				rs = ps.executeQuery();
				while(rs.next()) {
					pcatagoryDto dto = new pcatagoryDto(rs.getInt(1),rs.getString(2));
					list.add(dto);
				}
			} catch (Exception e) {
				System.out.println(e);
			}return list;
		}
		//3. 제품등록[c
		public boolean setproduct(productDto dto) {
			
			
			String sql = "insert into product(pname,pcomment,pprice,pdiscount,pimg,pcno)values(?,?,?,?,?,?)";
			
			try {
				ps = con.prepareStatement(sql);
				ps.setString(1, dto.getPname());
				ps.setString(2, dto.getPcomment());
				ps.setInt(3, dto.getPprice());
				ps.setFloat(4, dto.getPdiscount());
				ps.setString(5, dto.getPimg());
				ps.setInt(6, dto.getPcno());
				ps.executeUpdate(); return true;
			} catch (Exception e) {
		System.out.println(e);}
			
			return false;
		}
		
		//4. 제품출력[r
		public ArrayList<productDto> getproductlist(String option ){
			ArrayList<productDto>list = new ArrayList<>();
			System.out.println(list);
			System.out.println(option);
			String sql = null;
			//1. 조건없는 모든 제품 출력
			if(option.equals("all")) {
			 sql = "select *from product";
			}else if(option.equals("pactive1")) {
			//2. [판매중] 상태 상태만 모든 체품 출력
			 sql ="select * from product where pactive = 1 order by pdate desc";
			}
			System.out.println(sql);
			try {
				
				ps = con.prepareStatement(sql);
				rs = ps.executeQuery();
				while(rs.next()) {
					productDto dto = new productDto(
							rs.getInt(1),rs.getString(2),
							rs.getString(3),rs.getInt(4),
							rs.getFloat(5),rs.getByte(6),
							rs.getString(7),rs.getString(8),rs.getInt(9)
							);
					list.add(dto);}
			
			} catch (Exception e) {System.out.println(e);}
			return list;
		}
	
		//5 . 제품 삭제
		public boolean deleteprodcut( int pno) {
			String sql = "delete from product where pno ="+pno;
			try {
				ps = con.prepareStatement(sql);
				// 삭제시 삭제된 레코드수로 삭제성공 유무판단
				int count = ps.executeUpdate();
				if (count ==1) return true;
			} catch (Exception e) {
				System.out.println(e);
			}return false;
		}
		//6 개별 출력
		public productDto getProduct(int pno) {
			 String sql = "select * from product where pno ="+pno;
			 try {
				 ps = con.prepareStatement(sql);
				 rs = ps.executeQuery();
				 if(rs.next()) {
						productDto dto = new productDto(
								rs.getInt(1),rs.getString(2),
								rs.getString(3),rs.getInt(4),
								rs.getFloat(5),rs.getByte(6),
								rs.getString(7),rs.getString(8),rs.getInt(9));
						return dto;}
			} catch (Exception e) {
				System.out.println(e);
			} return null;
		}
		
		//7 제품 수정
		public boolean getupdate(  String pname , String pcomment , int pprice ,float pdiscount , String pimg, int pcname ,byte pactive ,int pno) {
			
			String sql = "update product set  pname  = ?  ,pcomment =? ,pprice =? , pdiscount=? , pimg = ? , pcno =? ,pactive=? where pno=?";
			try {
				ps = con.prepareStatement(sql);
				ps.setString(1, pname);
				ps.setString(2, pcomment);
				ps.setInt(3, pprice);
				ps.setFloat(4, pdiscount );
				ps.setString(5, pimg);
				ps.setInt(6, pcname);
				ps.setByte(7, pactive);
				ps.setInt(8, pno);
				ps.executeUpdate();
				return true;
			} catch (Exception e) {
			System.out.println(e);}
			return false;
			
		}
		
		// 8. 재고 등록
		public boolean setstock(String psize ,int pno ,String pcolor,int pstock) {
			//1. 사이즈 먼저 등록
			
			String sql = "insert into productsize(psize ,pno ) values(?,?)";
			try {
				ps = con.prepareStatement(sql ,Statement.RETURN_GENERATED_KEYS );
				ps.setString(1, psize); ps.setInt(2, pno);
				ps.executeUpdate();
					// 방금 insert 된pk값 가져오기
					//1. con.prepareStatement(sql , );
					//2. ps.getGeneratedKeys(); : pk값 호출
					rs =  ps.getGeneratedKeys();
					if(rs.next()) {
						int psno = rs.getInt(1);//pk호출
						sql = "insert into productstock (pcolor , pstock ,psno) values (?,?,?);";
						ps = con.prepareStatement(sql);
						ps.setString(1, pcolor);
						ps.setInt(2, pstock);
						ps.setInt(3, psno);
					 ps.executeUpdate();
					 return true;
					}
			} catch (Exception e) {System.out.println(e);}
			return false;
		}
		
		//9.제품별 재고 출력
		
		public ArrayList<stockDto>getstock(int pno){
			ArrayList<stockDto>list = new ArrayList<>();
			
			String sql = "select  ps.psno , ps.psize , pst.pstno, pst.pcolor , pst.pstock from productsize ps ,productstock pst where ps.psno = pst.psno and ps.pno ="+pno+" order by ps.psize desc;";
			try {
				
				ps = con.prepareStatement(sql);
				rs = ps.executeQuery();
				while(rs.next()) {
					stockDto dto = new stockDto(rs.getInt(1), rs.getString(2), 
							rs.getInt(3),rs.getString(4),rs.getInt(5));
					list.add(dto);
				}
			} catch (Exception e) {System.out.println(e);}return list;
			 
		}
		
		//10. 제품 찜하기
		public int setPlike(int pno ,int mno) {
			String sql = "select * from plike where pno =? and mno =?"; //검색 [ 해당 찜하기 여부 있는지 체크
				try {
					ps = con.prepareStatement(sql);
					ps.setInt(1 , pno); ps.setInt(2, mno); 
					rs = ps.executeQuery();
					if(rs.next()) { //  검색결과가 있으면 //이미 찜하기 되어잇는 경우
						sql = "delete from plike where pno =? and mno =?";
						ps = con.prepareStatement(sql);

						ps.setInt(1 , pno); ps.setInt(2, mno);  
						ps.executeUpdate(); return 1;

					}else{ // 등록
						sql = "insert into plike (pno , mno) values(?,?)";
						ps = con.prepareStatement(sql);

						ps.setInt(1 , pno); ps.setInt(2, mno); 
						ps.executeUpdate(); return 2;

					}
					
				} catch (Exception e) {System.out.println(e);} return 3;
		
		}
		
		//11. 장바구니 선택한 제품 변환
		public boolean setcart(int pno , String psize , int amount , String pcolor, int mno) {
			
			//!만약에 동일한 제품 옵션 존재했을때 수량만 증가하는 업데이트처리 [미구현]
			
			
			//동일한 제품 옵션이 없을때
			String sql = " insert into cart(amount , pstno , mno) "
					+ " values ("
					+ " "+amount+"	,"
					+ "   (select pstno "
					+ "	from productstock pst ,(select psno from productsize where pno = "+pno+"  and psize = '"+psize+"') sub"
					+ "	where pst.psno = sub.psno and pcolor ='"+pcolor+"'),"
					+ "	"+mno+""
					+ " );";
			
			try {
				ps = con.prepareStatement(sql);
				ps.executeUpdate(); return true;
			} catch (Exception e) {System.out.println(e);
			}return false; 
		}
		//12. 회원번호의 모든 장바구니 호출
		public ArrayList<CartDto>getCart(int mno){
			ArrayList<CartDto>list = new ArrayList<>();
			String sql = "select "
					+ "	 c.cartno, c.pstno , "
					+ "     p.pname ,  p.pimg , "
					+ "     p.pprice , p.pdiscount  , "
					+ "     pst.pcolor ,  ps.psize , "
					+ "     c.amount "
					+ " from "
					+ " cart c natural join "
					+ " productstock pst natural join "
					+ " productsize ps natural join "
					+ " product p "
					+ " where "
					+ " c.mno = "+mno;
			try {
				ps = con.prepareStatement(sql);
				rs = ps.executeQuery();
				while(rs.next()) {
					CartDto  cartDto = new CartDto(rs.getInt(1), rs.getInt(2),
							rs.getString(3),rs.getString(4),
							rs.getInt(5), rs.getFloat(6),
							rs.getString(7), rs.getString(8), rs.getInt(9));
					list.add(cartDto);
				}
			} catch (Exception e) {System.out.println(e+"오류1");}
			return list;
		}
		//13.
		public boolean setorder(ArrayList<orderDto>list) {
			
			//1.주문 레코드 생성
			String sql = "insert into porder(oname,ophone,oaddress,orequest,mno) values(?,?,?,?,?)";
			try {
				ps = con.prepareStatement(sql , Statement.RETURN_GENERATED_KEYS);
				System.out.println( list.get(1).getOname());
				ps.setString(1, list.get(0).getOname());
				ps.setString(2, list.get(0).getOphone());
				ps.setString(3, list.get(0).getOaddress());
				ps.setString(4, list.get(0).getOrequest());
				ps.setInt(5, list.get(0).getMno());
				ps.executeUpdate();
				rs = ps.getGeneratedKeys(); 
				 while(rs.next()){ 
					 int ono = rs.getInt(1);
					 System.out.println(ono);
					 sql = "insert into porderdetail(odamount ,odprice ,odactive ,pstno,ono) value(?,?,?,?,?)";
					 try {
						 for(int i = 0 ; i<list.size(); i++) {
						 ps = con.prepareStatement(sql);
						 ps.setInt(1, list.get(i).getOdamount());
						 ps.setInt(2, list.get(i).getOdprice());
						 ps.setInt(3, list.get(i).getOdactive());
						 ps.setInt(4, list.get(i).getPstno());
						 ps.setInt(5, ono);
						 ps.executeUpdate();
						 }
						return true;
					 } catch (Exception e) {System.out.println(e+"멀까");}return false;}
				 } catch (Exception e) {
				System.out.println(e+"오류13");
			}
			return false;
		}
		
}	

