package com.zemoga.portfolio.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zemoga.portfolio.entity.Portfolio;
import com.zemoga.portfolio.service.PortfolioService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/portfolios")
public class PortfolioController {
	@Autowired
	private PortfolioService portfolioService;

	@GetMapping("/{id}")
	public ResponseEntity<?> read(@PathVariable("id") Long id) {
		Optional<Portfolio> optPortfolio = portfolioService.findById(id);
		if (!optPortfolio.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(optPortfolio);
	}

	@GetMapping
	public ResponseEntity<?> readAll() {
		List<Portfolio> portfolios = StreamSupport.stream(portfolioService.findAll().spliterator(), false)
				.collect(Collectors.toList());
		return ResponseEntity.ok(portfolios);
	}

	@PutMapping("{id}")
	public ResponseEntity<?> update(@RequestBody Portfolio portfolioNew, @PathVariable("id") Long id) {
		Optional<Portfolio> portfolio = portfolioService.findById(id);
		if (!portfolio.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		if (portfolioNew.getExperience() != null)
			portfolio.get().setExperience(portfolioNew.getExperience());
		if (portfolioNew.getImagePath() != null)
			portfolio.get().setImagePath(portfolioNew.getImagePath());
		if (portfolioNew.getName() != null)
			portfolio.get().setName(portfolioNew.getName());
		if (portfolioNew.getTwitterUser() != null)
			portfolio.get().setTwitterUser(portfolioNew.getTwitterUser());
		if (portfolioNew.getEmail() != null)
			portfolio.get().setEmail(portfolioNew.getEmail());
		if (portfolioNew.getAddress() != null)
			portfolio.get().setAddress(portfolioNew.getAddress());
		if (portfolioNew.getPhone() != null)
			portfolio.get().setPhone(portfolioNew.getPhone());
		if (portfolioNew.getZipCode() != null)
			portfolio.get().setZipCode(portfolioNew.getZipCode());

		return ResponseEntity.status(HttpStatus.CREATED).body(portfolioService.save(portfolio.get()));
	}
}