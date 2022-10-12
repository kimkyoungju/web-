package model.boarddao;


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
	

	
	
		public JSONArray bview() {
			JSONArray array = new JSONArray();
			String sql = "select title , writer, day from board";
			try {
				ps = con.prepareStatement(sql);
				rs = ps.executeQuery();
				if(rs.next()) {
					return array;
				}
				
				
			} catch (Exception e) {System.out.println(e);
				// TODO: handle \
			}return array;
		}
}

//2
