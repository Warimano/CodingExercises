package com.warimano.SectionTenExercises.GenericsChallenge;

public abstract class Team implements Comparable<Team> {
    private String name;
    private int score = 0;

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public int compareTo(Team o) {
        return Integer.compare(o.getScore(), getScore());
    }
}
