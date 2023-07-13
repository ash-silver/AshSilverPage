package com.example.ashsilverpage.controller;

import com.example.ashsilverpage.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;


    @GetMapping("/home")
    public String home(){

        return "home";
    }

}
