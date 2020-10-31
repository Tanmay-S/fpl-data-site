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
