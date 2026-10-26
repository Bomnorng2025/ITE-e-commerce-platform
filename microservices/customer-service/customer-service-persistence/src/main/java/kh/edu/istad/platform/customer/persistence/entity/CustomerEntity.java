package kh.edu.istad.platform.customer.persistence.entity;

import jakarta.persistence.*;
import kh.edu.istad.platform.customer.domain.valueobject.CustomerStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "customers")
public class CustomerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID customerId;

    @Column(length = 100, nullable = false, unique = true)
    private String username;
    @Column(length = 50)
    private String familyName;
    @Column(length = 50)
    private String givenName;

    @Column(length = 100, nullable = false)
    private String email;
    @Column(length = 20)
    private String phoneNumber;

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private CustomerStatus status;
}
