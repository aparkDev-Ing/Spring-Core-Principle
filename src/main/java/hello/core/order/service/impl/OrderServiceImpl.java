package hello.core.order.service.impl;

import hello.core.discount.FixedDiscountPolicy;
import hello.core.discount.RateDiscountPolicy;
import hello.core.discount.inter.DiscountPolicy;
import hello.core.members.domain.Member;
import hello.core.members.repository.MemberRepository;
import hello.core.members.repository.impl.MemoryMemberRepository;
import hello.core.order.dto.Order;
import hello.core.order.service.inter.OrderService;

public class OrderServiceImpl implements OrderService {

//    private final MemberRepository memberRepository = new
//            MemoryMemberRepository();

    private final MemberRepository memberRepository;
    //private DiscountPolicy discountPolicy = new FixedDiscountPolicy();
//    private DiscountPolicy discountPolicy = new RateDiscountPolicy();
    private DiscountPolicy discountPolicy ;

    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy){
        this.memberRepository=memberRepository;
        this.discountPolicy=discountPolicy;
    }

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {

        Member member = memberRepository.findById(memberId);

        if(member != null){
            int discountPrice = discountPolicy.discount(member,itemPrice);

            return new Order(memberId,itemName,itemPrice,discountPrice);
        }

        throw new RuntimeException("Member not found with ID: "+ memberId);
    }
}
