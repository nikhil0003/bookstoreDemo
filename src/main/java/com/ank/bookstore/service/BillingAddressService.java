package com.ank.bookstore.service;

import com.ank.bookstore.domain.BillingAddress;
import com.ank.bookstore.domain.UserBilling;

public interface BillingAddressService {
	BillingAddress setByUserBilling(UserBilling userBilling, BillingAddress billingAddress);
}
