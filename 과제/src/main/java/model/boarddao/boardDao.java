package model.boarddao;


import java.util.ArrayList;

import org.json.simple.JSONArray;

import com.mysql.cj.xdevapi.JsonArray;

import model.boarddto.dto;

public class boardDao extends dao {

	
	public boolean board(dto dto) {
		String sql = "insert into board (title,writer,content,pw)values(?,?,?,?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1,dto.getTitle());
			ps.setString(2,dto.getWriter());
			ps.setString(3,dto.getContent());
			ps.setString(4,dto.getPw());
			ps.executeUpdate(); 
			return true;	
		}catch (Exception e) {
			System.out.println("등록실패"+e);
		}
		return false;
	}
	

	
	//2. 출력
		public ArrayList<dto>bview(){
			ArrayList<dto>list = new ArrayList<>();
			String sql = "select *from board";
			try {
				ps = con.prepareStatement(sql);
				rs = ps.executeQuery();
				while(rs.next()) {
					dto dto = new dto(
							rs.getInt(1),rs.getString(2),
							rs.getString(3),rs.getString(4),
							rs.getString(5),rs.getString(6),
							rs.getInt(7)
							);
						list.add(dto);	
					
				}return list;
				
				
			} catch (Exception e) {System.out.println(e);
				// TODO: handle \
			}return list;}
		
		//3.개별조회
		
		public dto writerboard(int num) {
			String sql = "select * from board where num = ?;";
			try {
				ps = con.prepareStatement(sql);
				ps.setInt(1,num);
				rs = ps.executeQuery();
				if(rs.next()) {
					dto dto = new dto(
							rs.getInt(1),rs.getString(2),
							rs.getString(3),rs.getString(4),
							rs.getString(5),rs.getString(6),
							rs.getInt(7));
						return dto;
				}
				
			} catch (Exception e) {
				System.out.println(e);
			}return null;
			}
		
		
		//삭제
		
		public boolean delete(int num) {
			
			String sql="delete from board where num="+num;
			try {
				ps = con.prepareStatement(sql);
				int count =	ps.executeUpdate(); 
				if(count==1)	return true;
				} catch (Exception e) {
				System.out.println(e);
			
			}	return false;
			
			
		}



	



}
		
	// 

//2
