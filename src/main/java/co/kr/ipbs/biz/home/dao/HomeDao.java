package co.kr.ipbs.biz.home.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HomeDao  {
	
	@Autowired
	private SqlSessionTemplate sqlSession; 
	
	public HomeDao() {
	}
	
	public List<Map<String,String>> homeList(){
		return sqlSession.selectList("selectPrint");
	}
}
