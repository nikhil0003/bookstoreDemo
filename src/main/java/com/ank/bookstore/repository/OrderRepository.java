package com.ank.bookstore.repository;

import org.springframework.data.repository.CrudRepository;

import com.ank.bookstore.domain.Order;

public interface OrderRepository extends CrudRepository<Order, Long>{

}
