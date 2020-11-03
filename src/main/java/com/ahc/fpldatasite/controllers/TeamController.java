package com.ahc.fpldatasite.controllers;

import com.ahc.fpldatasite.constants.FfsUrls;
import com.ahc.fpldatasite.services.TableParserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;

@Controller
@RequestMapping("/team")
public class TeamController {

    private final TableParserService tableParserService;

    public TeamController(TableParserService tableParserService) {
        this.tableParserService = tableParserService;
    }

    @RequestMapping({"", "/"})
    public String getIndexPage() {
        return "team/index";
    }

    @RequestMapping("fantasy")
    public String getFantasyStats(Model model) {
        try {
            String table = tableParserService.getTable(FfsUrls.TEAM_FANTASY.url());
            model.addAttribute("fantasyTable", table);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return "team/fantasy";
    }

    @RequestMapping("involvement")
    public String getInvolvementStats(Model model) {
        try {
            String table = tableParserService.getTable(FfsUrls.TEAM_INVOLVEMENT.url());
            model.addAttribute("involvementTable", table);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return "team/involvement";
    }

    @RequestMapping("distribution")
    public String getDistributionStats(Model model) {
        try {
            String table = tableParserService.getTable(FfsUrls.TEAM_DISTRIBUTION.url());
            model.addAttribute("distributionTable", table);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return "team/distribution";
    }

    @RequestMapping("threat")
    public String getThreatStats(Model model) {
        try {
            String table = tableParserService.getTable(FfsUrls.TEAM_THREAT.url());
            model.addAttribute("threatTable", table);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return "team/threat";
    }

    @RequestMapping("defending")
    public String getDefendingStats(Model model) {
        try {
            String table = tableParserService.getTable(FfsUrls.TEAM_DEFENDING.url());
            model.addAttribute("defendingTable", table);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return "team/defending";
    }

    @RequestMapping("set-piece")
    public String getSetPieceStats(Model model) {
        try {
            String table = tableParserService.getTable(FfsUrls.TEAM_SET_PIECE.url());
            model.addAttribute("setPieceTable", table);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return "team/set-piece";
    }

    @RequestMapping("discipline")
    public String getDisciplineStats(Model model) {
        try {
            String table = tableParserService.getTable(FfsUrls.TEAM_DISCIPLINE.url());
            model.addAttribute("disciplineTable", table);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return "team/discipline";
    }

    @RequestMapping("expected")
    public String getExpectedStats(Model model) {
        try {
            String table = tableParserService.getTable(FfsUrls.TEAM_EXPECTED.url());
            model.addAttribute("expectedTable", table);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return "team/expected";
    }
}
