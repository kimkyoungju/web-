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
			String sql = "select title , writer, day from board";
			try {
				ps = con.prepareStatement(sql);
				rs = ps.executeQuery();
				while(rs.next()) {
					dto dto = new dto(
							rs.getString(1),rs.getString(2),rs.getInt(3)
							);
							
					
				}
				
				
			} catch (Exception e) {System.out.println(e);
				// TODO: handle \
			}return array;
		}
}

//2
