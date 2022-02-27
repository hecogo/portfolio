package com.zemoga.portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zemoga.portfolio.entity.Portfolio;

@Repository
public interface PortfolioRepository extends JpaRepository<Portfolio, Long>{
	
}
