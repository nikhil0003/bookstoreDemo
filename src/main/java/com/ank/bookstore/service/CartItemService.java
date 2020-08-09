package com.ank.bookstore.service;

import java.util.List;

import com.ank.bookstore.domain.Book;
import com.ank.bookstore.domain.CartItem;
import com.ank.bookstore.domain.Order;
import com.ank.bookstore.domain.ShoppingCart;
import com.ank.bookstore.domain.User;

public interface CartItemService {
	List<CartItem> findByShoppingCart(ShoppingCart shoppingCart);
	
	CartItem updateCartItem(CartItem cartItem);
	
	CartItem addBookToCartItem(Book book, User user, int qty);
	
	CartItem findById(Long id);
	
	void removeCartItem(CartItem cartItem);
	
	CartItem save(CartItem cartItem);
	
	List<CartItem> findByOrder(Order order);
}
