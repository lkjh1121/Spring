package kr.co.member.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import kr.co.member.vo.MemberVo;

@Mapper
@Repository
public interface MemberDao {

	public void insertMember(MemberVo vo);
	public MemberVo selectMember(String uid);
	public List<MemberVo> selectMember();
	public void updateMember(MemberVo vo);
	public void deleteMember(String uid);
	
}