package kr.co.kmarket1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.kmarket1.dao.MainDao;
import kr.co.kmarket1.vo.CategoriesVo;
import kr.co.kmarket1.vo.ProductVo;

@Service
public class MainService {
	
	@Autowired
	private MainDao dao;
	
	public List<CategoriesVo> selectCategories(){
		return dao.selectCategories();
	}
	
	public List<ProductVo> selectHit() {
		return dao.selectHit();
	}

}