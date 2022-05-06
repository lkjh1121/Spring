package kr.co.kmarket1.admin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import kr.co.kmarket1.admin.vo.Cate1Vo;
import kr.co.kmarket1.admin.vo.Cate2Vo;
import kr.co.kmarket1.admin.vo.ProductVo;

@Mapper
@Repository
public interface AdminProductDao {
	
	public List<Cate1Vo> selectCate1();
	public List<Cate2Vo> selectCate2(int cate1);
	
	public void insertProduct(ProductVo vo);

}