import java.util.Random;

public class Dice {

    public static void main(String[] args) {
        Random rand = new Random();
        int min = 1;
        int max = 6;
        int loop = 0;
        int diceRollOne = 0;
        int diceRollTwo = 0;
        int diceTotal = 0;
        int prevDiceTotal = 0;

        while (loop < 15000) {
            loop++;
            diceRollOne = rand.nextInt(max - min + 1) + min;
            diceRollTwo = rand.nextInt(max - min + 1) + min;
            diceTotal = diceRollOne + diceRollTwo;

            System.out.println("Dice Roll 1: " + diceRollOne);
            System.out.println("Dice Roll 2: " + diceRollTwo);
            System.out.println("Dice Total: " + diceTotal);
            System.out.println("previous total: " + prevDiceTotal);

            prevDiceTotal = diceTotal;

            if (diceRollOne == diceRollTwo || diceTotal == prevDiceTotal) {
                System.out.println("After " + loop + " loops the");
                System.out.println("Numbers Match, YOU GET NOTHING, YOU LOSE, GOOD DAY SIR!");
                System.exit(0);
            }
        }
    }
}