package com.example.demo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class SchedulerService {

	private static final Logger LOG = LoggerFactory.getLogger(SchedulerService.class);

	@Scheduled(initialDelay = 5 * 1000, fixedDelay = 10 * 1000)
	public void taskScheduler() {
		LOG.info("Scheduler Task Started");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		LOG.info("Current Date/Time : {} ", dtf.format(now));
		LOG.info("Scheduler Task Finished");
	}
}
