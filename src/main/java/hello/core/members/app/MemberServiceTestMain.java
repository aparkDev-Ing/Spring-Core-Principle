package hello.core.members.app;

import hello.core.appconfig.AppConfig;
import hello.core.members.domain.Grade;
import hello.core.members.domain.Member;
import hello.core.members.service.MemberService;
import hello.core.members.service.impl.MemberServiceImpl;

//not recommended
public class MemberServiceTestMain {
    private static MemberService memberService = new AppConfig().memberService();

    public static void main(String[] args) {

        Member member = new Member("Aaron", Grade.VIP);
        memberService.join(member);

        Member foundMember = memberService.findMember(member.getId());

        System.out.println(member.getName().equals(foundMember.getName()));
    }
}
