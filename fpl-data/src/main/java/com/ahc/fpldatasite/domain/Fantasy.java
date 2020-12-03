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

	private Integer assists;
	private Integer fantasyAssists;
	private Integer totalAssists;
	private Integer ownGoalsConceded;
	private Integer yellowCards;
	private Integer redCards;

	public Fantasy() {
	}

	public Fantasy(Team team, Integer assists, Integer fantasyAssists, Integer totalAssists, Integer ownGoalsConceded,
			Integer yellowCards, Integer redCards) {
		this.team = team;
		this.assists = assists;
		this.fantasyAssists = fantasyAssists;
		this.totalAssists = totalAssists;
		this.ownGoalsConceded = ownGoalsConceded;
		this.yellowCards = yellowCards;
		this.redCards = redCards;
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
