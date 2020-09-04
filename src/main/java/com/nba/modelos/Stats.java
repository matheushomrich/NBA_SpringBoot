package com.nba.modelos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Stats {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double avgMinutes;
    private double avgPoints;
    private double avgRebounds;
    private double avgAssists;
    private double avgSteals;
    private double avgBlocks;
    private double ftPctg;
    private double fgPctg;
    private double threePctg;

    public Stats(Long id, double avgMinutes, double avgPoints, double avgRebounds, double avgAssists, double avgSteals, double avgBlocks, double ftPctg, double fgPctg, double threePctg) {
        this.id = id;
        this.avgMinutes = avgMinutes;
        this.avgPoints = avgPoints;
        this.avgRebounds = avgRebounds;
        this.avgAssists = avgAssists;
        this.avgSteals = avgSteals;
        this.avgBlocks = avgBlocks;
        this.ftPctg = ftPctg;
        this.fgPctg = fgPctg;
        this.threePctg = threePctg;
    }

    public Stats() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getAvgMinutes() {
        return avgMinutes;
    }

    public void setAvgMinutes(double avgMinutes) {
        this.avgMinutes = avgMinutes;
    }

    public double getAvgPoints() {
        return avgPoints;
    }

    public void setAvgPoints(double avgPoints) {
        this.avgPoints = avgPoints;
    }

    public double getAvgRebounds() {
        return avgRebounds;
    }

    public void setAvgRebounds(double avgRebounds) {
        this.avgRebounds = avgRebounds;
    }

    public double getAvgAssists() {
        return avgAssists;
    }

    public void setAvgAssists(double avgAssists) {
        this.avgAssists = avgAssists;
    }

    public double getAvgSteals() {
        return avgSteals;
    }

    public void setAvgSteals(double avgSteals) {
        this.avgSteals = avgSteals;
    }

    public double getAvgBlocks() {
        return avgBlocks;
    }

    public void setAvgBlocks(double avgBlocks) {
        this.avgBlocks = avgBlocks;
    }

    public double getFtPctg() {
        return ftPctg;
    }

    public void setFtPctg(double ftPctg) {
        this.ftPctg = ftPctg;
    }

    public double getFgPctg() {
        return fgPctg;
    }

    public void setFgPctg(double fgPctg) {
        this.fgPctg = fgPctg;
    }

    public double getThreePctg() {
        return threePctg;
    }

    public void setThreePctg(double threePctg) {
        this.threePctg = threePctg;
    }
}
