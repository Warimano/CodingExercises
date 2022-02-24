package com.example.warimano.exercises.section.ten.genericschallenge;

public class GenericsMain {
    public static void main(String[] args) {
        FootballTeam sven = new FootballTeam("Sven");
        sven.setScore(7);
        FootballTeam ture = new FootballTeam("Ture");
        ture.setScore(5);
        FootballTeam olof = new FootballTeam("Olof");
        olof.setScore(12);

        FloorballTeam anders = new FloorballTeam("Anders");
        anders.setScore(42);
        FloorballTeam robert = new FloorballTeam("Robert");
        robert.setScore(7);
        FloorballTeam bertil = new FloorballTeam("Bertil");
        bertil.setScore(21);

        League<FootballTeam> footballLeague = new League<>("Champions");
        footballLeague.addTeam(sven);
        footballLeague.addTeam(ture);
        footballLeague.addTeam(olof);
        footballLeague.printTeams();

        League<FloorballTeam> floorballLeague = new League<>("Some name");
        floorballLeague.addTeam(anders);
        floorballLeague.addTeam(robert);
        floorballLeague.addTeam(bertil);
        floorballLeague.printTeams();
    }
}
