package com.example.user.rockpaperscissors;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by user on 14/12/2016.
 */
public class GameTest {

    Game game;

    @Before
    public void before() {
        game = new Game();
    }

    @Test
    public void getTestChoicesCount(){
        assertEquals(3, game.getChoicesCount());
    }

    @Test
    public void testGetValue() {
        assertEquals("scissors", game.getValue("rock"));
    }

    @Test
    public void testGetChoiceAtIndex(){
        assertEquals("rock", game.getChoiceAtIndex(0));
    }

    @Test
    public void testGetRandomChoice(){
        String choiceString = game.getRandomChoice();
        System.out.println(choiceString);
        assertNotNull(game.getRandomChoice());
    }

    @Test
    public void testGetWinner(){
        String winnerString = game.getWinner("rock");
        System.out.println(winnerString);
        assertNotNull(game.getWinner("rock"));
    }

    @Test
    public void testSetUpScoreBoard(){
        assertEquals(0, game.getScores("player"));
    }

    @Test
    public void testUpdateScoreBoard(){
        game.updateScoreBoard("player");
        assertEquals(1, game.getScores("player"));
    }
}

