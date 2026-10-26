package kh.edu.istad.platform.order.domain.usecase;

import kh.edu.istad.platform.order.domain.entity.Order;
import kh.edu.istad.platform.order.domain.port.out.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CreateOrderUseCase {

    private final OrderRepository orderRepository;

    public Order create(Order order) {
        order.initializeOrder();
        return orderRepository.save(order);
    }
}
