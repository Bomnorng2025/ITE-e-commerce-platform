package kh.edu.istad.platform.order.client.config;

import kh.edu.istad.platform.order.client.httpClient.BusinessHttpClient;
import kh.edu.istad.platform.order.client.httpClient.CustomerHttpClient;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;
import org.springframework.web.service.registry.HttpServiceGroup;
import org.springframework.web.service.registry.ImportHttpServices;

@Configuration
@ImportHttpServices(
        group = "customer-service",
        types = {
        CustomerHttpClient.class
        },
        clientType = HttpServiceGroup.ClientType.WEB_CLIENT
)
@ImportHttpServices(
        group = "business-service",
        types = BusinessHttpClient.class,
        clientType = HttpServiceGroup.ClientType.WEB_CLIENT
)
//@RequiredArgsConstructor
public class ClientConfig {

//    private final WebClient.Builder webClientBuilder;


//    @Bean
//    public CustomerHttpClient customerHttpClient() {
//
//        WebClient customer = webClientBuilder
//                .baseUrl("http://customer-service")
//                .build();
//
//        HttpServiceProxyFactory factory = HttpServiceProxyFactory
//                .builderFor(WebClientAdapter.create(customer))
//                .build();
//
//        return factory.createClient(CustomerHttpClient.class);
//    }

//    @Bean
//    public CustomerHttpClient customerHttpClient() {
//
//        return createClient("http://customer-service", CustomerHttpClient.class);
//    }
//
////    ===========================
//    private <T> T createClient(String url, Class<T> type) {
//
//        WebClient wbc = webClientBuilder
//                .baseUrl(url)
//                .build();
//
//        HttpServiceProxyFactory factory = HttpServiceProxyFactory
//                .builderFor(WebClientAdapter.create(wbc))
//                .build();
//
//        return factory.createClient(type);
//    }


}
