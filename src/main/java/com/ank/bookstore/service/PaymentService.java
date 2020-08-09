package com.ank.bookstore.service;

import com.ank.bookstore.domain.Payment;
import com.ank.bookstore.domain.UserPayment;

public interface PaymentService {
	Payment setByUserPayment(UserPayment userPayment, Payment payment);
}
