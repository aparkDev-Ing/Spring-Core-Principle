package hello.core.order.app;

import hello.core.appconfig.AppConfig;
import hello.core.members.domain.Grade;
import hello.core.members.domain.Member;
import hello.core.members.service.MemberService;
import hello.core.members.service.impl.MemberServiceImpl;
import hello.core.order.dto.Order;
import hello.core.order.service.impl.OrderServiceImpl;
import hello.core.order.service.inter.OrderService;

public class OrderApp {

    static AppConfig appconfig = new AppConfig();

    private static MemberService memberService = appconfig.memberService();

    private static OrderService orderService = appconfig.orderService();

    public static void main(String[] args) {

        Member member = new Member("Aaron", Grade.VIP);

        memberService.join(member);

        Order order = orderService.createOrder(member.getId(),"Apple", 10000);

        System.out.println("Order: "+order);
        System.out.println("Discounted price: "+ order.calculatePrice());

    }
}
