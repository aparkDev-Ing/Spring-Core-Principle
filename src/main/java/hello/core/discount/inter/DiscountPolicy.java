package hello.core.discount.inter;

import hello.core.members.domain.Member;

public interface DiscountPolicy {

    int discount(Member member, int price);
}
