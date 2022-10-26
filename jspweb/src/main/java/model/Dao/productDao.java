package model.Dao;

import java.util.ArrayList;

import controller.admin.regist;
import model.Dto.pcatagoryDto;
import model.Dto.productDto;

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
		public ArrayList<productDto> getproductlist(){
			ArrayList<productDto>list = new ArrayList<>();
			String sql = "select *from product";
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
}	

