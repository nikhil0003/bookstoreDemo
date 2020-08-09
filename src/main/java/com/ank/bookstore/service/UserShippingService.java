package com.ank.bookstore.service;

import com.ank.bookstore.domain.UserShipping;

public interface UserShippingService {
	UserShipping findById(Long id);
	
	void removeById(Long id);
}
