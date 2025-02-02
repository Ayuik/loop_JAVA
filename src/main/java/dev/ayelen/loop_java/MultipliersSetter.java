package dev.ayelen.loop_java;

import java.util.List;
import java.util.ArrayList;

public class MultipliersSetter {

    public List<Integer> setMultipliers(){
        List<Integer> multipliers = new ArrayList<>(); 
        for (int i = 1; i <= 10; i++){
            int multiplier = i;
            multipliers.add(multiplier);
        }
        return  multipliers;     
        };
    }
