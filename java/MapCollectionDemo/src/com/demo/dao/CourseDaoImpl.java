package com.demo.dao;

import java.util.Map;
import java.util.HashMap;
public class CourseDaoImpl implements CourseDao {
	static Map<String,Integer> hm;
	static {
		hm=new HashMap<>();
		hm.put("DAC", 240);
		hm.put("DBDA",65);
		hm.put("DTISS",60);
		}
	@Override
	public boolean save(String cname, int capacity) {
		if(hm.containsKey(cname))
			return false;
		hm.put(cname, capacity);
		return true;
	}
	

}

