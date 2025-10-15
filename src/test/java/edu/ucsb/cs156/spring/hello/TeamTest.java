package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

    @Test
    public void team_equals_team() {
        assertEquals(team, team);
    }

    @Test
    public void team_equals_different_class() {
        assertFalse(team.equals("not a team"));
    }

    @Test
    public void team_equals_same_name_different_members() {
        Team team1 = new Team("my_team");
        Team team2 = new Team("my_team");
        team2.addMember("Bob the Builder");
        assertFalse(team1.equals(team2));
    }

    @Test
    public void team_equals_different_name_same_members() {
        Team team1 = new Team("team1");
        Team team2 = new Team("team2");
        assertFalse(team1.equals(team2));
    }

    @Test
    public void team_hash_equals_team_hash() {
        Team t = new Team("test");
        int result = t.hashCode();
        int expectedResult = 3556499;
        assertEquals(expectedResult, result);
    }
}
