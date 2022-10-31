package model.Dao;

import java.sql.Statement;
import java.util.ArrayList;

import controller.admin.regist;
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
}	

