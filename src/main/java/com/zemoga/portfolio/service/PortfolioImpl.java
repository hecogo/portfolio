package com.zemoga.portfolio.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zemoga.portfolio.entity.Portfolio;
import com.zemoga.portfolio.repository.PortfolioRepository;

@Service
public class PortfolioImpl implements PortfolioService{

	@Autowired
	private PortfolioRepository portfolioRepository;
	
	@Override
	@Transactional(readOnly = true)
	public Iterable<Portfolio> findAll() {
		return portfolioRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Portfolio> findById(Long id) {
		return portfolioRepository.findById(id);
	}

	@Override
	@Transactional
	public Portfolio save(Portfolio portfolio) {
		return portfolioRepository.save(portfolio);
	}
}