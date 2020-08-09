package com.ank.bookstore.repository;

import org.springframework.data.repository.CrudRepository;

import com.ank.bookstore.domain.ShoppingCart;

public interface ShoppingCartRepository extends CrudRepository<ShoppingCart, Long> {

}
