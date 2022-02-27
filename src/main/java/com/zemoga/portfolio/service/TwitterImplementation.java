package com.zemoga.portfolio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zemoga.portfolio.repository.TwitterRepository;

import twitter4j.Status;

@Service
public class TwitterImplementation implements TwitterService {

	@Autowired
	private TwitterRepository twitterRepository;

	@Override
	@Transactional(readOnly = true)
	public List<Status> getTweetsTimeLine() {
		return twitterRepository.getTweetsTimeLine();
	}
}