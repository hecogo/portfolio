package com.zemoga.portfolio;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.zemoga.portfolio.controller.PortfolioController;
import com.zemoga.portfolio.entity.Portfolio;
import com.zemoga.portfolio.service.PortfolioService;

@ExtendWith(SpringExtension.class)
@WebMvcTest(PortfolioController.class)
class PortfolioApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private PortfolioService portfolioService;

	private long id = 6;

	@Test
	void shouldGetAllPortfolioInfo() throws Exception {
		RequestBuilder request = MockMvcRequestBuilders.get("/api/portfolios");
		MvcResult result = mockMvc.perform(request).andReturn();
		assertThat(result.getResponse().getStatus()).isEqualTo(200);
	}

	@Test
	void shouldGetPortfolioId() throws Exception {
		RequestBuilder request = MockMvcRequestBuilders.get("/api/portfolios?id=", id);
		MvcResult result = mockMvc.perform(request).andReturn();
		assertThat(result.getResponse().getStatus()).isEqualTo(200);
	}

	@Test
	void shouldUpdatePortfolioId() throws Exception {
		shouldGetPortfolioId();
		Portfolio portfolioNew = new Portfolio();
		portfolioNew.setId(id);
		portfolioNew.setName("hcg");
		assertThat(ResponseEntity.status(HttpStatus.CREATED).body(portfolioService.save(portfolioNew)));
	}
}