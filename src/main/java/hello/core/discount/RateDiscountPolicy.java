package hello.core.discount;

import hello.core.discount.inter.DiscountPolicy;
import hello.core.members.domain.Grade;
import hello.core.members.domain.Member;

public class RateDiscountPolicy implements DiscountPolicy {

    private static int rate = 10;
    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP){
            return price * 10 /100;
        }
        return 0;
    }
}
