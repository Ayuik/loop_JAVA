package dev.ayelen.loop_java;

import java.util.List;

import static org.hamcrest.Matchers.contains;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;


public class MultiplicationTableTest {

    @Test
    void testMultiplicationTable() {
        //Given
        int multiplicand = 3;
        int multiplier = 1;

        //When
        MultiplicationTable multiplicationTable = new MultiplicationTable();
        List<String> table = multiplicationTable.generateTable(multiplicand, multiplier);

        //Then
        assertThat(table, contains("3 * 1 = 3"));
        
    }
    
}
