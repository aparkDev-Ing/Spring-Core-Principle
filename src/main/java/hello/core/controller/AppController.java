package hello.core.controller;

import com.fasterxml.jackson.databind.annotation.JsonAppend;
import hello.core.members.domain.Member;
import hello.core.members.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLOutput;

@RestController
public class AppController {

    public MemberService memberService;

    @Autowired
    public AppController(MemberService memberService){
        this.memberService=memberService;
    }

    @GetMapping("/")
    public String home(){
        return "Hello";
    }

    @PostMapping("/member/join")
    public Member home(@RequestBody Member member){

        System.out.println("Entered method: "+ "home");
        memberService.join(member);

        System.out.println("Member Created: "+member);
        return member;
    }

}
