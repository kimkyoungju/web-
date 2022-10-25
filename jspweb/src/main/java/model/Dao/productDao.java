package model.Dao;

import java.util.ArrayList;

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
			return false;
		}
		
		//4. 제품출력[r
		public ArrayList<pcatagoryDto>getproductlist(){
			return null;
		}
}	

