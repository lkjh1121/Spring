package kr.co.kmarket1.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import kr.co.kmarket1.vo.CategoriesVo;
import kr.co.kmarket1.vo.ProductVo;

@Mapper
@Repository
public interface MainDao {
	
	public List<CategoriesVo> selectCategories();

	public List<ProductVo> selectHit();
	
}