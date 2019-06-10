package com.company.v6.operation;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class AddOperationTest {
    @Test
    public void addPositiveToPositiveTest(){
        Operation operation = new AddOperation(2,3);
        double result = operation.perform(); // 5.0
        assertThat(result,is(5.0));
    }

    @Test
    public void addPositiveToZeroTest(){
        Operation operation = new AddOperation (1,0);
        double result = operation.perform(); // 1.0
        assertThat(result,is(1.0));
    }

    @Test
    public void addNegativeToZeroTest(){
        Operation operation = new AddOperation (-1,0);
        double result = operation.perform(); // -1.0
        assertThat(result,is(-1.0));
    }

    @Test
    public void addZeroToZeroTest(){
        Operation operation = new AddOperation (0,0);
        double result = operation.perform(); // 0.0
        assertThat(result,is(0.0));
    }
    @Test
    public void addNegativeToNegativeTest(){
        Operation operation = new AddOperation (-3,-2);
        double result = operation.perform(); // -5.0
        assertThat(result,is(-5.0));
    }
}