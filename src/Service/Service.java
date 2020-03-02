package Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Dao.StuDao;

public class Service {
	StuDao sd=new StuDao();
	public Map<String, List> allinfo(){
		Map<String,List> lists = new HashMap<String, List>();
		lists.put("info1", sd.getall());
		return lists;
	}
}
