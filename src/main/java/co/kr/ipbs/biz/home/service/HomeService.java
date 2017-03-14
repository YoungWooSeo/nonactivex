package co.kr.ipbs.biz.home.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.kr.ipbs.biz.home.dao.HomeDao;

@Service
public class HomeService {
	
	@Autowired
	private HomeDao dao;
	
	public HomeService() {
	}
	
	public List<Map<String,String>> homeList(){
		return dao.homeList();
	}
}
