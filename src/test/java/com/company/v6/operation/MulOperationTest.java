package com.company.v6.operation;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MulOperationTest {

    @Test
    public void mulPositiveWithPossitive(){
                Operation operation = new MulOperation(2,4);
                double result = operation.perform(); //8.0
                assertThat(result,is(8.0));

    }
    @Test
    public void mulPositiveWithNegative(){
        Operation operation = new MulOperation(2,-4);
        double result = operation.perform(); //-8.0
        assertThat(result,is(-8.0));

    }
    @Test
    public void mulZeroWithPossitive(){
        Operation operation = new MulOperation(0,4);
        double result = operation.perform(); //0.0
        assertThat(result,is(0.0));

    }
    @Test
    public void mulZeroWithNegative(){
        Operation operation = new MulOperation(0,-4);
        double result = operation.perform(); //-0.0
        assertThat(result,is(-0.0));

    }
    @Test
    public void mulZeroWithZero(){
        Operation operation = new MulOperation(0,0);
        double result = operation.perform(); //0.0
        assertThat(result,is(0.0));

    }
    @Test
    public void mulNegativeWithNegative(){
        Operation operation = new MulOperation(-2,-4);
        double result = operation.perform(); //-8.0
        assertThat(result,is(8.0));

    }

}