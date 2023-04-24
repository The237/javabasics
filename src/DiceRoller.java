import java.util.Random;

public class DiceRoller {
    /**
     * Declared as global because they're outside the
     * constructor
     */
    Random random = new Random();
    int number = 0;
    DiceRoller(){
        roll();
    }

    void roll(){
        number = random.nextInt(6)+1;
        System.out.println(number);
    }
}
