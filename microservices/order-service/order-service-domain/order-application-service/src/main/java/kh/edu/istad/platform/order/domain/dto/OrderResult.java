package kh.edu.istad.platform.order.domain.dto;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

public record OrderResult(
        UUID orderId,
        UUID trackingId,
        String status,
        BigDecimal totalPrice,
        List<Item> items
) {
    public record Item(
            UUID productId,
            String productName,
            int quantity,
            BigDecimal unitPrice,
            BigDecimal subTotal
    ) {}
}
