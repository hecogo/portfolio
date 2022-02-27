package com.zemoga.portfolio;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.zemoga.portfolio.service.TwitterService;

import twitter4j.Status;

@SpringBootTest
class TwitterTests {

	@Autowired
	private TwitterService twitterService;
	
	@Test
	void shouldGetTimelineTweets() throws Exception {
		List<Status> post = twitterService.getTweetsTimeLine();
		assertThat(post.size() > 0).isTrue();
//		RequestBuilder request = MockMvcRequestBuilders.get("/api/twitter");
//		MvcResult result = mockMvc.perform(request).andReturn();
		//assertThat(result.getResponse().getStatus()).isEqualTo(200);
	}
}