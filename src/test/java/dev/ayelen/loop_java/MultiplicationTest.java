package dev.ayelen.loop_java;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MultiplicationTest {

    @Test
    @DisplayName("multiply() returns the product of multiplying a multiplicand and a multiplier")
    void testMultiply() {
        //Given
        int multiplicand = 3;
        int  multiplier = 2;
        Multiplication multiplication = new Multiplication();
        //When
        int product = multiplication.multiply(multiplicand, multiplier);
        //Then
        assertThat(product, is(6));
        
    }
    
}
