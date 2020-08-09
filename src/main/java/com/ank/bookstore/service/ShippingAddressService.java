package com.ank.bookstore.service;

import com.ank.bookstore.domain.ShippingAddress;
import com.ank.bookstore.domain.UserShipping;

public interface ShippingAddressService {
	ShippingAddress setByUserShipping(UserShipping userShipping, ShippingAddress shippingAddress);
}
