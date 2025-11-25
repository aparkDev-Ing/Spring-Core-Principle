package hello.core.members;

import hello.core.appconfig.AppConfig;
import hello.core.members.domain.Grade;
import hello.core.members.domain.Member;
import hello.core.members.service.MemberService;
import hello.core.members.service.impl.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {

    MemberService memberService;

    @BeforeEach
    void beforeEach(){
        AppConfig appconfig = new AppConfig();
        memberService = appconfig.memberService();
    }

    @Test
    void join(){

        //Given
        Member member = new Member("Aaron", Grade.VIP);

        //when
        memberService.join(member);
        Member foundMember = memberService.findMember(member.getId());

        //System.out.println(member.getId());
        //then
        Assertions.assertThat(member).isEqualTo(foundMember);
    }

    @Test
    void findMember(){

    }
}
