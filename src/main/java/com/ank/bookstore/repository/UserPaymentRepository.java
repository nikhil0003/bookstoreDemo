package com.ank.bookstore.repository;

import org.springframework.data.repository.CrudRepository;

import com.ank.bookstore.domain.UserPayment;

public interface UserPaymentRepository extends CrudRepository<UserPayment, Long>{

}
