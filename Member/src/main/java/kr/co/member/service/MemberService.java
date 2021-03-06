package kr.co.member.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.member.dao.MemberDao;
import kr.co.member.vo.MemberVo;

@Service
public class MemberService {

	@Autowired
	private MemberDao dao;
	
	public void insertMember(MemberVo vo) {
		dao.insertMember(vo);
	}
	public MemberVo selectMember(String uid) {
		return dao.selectMember(uid);
	}
	public List<MemberVo> selectMembers(){
		return dao.selectMember();
	}
	public void updateMember(MemberVo vo) {
		dao.updateMember(vo);
	}
	public void deleteMember(String uid) {
		dao.deleteMember(uid);
	}
}