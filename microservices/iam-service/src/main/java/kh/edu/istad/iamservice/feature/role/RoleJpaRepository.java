package kh.edu.istad.iamservice.feature.role;

import kh.edu.istad.iamservice.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleJpaRepository extends JpaRepository<Role, Long> {
}
