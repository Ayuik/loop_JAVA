package dev.ayelen.loop_java;

import java.util.List;
import java.util.ArrayList;

public class MultiplicationTable {
    List<String> table = new ArrayList<>();

    public List<String> generateTable(int multiplicand) {
        MultipliersSetter multipliersSetter = new MultipliersSetter();
        List<Integer> multipliers = multipliersSetter.setMultipliers();

        for (int multiplier : multipliers) {
            Multiplication multiplication = new Multiplication();
            int product = multiplication.multiply(multiplicand, multiplier);
            String message = multiplicand + " * " + multiplier + " = " + product;
            table.add(message);
        }

        return table;
    }
}
