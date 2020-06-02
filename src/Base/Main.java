package Base;

import Graphics.*;
import Graphics.Window;

import javax.swing.*;
import java.awt.*;

public class Main{


    public static void main(String[] args) {
        Window window = new Window();

        Player player = new Player();
        AI ai = new AI();

        System.out.println("Type 0 for Rock, 1 for paper, 2 for scissors");

        while(true){
            int p = player.choice();
            int a = ai.choice();

            //If the player selects an action that isn't 0, 1, or 2 then the round resets
            if(p == 3){
                continue;
            }

            //Logic for who wins
            switch(p){
                case 0:
                    switch(a){
                        case 0:
                            System.out.println("Tie");
                            break;
                        case 1:
                            System.out.println("The AI picked Paper: You lose");
                            ai.win();
                            break;
                        case 2:
                            System.out.println("The AI picked Scissors: You win");
                            player.win();
                            break;
                    }
                    break;
                case 1:
                    switch(a){
                        case 0:
                            System.out.println("The AI picked rock: You win");
                            player.win();
                            break;
                        case 1:
                            System.out.println("Tie");
                            break;
                        case 2:
                            System.out.println("The AI picked Scissors: You lose");
                            ai.win();
                            break;
                    }
                    break;
                case 2:
                    switch(a){
                        case 0:
                            System.out.println("The AI picked rock: You lose");
                            ai.win();
                            break;
                        case 1:
                            System.out.println("The AI picked paper: You win");
                            player.win();
                            break;
                        case 2:
                            System.out.println("Tie");
                            break;
                    }
                    break;
            }

            System.out.println("AI: " + ai.winCount + " Player: " + player.winCount);
        }
    }

}