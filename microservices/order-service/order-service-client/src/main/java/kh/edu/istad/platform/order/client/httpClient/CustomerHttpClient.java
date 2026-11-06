package kh.edu.istad.platform.order.client.httpClient;

import kh.edu.istad.platform.order.domain.dto.OrderResult;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;
import reactor.core.publisher.Flux;

@HttpExchange("/api/customers")
public interface CustomerHttpClient {

    @GetExchange
    Flux<OrderResult> queryCustomer();
}
