package kr.co.member.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import kr.co.member.service.MemberService;
import kr.co.member.vo.MemberVo;

@RestController
public class MemberController {

	@Autowired
	private MemberService service;
	
	@ResponseBody
	@GetMapping("/member")
	public List<MemberVo> list() {
		List<MemberVo> members = service.selectMembers();
		return members;
	}
	
	@ResponseBody
	@PostMapping("/member")
	public List<MemberVo> register(MemberVo vo) {
		service.insertMember(vo);
		return service.selectMembers();
	}
	
	@PutMapping("/Member/{uid}")
	public List<MemberVo> modify(@PathVariable("uid") String uid, MemberVo vo) {
		
		vo.setUid(uid);
		
		service.updateMember(vo);
		return service.selectMembers();
	}
	
	@DeleteMapping("/member/{uid}")
	public List<MemberVo> delete(@PathVariable("uid") String uid) {
		service.deleteMember(uid);
		return service.selectMembers();
	}
	
	
}