package hello.core.appconfig;

import hello.core.discount.FixedDiscountPolicy;
import hello.core.discount.RateDiscountPolicy;
import hello.core.discount.inter.DiscountPolicy;
import hello.core.members.repository.MemberRepository;
import hello.core.members.repository.impl.MemoryMemberRepository;
import hello.core.members.service.MemberService;
import hello.core.members.service.impl.MemberServiceImpl;
import hello.core.order.service.impl.OrderServiceImpl;
import hello.core.order.service.inter.OrderService;

public class AppConfig {

//    private MemberRepository memberRepository;
//
//    private DiscountPolicy discountPolicy;
//    public AppConfig(){
//        memberRepository = memberRepository();
//        discountPolicy = discountPolicy();
//    }

    public MemberService memberService(){

        return new MemberServiceImpl(memberRepository());
    }

    public OrderService orderService(){
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    public MemberRepository memberRepository(){

        return new MemoryMemberRepository();
    }

    public DiscountPolicy discountPolicy(){
//        return new FixedDiscountPolicy();
        return new RateDiscountPolicy();
    }

}
