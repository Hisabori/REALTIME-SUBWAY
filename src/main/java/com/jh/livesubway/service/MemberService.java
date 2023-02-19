package com.jh.livesubway.service;

import com.jh.livesubway.model.api.database.user.member.Member;
import com.jh.livesubway.model.api.database.user.member.dao.MemberDAO;
import com.jh.livesubway.model.api.database.user.member.Member;
import org.springframework.stereotype.Service;

@Service

public class MemberService {
    private MemberDAO memberDAO;

    public MemberService() {
        memberDAO = new MemberDAO();
    }

    public boolean login(String id, String password) {
        MemberDAO memberDAO = new MemberDAO();
            Member member = memberDAO.select(id);
        if(member == null) {
            // ID가 존재하지 않는 경우
            return false;
        } else {
            return member.getPassword().equals(password);
        }
    }

}
