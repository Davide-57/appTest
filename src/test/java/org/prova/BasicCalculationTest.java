package org.prova;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicCalculationTest {
    @Test
    public void TestDivision(){
        BasicCalculation TestDivision = new BasicCalculation();
        double output = TestDivision.PerfectDivision(20,5);
        assertEquals(4, output, 0);
    }

    @Test
    public void TestSum(){
        BasicCalculation TestSum = new BasicCalculation();
        int output = TestSum.PerfectSum(10,10);
        assertEquals(21, output, 0);
    }
}