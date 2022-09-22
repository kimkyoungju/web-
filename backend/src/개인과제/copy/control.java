package 개인과제.copy;

public class control {
	
	boolean main(String name_list) {
		 
		randomdto dto = new randomdto(0,name_list);
		randomdao dao = new randomdao();
		return dao.main(dto);
		
		
	}
}
