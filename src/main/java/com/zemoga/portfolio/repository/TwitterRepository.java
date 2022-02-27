package com.zemoga.portfolio.repository;

import java.util.List;

import twitter4j.Status;

public interface TwitterRepository {
	List<Status> getTweetsTimeLine();
}