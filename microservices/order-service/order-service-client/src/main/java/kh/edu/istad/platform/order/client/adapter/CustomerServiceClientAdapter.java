package kh.edu.istad.platform.order.client.adapter;

import kh.edu.istad.platform.order.client.httpClient.CustomerHttpClient;
import kh.edu.istad.platform.order.domain.dto.OrderResult;
import kh.edu.istad.platform.order.domain.port.out.client.CustomerServiceClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

//@Component
@Service
@RequiredArgsConstructor
public class CustomerServiceClientAdapter implements CustomerServiceClient {

    private final WebClient.Builder webClientBuilder;
    private final CustomerHttpClient customerHttpClient;

    public record GivenName(String givenName){

    }

    @Override
    public Flux<OrderResult> getCustomerNames() {
//        WebClient webClient = webClientBuilder
//                .baseUrl("http://customer-service")
//                .build();
//
//        var response = webClient
//                .get()
//                .uri("/api/customers")
//                .retrieve()
//                .bodyToFlux(GivenName.class);
//        return response.map(GivenName::givenName);
        return customerHttpClient.queryCustomer();
    }
}

