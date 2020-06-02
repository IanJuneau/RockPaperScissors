package Base;

import java.util.Scanner;

public class Player {
    public int winCount = 0;

    public Player() {
    
    }

    public int choice() {
        Scanner input = new Scanner(System.in);

        System.out.println("Rock Paper Scissors");

        int choice = input.nextInt();
        switch (choice) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
        }
        System.out.println("That is not an acceptable action. Restarting the round");
        return 3;
    }

    public int win() {
        winCount = winCount + 1;
        return winCount;
    }
}