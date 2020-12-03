package com.ahc.fpldatasite.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

	private final FfsTeamLoader ffsTeamLoader;

	public DataLoader(FfsTeamLoader ffsTeamLoader) {
		this.ffsTeamLoader = ffsTeamLoader;
	}

	@Override
	public void run(String... args) throws Exception {
		ffsTeamLoader.getFantasyData();
	}
}
