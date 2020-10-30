package com.ahc.fpldatasite.controllers;

import com.ahc.fpldatasite.logic.FfsHtmlTableParser;
import com.ahc.fpldatasite.constants.FfsUrls;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;

@Controller
@RequestMapping("/team")
public class TeamController {

    @RequestMapping({"", "/"})
    public String getIndexPage() {
        return "team/index";
    }

    @RequestMapping("expected")
    public String getExpectedStats(Model model) {
        FfsHtmlTableParser ffsHtmlTableParser = new FfsHtmlTableParser(FfsUrls.TEAM_EXPECTED.url());

        try {
            String table = ffsHtmlTableParser.getTable();
            model.addAttribute("expectedTable", table);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

        return "team/expected";
    }
}
