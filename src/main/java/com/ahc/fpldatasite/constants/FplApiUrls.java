package com.ahc.fpldatasite.constants;

public enum FplApiUrls {
    TEAM_PICK("https://fantasy.premierleague.com/api/my-team/"),
    BOOTSTRAP_DATA("https://fantasy.premierleague.com/api/bootstrap-static/"),
    TEAM_INFORMATION("https://fantasy.premierleague.com/api/entry/");

    private final String url;

    FplApiUrls(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
