package hello.core.order;

import hello.core.appconfig.AppConfig;
import hello.core.members.domain.Grade;
import hello.core.members.domain.Member;
import hello.core.members.service.MemberService;
import hello.core.members.service.impl.MemberServiceImpl;
import hello.core.order.dto.Order;
import hello.core.order.service.impl.OrderServiceImpl;
import hello.core.order.service.inter.OrderService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OrderServiceTest {

    private static MemberService memberService ;

    private static OrderService orderService ;

    @BeforeEach
    void beforeEach(){
        AppConfig appconfig = new AppConfig();
        memberService = appconfig.memberService();
        orderService = appconfig.orderService();
    }
    @Test
    void createOrder(){

        //Create New Member
        memberService.join(new Member("Aaron", Grade.VIP));

        //Create Order
        Order order = orderService.createOrder(1L,"Apple",10000);

        //Assertions.assertThat(order.calculatePrice()).isEqualTo(9000);

        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);

        //return order;
    }
}
