package com.nuf_tech.mavic_express.repositories;

import com.nuf_tech.mavic_express.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Integer> {

    Optional<Role> findByName(String role);
}
