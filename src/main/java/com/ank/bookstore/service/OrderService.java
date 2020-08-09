package com.ank.bookstore.service;

import com.ank.bookstore.domain.BillingAddress;
import com.ank.bookstore.domain.Order;
import com.ank.bookstore.domain.Payment;
import com.ank.bookstore.domain.ShippingAddress;
import com.ank.bookstore.domain.ShoppingCart;
import com.ank.bookstore.domain.User;

public interface OrderService {
	Order createOrder(ShoppingCart shoppingCart,
			ShippingAddress shippingAddress,
			BillingAddress billingAddress,
			Payment payment,
			String shippingMethod,
			User user);
	
	Order findOne(Long id);
}
