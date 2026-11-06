package kh.edu.istad.iamservice.feature.permission;

import kh.edu.istad.iamservice.domain.Permission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PermissionJpaRepository extends JpaRepository<Permission, Long> {
}
