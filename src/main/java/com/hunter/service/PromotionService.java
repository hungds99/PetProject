package com.hunter.service;

import java.util.List;

import com.hunter.model.Promotion;

public interface PromotionService {

	public List<Promotion> findAllPromotion();
	
	public void saveOrUpdate(Promotion promotion);
	
	public Promotion findById(int id);
	
}
