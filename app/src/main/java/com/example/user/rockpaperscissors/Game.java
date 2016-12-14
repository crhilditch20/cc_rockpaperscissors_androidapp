package com.example.user.rockpaperscissors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 * Created by user on 14/12/2016.
 */
public class Game {

    private ArrayList<String> computerChoices;
    private HashMap<String, String> winChecker;

    public Game() {
        computerChoices = new ArrayList<String>();
        winChecker = new HashMap<String, String>();
        setUpChoices();
    }

    private void setUpChoices() {
        String[] choices = {
                "rock",
                "paper",
                "scissors"
        };
        for(String choice : choices){
            computerChoices.add(choice);
        }

        winChecker.put("rock", "scissors");
        winChecker.put("paper", "rock");
        winChecker.put("scissors", "paper");

    }

    public int getChoicesCount(){
        return computerChoices.size();
    }

    public String getValue(String string){
        return winChecker.get(string);
    }

    public String getChoiceAtIndex(int index){
        return computerChoices.get(index);
    }

    public String getRandomChoice(){
        Random rand = new Random();
        int listSize = getChoicesCount();
        int index = rand.nextInt(listSize);
        String choice = getChoiceAtIndex(index);
        return choice;
    }

    public String getWinner(String string){
       String userChoice = string;
        String computerChoice = getRandomChoice();
        String result = "nobody wins";
        if (getValue(userChoice).equals(computerChoice)){
            result = "Cat chose " + computerChoice + ". You win!";
        }
        else if (getValue(computerChoice).equals(userChoice)) {
                result = "Cat chose " + computerChoice + ". Cat wins!";
            }
        else if (userChoice.equals(computerChoice)){
                result = "it's a draw";
        }
        return result;
    }

}
