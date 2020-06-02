package Base;
import java.util.Random;

public class AI {
    public int winCount = 0;
    public AI(){
    }

    public int choice(){
        Random random = new Random();
        int rand = random.nextInt(3);
        switch(rand){
            case 0:
                return 0;
            case 1:
                return 1;
            case  2:
                return 2;
            default :
                System.out.println("Yes messed this up badly");
                return 0;
        }
    }
    public int win(){
        winCount = winCount + 1;
        return winCount;
    }
}