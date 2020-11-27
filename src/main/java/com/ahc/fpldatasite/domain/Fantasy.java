package com.ahc.fpldatasite.domain;

import javax.persistence.*;

@Entity
public class Fantasy {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    @JoinColumn(name = "team_id")
    private Team team;

    private Integer gamesPlayed;
    private Integer goals;
    private Integer assists;
    private Integer fantasyAssists;
    private Integer totalAssists;
    private Integer cleanSheets;
    private Integer goalsConceded;
    private Integer ownGoalsConceded;
    private Integer yellowCards;
    private Integer redCards;

    public Fantasy() {
    }

    public Long getId() {
        return id;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Integer getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(Integer gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public Integer getGoals() {
        return goals;
    }

    public void setGoals(Integer goals) {
        this.goals = goals;
    }

    public Integer getAssists() {
        return assists;
    }

    public void setAssists(Integer assists) {
        this.assists = assists;
    }

    public Integer getFantasyAssists() {
        return fantasyAssists;
    }

    public void setFantasyAssists(Integer fantasyAssists) {
        this.fantasyAssists = fantasyAssists;
    }

    public Integer getTotalAssists() {
        return totalAssists;
    }

    public void setTotalAssists(Integer totalAssists) {
        this.totalAssists = totalAssists;
    }

    public Integer getCleanSheets() {
        return cleanSheets;
    }

    public void setCleanSheets(Integer cleanSheets) {
        this.cleanSheets = cleanSheets;
    }

    public Integer getGoalsConceded() {
        return goalsConceded;
    }

    public void setGoalsConceded(Integer goalsConceded) {
        this.goalsConceded = goalsConceded;
    }

    public Integer getOwnGoalsConceded() {
        return ownGoalsConceded;
    }

    public void setOwnGoalsConceded(Integer ownGoalsConceded) {
        this.ownGoalsConceded = ownGoalsConceded;
    }

    public Integer getYellowCards() {
        return yellowCards;
    }

    public void setYellowCards(Integer yellowCards) {
        this.yellowCards = yellowCards;
    }

    public Integer getRedCards() {
        return redCards;
    }

    public void setRedCards(Integer redCards) {
        this.redCards = redCards;
    }
}
