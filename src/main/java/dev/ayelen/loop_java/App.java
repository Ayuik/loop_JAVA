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
        MultiplicationTable multiplicationTable = new MultiplicationTable();
        List<String> table = multiplicationTable.generateTable(3);
        for (String message : table){
            System.out.println(message);
        }
    }
}
