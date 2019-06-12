package com.company.v6.operation;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class DivOperationTest {

    @Test
    public void divPositiveByPositive(){
        Operation operation = new DivOperation(4,2);
        double result = operation.perform(); // 2.0
        assertThat(result,is(2.0));
    }

    @Test
    public void divPositiveByNegative(){
        Operation operation = new DivOperation(4,-2);
        double result = operation.perform(); // -2.0
        assertThat(result,is(-2.0));
    }

    @Test
    public void divZeroByPositive(){
        Operation operation = new DivOperation(0,2);
        double result = operation.perform(); // 0.0
        assertThat(result,is(0.0));
    }

    @Test
    public void divZeroByNegative(){
        Operation operation = new DivOperation(0,-2);
        double result = operation.perform(); // -0.0
        assertThat(result,is(-0.0));
    }
}