package com.nba.modelos;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Player {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToOne
    private Team team;
    private Date birthDate;
    private Position position;

    public Player(Long id, String name, Team team, Date birthDate, Position position) {
        this.id = id;
        this.name = name;
        this.team = team;
        this.birthDate = birthDate;
        this.position = position;
    }

    public Player() {

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

}
