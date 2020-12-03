package com.ahc.fpldatasite.domain;

import javax.persistence.*;

@Entity
public class Team {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String name;

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "team")
	private Fantasy fantasy;

	private Integer gamesPlayed;

	private Integer goals;

	private Integer goalsConceded;

	private Integer cleanSheets;

	public Team() {
	}

	public Team(String name, Integer gamesPlayed, Integer goals, Integer goalsConceded, Integer cleanSheets) {
		this.name = name;
		this.gamesPlayed = gamesPlayed;
		this.goals = goals;
		this.goalsConceded = goalsConceded;
		this.cleanSheets = cleanSheets;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Fantasy getFantasy() {
		return fantasy;
	}

	public void setFantasy(Fantasy fantasy) {
		this.fantasy = fantasy;
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

	public Integer getGoalsConceded() {
		return goalsConceded;
	}

	public void setGoalsConceded(Integer goalsConceded) {
		this.goalsConceded = goalsConceded;
	}

	public Integer getCleanSheets() {
		return cleanSheets;
	}

	public void setCleanSheets(Integer cleanSheets) {
		this.cleanSheets = cleanSheets;
	}
}
