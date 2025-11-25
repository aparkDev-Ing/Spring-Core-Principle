package hello.core.discount;

import hello.core.discount.inter.DiscountPolicy;
import hello.core.members.domain.Grade;
import hello.core.members.domain.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class RateDiscountPolicyTest {

    //DiscountPolicy discountPolicy = new FixedDiscountPolicy();

    DiscountPolicy discountPolicy = new RateDiscountPolicy();

    @Test
    @DisplayName("VIP 는 10%할인이 적용되여야 한다.")
    void vip_o(){
        Member member = new Member("Aaron", Grade.VIP);

        int discountPrice = discountPolicy.discount(member,10000);
        assertThat(discountPrice).isEqualTo(1000);
    }


    @Test
    @DisplayName("Basic 은 10%할인이 적용되어서는 안된다.")
    void vip_x(){
        Member member = new Member("Aaron", Grade.BASIC);

        int discountPrice = discountPolicy.discount(member,10000);
        assertThat(discountPrice).isEqualTo(0);
    }

}