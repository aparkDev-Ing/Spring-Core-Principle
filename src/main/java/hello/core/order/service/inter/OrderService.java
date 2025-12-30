package hello.core.order.service.inter;

import hello.core.order.dto.Order;

public interface OrderService {

    Order createOrder(Long memberId, String itemName, int itemPrice);
}
