package kh.edu.istad.platform.order.domain.dto;

import java.util.List;
import java.util.UUID;

public record CreateOrderCommand(
        UUID customerId,
        UUID businessId,
        String street,
        String city,
        String country,
        List<Item> items
) {
    public record Item(
            UUID productId,
            int quantity)
    {}
}
