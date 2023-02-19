package com.jh.livesubway.service;

import com.jh.livesubway.model.api.database.user.member.Member;
import com.jh.livesubway.model.api.database.user.member.dao.MemberDAO;
import com.jh.livesubway.model.api.database.user.member.dto.MemberVO;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
    private MemberDAO memberDAO;

    public MemberService() {
        memberDAO = new MemberDAO();
    }

    public boolean login(String id, String password) {
        Member member = memberDAO.select(id);
        if(member == null) {
            // ID가 존재하지 않는 경우
            return false;
        } else {
            return member.getPassword().equals(password);
        }
    }

    public boolean register(MemberVO member) {
        Member existingMember = memberDAO.select(member.getId());
        if (existingMember != null) {
            // 이미 가입된 회원이 있는 경우
            return false;
        } else {
            Member newMember = new Member(member.getId(), member.getPassword(), member.getName(), member.getEmail());
            return memberDAO.insert(newMember);
        }
    }


}
