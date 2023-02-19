package com.jh.livesubway.controller.common;

import com.jh.livesubway.model.api.database.user.member.dto.MemberVO;
import com.jh.livesubway.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController {
    @Autowired
    private MemberService memberService;

    @GetMapping("/loginForm")
    public String loginForm(Model model) {
        model.addAttribute("member", new MemberVO());
        return "loginForm";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute("member") MemberVO member, Model model) {
        String id = member.getId();
        String pw = member.getPassword();
        boolean result = memberService.login(id, pw);
        if (result) {
            model.addAttribute("member", member);
            return "redirect:/";
        } else {
            model.addAttribute("message", "아이디 또는 비밀번호가 일치하지 않습니다.");
            return "loginForm";
        }
    }

    @GetMapping("/registerForm")
    public String registerForm(Model model) {
        model.addAttribute("member", new MemberVO());
        return "registerForm";
    }

    @PostMapping("/register")
    public String register(@ModelAttribute("member") MemberVO member, Model model) {
        boolean result = memberService.register(member);
        if(result) {
            return "redirect:/loginForm";
        } else {
            model.addAttribute("message", "회원 가입에 실패했습니다.");
            return "registerForm";
        }
    }
}
