package com.warimano.exercises.section.ten.genericschallenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class League<T extends Team> {
    private final String name;
    private final List<T> teams = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public boolean addTeam(T team) {
        if (teams.contains(team)) return false;

        teams.add(team);
        return true;
    }

    public void printTeams() {
        System.out.println(this.name + " League teams:");
        Collections.sort(teams);
        for (Team team : teams) {
            System.out.println(team.getName() + " " + team.getScore());
        }
    }

}
