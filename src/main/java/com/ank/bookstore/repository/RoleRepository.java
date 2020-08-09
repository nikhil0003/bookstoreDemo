package com.ank.bookstore.repository;

import org.springframework.data.repository.CrudRepository;

import com.ank.bookstore.domain.security.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {
	Role findByname(String name);
}
