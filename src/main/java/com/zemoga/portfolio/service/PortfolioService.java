package com.zemoga.portfolio.service;

import java.util.Optional;

import com.zemoga.portfolio.entity.Portfolio;

public interface PortfolioService {
	public Iterable<Portfolio> findAll();
	public Optional<Portfolio> findById(Long id);
	public Portfolio save(Portfolio portfolio);

}
