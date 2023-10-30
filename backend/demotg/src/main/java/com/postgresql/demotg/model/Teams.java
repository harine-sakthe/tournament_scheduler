package com.postgresql.demotg.model;

import java.util.Date;

import jakarta.persistence.*;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")

@Entity
@Table(name = "team_names")

public class Teams {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="teama")
    private String teamA;
    @Column(name="teamb")
    private String teamB;
    @Column(name="teamc")
    private String teamC;
    @Column(name="teamd")
    private String teamD;
    @Column(name="teame")
    private String teamE;
    @Column(name="teamf")
    private String teamF;
    @Column(name="match_date")
    private Date matchDate;

    public Teams(){

    }

    public Teams(Long id, String teamA, String teamB, String teamC, String teamD, String teamE, String teamF, Date matchDate) {
        this.id = id;
        this.teamA = teamA;
        this.teamB = teamB;
        this.teamC = teamC;
        this.teamD = teamD;
        this.teamE = teamE;
        this.teamF = teamF;
        this.matchDate = matchDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTeamA() {
        return teamA;
    }

    public void setTeamA(String teamA) {
        this.teamA = teamA;
    }

    public String getTeamB() {
        return teamB;
    }

    public void setTeamB(String teamB) {
        this.teamB = teamB;
    }

    public String getTeamC() {
        return teamC;
    }

    public void setTeamC(String teamC) {
        this.teamC = teamC;
    }

    public String getTeamD() {
        return teamD;
    }

    public void setTeamD(String teamD) {
        this.teamD = teamD;
    }

    public String getTeamE() {
        return teamE;
    }

    public void setTeamE(String teamE) {
        this.teamE = teamE;
    }

    public String getTeamF() {
        return teamF;
    }

    public void setTeamF(String teamF) {
        this.teamF = teamF;
    }

    public Date getMatchDate() {
        return matchDate;
    }

    public void setMatchDate(Date matchDate) {
        this.matchDate = matchDate;
    }
}
