package com.ahc.fpldatasite.constants;

public enum FfsUrls {
    TEAM_EXPECTED("https://members.fantasyfootballscout.co.uk/team-stats/expected/");

    private final String url;

    FfsUrls(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }
}
