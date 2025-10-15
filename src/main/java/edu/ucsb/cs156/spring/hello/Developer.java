package edu.ucsb.cs156.spring.hello;

/**
 * A class with static methods to provide information about the developer.
 */

public class Developer {

    // This class is not meant to be instantiated
    // so we make the constructor private

    private Developer() {}
    
    /**
     * Get the name of the developer
     */

    public static String getName() {
        return "Quinn K.";
    }

    /**
     * Get the github id of the developer
     * @return github id of the developer
     */

    public static String getGithubId() {
        return "quinnkos";
    }

    /**
     * Get the developers team
     * @return developers team as a Java object
     */
    
    public static Team getTeam() {
        Team team = new Team("f25-16");
        team.addMember("OMAR AHMED");
        team.addMember("MIHIR");
        team.addMember("ALEX");
        team.addMember("QUINN THEODORE ROGER");
        team.addMember("SAQIF AYAAN");
        team.addMember("WILLIAM PAUL");
        return team;
    }
}
