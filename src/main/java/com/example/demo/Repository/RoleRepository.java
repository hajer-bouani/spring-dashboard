package com.example.demo.Repository;

import java.util.Optional;

import com.example.demo.model.Role;
import com.example.demo.model.RoleName;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
// Le repository qui contient les methodes JPA pour le model Role
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}