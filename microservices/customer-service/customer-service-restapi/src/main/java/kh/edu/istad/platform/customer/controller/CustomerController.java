package kh.edu.istad.platform.customer.controller;

import kh.edu.istad.platform.customer.domain.dto.InitiateCustomerResult;
import kh.edu.istad.platform.customer.domain.usecase.InitiateCustomerUseCase;
import kh.edu.istad.platform.customer.dto.CustomerInitiateRequest;
import kh.edu.istad.platform.customer.dto.CustomerInitiateResponse;
import kh.edu.istad.platform.customer.mapper.CustomerWebMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/customers")
public class CustomerController {

    private final InitiateCustomerUseCase initiateCustomerUseCase;
    private final CustomerWebMapper customerWebMapper;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public CustomerInitiateResponse initiateCustomer(
            @RequestBody CustomerInitiateRequest customerInitiateRequest
            ) {

        InitiateCustomerResult result = initiateCustomerUseCase.execute(
                customerWebMapper.toCommand(customerInitiateRequest)
        );

        return customerWebMapper.toResponse(result);
    }

    @GetMapping
    public List<Map<String, Object>> getAllCustomers() {
        return List.of(
                Map.of(
                        "customerId", "7df21d49-e1e7-4890-b542-294c6a978045",
                        "username", "jame",
                        "familyName", "aa",
                        "givenName", "Kanhchana",
                        "email", "nana@gmail.com",
                        "phoneNumber", "08456783"
                ),
                Map.of(
                        "customerId", "80b573ba-fd0b-44ad-a67c-8fea6238f9b9",
                        "username", "koko",
                        "familyName", "kaka",
                        "givenName", "koko",
                        "email", "nana@gmail.com",
                        "phoneNumber", "08456783"
                ),
                Map.of(
                        "customerId", "a85de10f-7552-499c-93c4-a54b4d76a81",
                        "username", "koko",
                        "familyName", "kaka",
                        "givenName", "Koko",
                        "email", "koko@gmail.com",
                        "phoneNumber", "09876509765"
                )
        );
    }
}
