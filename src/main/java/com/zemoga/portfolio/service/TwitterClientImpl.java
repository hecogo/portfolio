package com.zemoga.portfolio.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.zemoga.portfolio.repository.TwitterRepository;

import twitter4j.Paging;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

@Component
public class TwitterClientImpl implements TwitterRepository {

	@Override
	public List<Status> getTweetsTimeLine() {
		List<Status> status = null;
		try {
			Paging paging = new Paging(1, 5);
			Twitter singleton = TwitterFactory.getSingleton();
			status = singleton.getUserTimeline(paging);
		} catch (TwitterException e) {
			throw new RuntimeException(e);
		}
		return status;
	}
}