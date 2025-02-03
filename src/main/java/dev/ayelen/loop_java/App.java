package dev.ayelen.loop_java;

import java.util.List;


public final class App {
    private App() {
    }

    public static void main(String[] args) {
        MultiplicationTable multiplicationTable = new MultiplicationTable();
        List<String> table = multiplicationTable.generateTable(3);
        for (String message : table){
            System.out.println(message);
        }
    }
}
