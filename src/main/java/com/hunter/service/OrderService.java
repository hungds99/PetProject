package com.hunter.service;

import java.util.List;

import com.hunter.dto.CartDTO;
import com.hunter.model.Customer;

public interface OrderService {

	public void saveOrder(Customer customer, List<CartDTO> carts);
	
}
