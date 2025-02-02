package dev.ayelen.loop_java;

import java.util.List;

import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;


public class MultiplicationTableTest {

    @Test
    void testMultiplicationTable() {
        //Given
        int multiplicand = 3;

        //When
        MultiplicationTable multiplicationTable = new MultiplicationTable();
        List<String> table = multiplicationTable.generateTable(multiplicand);

        //Then
        assertThat(table, hasItem("3 * 1 = 3"));
        
    }
    
}
