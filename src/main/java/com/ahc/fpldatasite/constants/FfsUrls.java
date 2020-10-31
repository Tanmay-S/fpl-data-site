package com.ahc.fpldatasite.constants;

public enum FfsUrls {
    TEAM_EXPECTED("https://members.fantasyfootballscout.co.uk/team-stats/expected/"),
    TEAM_FANTASY("https://members.fantasyfootballscout.co.uk/team-stats/fantasy-stats/"),
    TEAM_INVOLVEMENT("https://members.fantasyfootballscout.co.uk/team-stats/involvement/"),
    TEAM_DISTRIBUTION("https://members.fantasyfootballscout.co.uk/team-stats/distribution/"),
    TEAM_THREAT("https://members.fantasyfootballscout.co.uk/team-stats/goal-threat/"),
    TEAM_DEFENDING("https://members.fantasyfootballscout.co.uk/team-stats/defending/"),
    TEAM_SET_PIECE("https://members.fantasyfootballscout.co.uk/team-stats/set-pieces/"),
    TEAM_DISCIPLINE("https://members.fantasyfootballscout.co.uk/team-stats/team-discipline/");

    private final String url;

    FfsUrls(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }
}
