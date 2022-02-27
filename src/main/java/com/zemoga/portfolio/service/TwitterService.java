package com.zemoga.portfolio.service;

import java.util.List;

import twitter4j.Status;

public interface TwitterService {
	List<Status> getTweetsTimeLine();
}
