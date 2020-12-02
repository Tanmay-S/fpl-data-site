package com.ahc.fpldatasite.bootstrap;

import com.ahc.fpldatasite.constants.FfsUrls;
import com.ahc.fpldatasite.domain.Fantasy;
import com.ahc.fpldatasite.domain.Team;
import com.ahc.fpldatasite.repositories.TeamRepository;
import com.ahc.fpldatasite.services.TableParserService;
import org.jsoup.nodes.Element;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Iterator;

@Component
public class FfsTeamLoader {

	private static final String EXPR = "tbody>tr";
	private final TeamRepository teamRepository;
	private final TableParserService tableParserService;

	public FfsTeamLoader(TeamRepository teamRepository, TableParserService tableParserService) {
		this.teamRepository = teamRepository;
		this.tableParserService = tableParserService;
	}

	protected void getFantasyData() throws IOException {
		Element table = tableParserService.getTableElement(FfsUrls.TEAM_FANTASY.getUrl());

		for (Element element : table.select(EXPR)) {
			Iterator<Element> tableData = element.select("td").iterator();

			Team team = new Team();
			team.setName(tableData.next().text());
			team.setGamesPlayed(Integer.valueOf(tableData.next().text()));
			team.setGoals(Integer.valueOf(tableData.next().text()));

			Fantasy fantasy = new Fantasy();
			fantasy.setAssists(Integer.valueOf(tableData.next().text()));
			fantasy.setFantasyAssists(Integer.valueOf(tableData.next().text()));
			fantasy.setTotalAssists(Integer.valueOf(tableData.next().text()));

			team.setCleanSheets(Integer.valueOf(tableData.next().text()));
			team.setGoalsConceded(Integer.valueOf(tableData.next().text()));

			fantasy.setOwnGoalsConceded(Integer.valueOf(tableData.next().text()));
			fantasy.setYellowCards(Integer.valueOf(tableData.next().text()));
			fantasy.setRedCards(Integer.valueOf(tableData.next().text()));

			team.setFantasy(fantasy);
			fantasy.setTeam(team);

			teamRepository.save(team);
		}
	}
}
