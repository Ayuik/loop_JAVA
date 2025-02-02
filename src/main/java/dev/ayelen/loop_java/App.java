package dev.ayelen.loop_java;

import java.util.List;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        MultipliersSetter multipliersSetter = new MultipliersSetter();
        List<Integer> multipliers = multipliersSetter.setMultipliers();
        
        for (int multiplier : multipliers) {
            int multiplicand = 3;
            Multiplication multiplication = new Multiplication();
            int product = multiplication.multiply(multiplicand, multiplier);
            String message = multiplicand + " * " + multiplier + " = " + product ;
            System.out.println(message);
        }
    }
}
