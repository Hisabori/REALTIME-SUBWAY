package com.jh.livesubway.controller.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jh.livesubway.model.api.database.user.member.Member;
import com.jh.livesubway.model.api.database.user.member.dao.MemberDAO;
import com.jh.livesubway.service.MemberService;

@Controller
@RequestMapping("/member")
public class LoginController {
    @Autowired
    private MemberService memberService;
    private MemberDAO memberDAO;

    public LoginController() {
        memberDAO = new MemberDAO();
    }

    @RequestMapping(value = "/login.do", method = RequestMethod.GET)
    public String loginForm(Model model) {
        model.addAttribute("member", new Member());
        return "/user/login.jsp";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@ModelAttribute("member") Member member, HttpSession session, Model model) {
        String id = member.getId();
        String password = member.getPassword();
        Member memberInfo = memberDAO.select(id);
        if (memberInfo == null || !memberInfo.getPassword().equals(password)) {
            model.addAttribute("error", "아이디 또는 비밀번호가 일치하지 않습니다.");
            return "/user/login.jsp";
        } else {
            session.setAttribute("member", memberInfo);
            return "redirect:/";
        }
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(HttpSession session) {
        session.removeAttribute("member");
        return "redirect:/";
    }
}
