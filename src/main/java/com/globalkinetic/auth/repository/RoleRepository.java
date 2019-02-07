package com.globalkinetic.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globalkinetic.auth.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
