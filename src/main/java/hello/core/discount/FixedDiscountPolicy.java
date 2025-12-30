package hello.core.discount;

import hello.core.discount.inter.DiscountPolicy;
import hello.core.members.domain.Grade;
import hello.core.members.domain.Member;

public class FixedDiscountPolicy implements DiscountPolicy {
    private final static int FIXED_DISCOUNT_AMOUNT =1000;
    @Override
    public int discount(Member member, int price) {
        if(member.getGrade()== Grade.VIP){
            return FIXED_DISCOUNT_AMOUNT;
        }
        return 0;
    }
}
