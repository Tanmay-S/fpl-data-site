package com.ahc.fpldatasite.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("mini-league")
public class MiniLeagueController {

    @RequestMapping({"", "/"})
    public String getTeamForm() {
        return "mini-league/index";
    }
}
