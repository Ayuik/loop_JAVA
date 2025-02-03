package dev.ayelen.loop_java;

import static org.hamcrest.Matchers.contains;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

public class MultipliersSetterTest {

    @Test
    void testSetMultipliers() {
        //Given
        MultipliersSetter multipliersSetter = new MultipliersSetter();
        //When
        List<Integer> multipliers = multipliersSetter.setMultipliers();
        //Then
        assertThat(multipliers, contains(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    }
    
}
