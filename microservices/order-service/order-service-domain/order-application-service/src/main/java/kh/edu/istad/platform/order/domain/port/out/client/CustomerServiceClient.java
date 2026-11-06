package kh.edu.istad.platform.order.domain.port.out.client;

import kh.edu.istad.platform.order.domain.dto.OrderResult;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

//@Service
public interface CustomerServiceClient {

    Flux<OrderResult> getCustomerNames();

}
