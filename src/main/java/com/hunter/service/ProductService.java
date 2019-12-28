package com.hunter.service;

import java.util.List;

import com.hunter.dto.ProductDTO;
import com.hunter.dto.ProductResponse;
import com.hunter.dto.SearchDTO;
import com.hunter.model.Product;

public interface ProductService {

	public Product findProductById(int id);
	
	public List<ProductDTO> getProductBySearch(SearchDTO searchDTO);
	
	public Product saveAndUpdate(Product product);
	
	public ProductResponse getProductByCategoryId(int categoryId);
	
}
