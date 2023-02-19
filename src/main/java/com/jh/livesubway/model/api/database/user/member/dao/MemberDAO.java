package com.jh.livesubway.model.api.database.user.member.dao;

import com.jh.livesubway.model.api.database.user.member.Member;

import java.sql.Connection;

public class MemberDAO {
    private Connection conn;

    public MemberDAO() {
        // DB 연결 설정
    }

    public boolean insert(Member member) {
        // 회원 정보를 DB에 저장하는 메서드
        return false;
    }

    public Member select(String id) {
        // 아이디에 해당하는 회원 정보를 DB에서 조회하는 메서드
        return null;
    }

}
