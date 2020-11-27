package com.ahc.fpldatasite.bootstrap;

import com.ahc.fpldatasite.constants.FfsUrls;
import com.ahc.fpldatasite.domain.Team;
import com.ahc.fpldatasite.repositories.TeamRepository;
import com.ahc.fpldatasite.services.TableParserService;
import org.jsoup.nodes.Element;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Iterator;

@Component
public class FfsTeamLoader {

    private final String expr = "tbody>tr";
    private final TeamRepository teamRepository;
    private final TableParserService tableParserService;

    public FfsTeamLoader(TeamRepository teamRepository, TableParserService tableParserService) {
        this.teamRepository = teamRepository;
        this.tableParserService = tableParserService;
    }

    protected void getFantasyData() throws IOException {
        Element table = tableParserService.getTableElement(FfsUrls.TEAM_FANTASY.getUrl());

        for (Element element : table.select(expr)) {
            Iterator<Element> tableData = element.select("td").iterator();

            Team team = new Team();
            team.setName(tableData.next().text());
            team.setGamesPlayed(Integer.valueOf(tableData.next().text()));
            team.setGoals(Integer.valueOf(tableData.next().text()));
            team.setAssists(Integer.valueOf(tableData.next().text()));
            team.setFantasyAssists(Integer.valueOf(tableData.next().text()));
            team.setTotalAssists(Integer.valueOf(tableData.next().text()));
            team.setCleanSheets(Integer.valueOf(tableData.next().text()));
            team.setGoalsConceded(Integer.valueOf(tableData.next().text()));
            team.setOwnGoalsConceded(Integer.valueOf(tableData.next().text()));
            team.setYellowCards(Integer.valueOf(tableData.next().text()));
            team.setRedCards(Integer.valueOf(tableData.next().text()));

            teamRepository.save(team);
        }
    }
}
