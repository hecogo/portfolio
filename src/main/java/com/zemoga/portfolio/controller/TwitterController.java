package com.zemoga.portfolio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zemoga.portfolio.service.TwitterService;

import twitter4j.Status;

@RestController
@RequestMapping("/api/twitter")
@CrossOrigin("*")
public class TwitterController {
	@Autowired
	private TwitterService twitterService;
	
	@GetMapping()
	public ResponseEntity<?> readTweets(Model model){
		List<Status> post = twitterService.getTweetsTimeLine();
		return ResponseEntity.ok(post);
	}
}