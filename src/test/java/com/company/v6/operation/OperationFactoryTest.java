package com.company.v6.operation;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.mockito.Matchers.isNull;

public class OperationFactoryTest {
    @Test
    public void shouldReturnAddOperation(){
        OperationFactory operationFactory = new OperationFactory();
        List<Double> inputNumbers = new ArrayList<>();
        inputNumbers.add(10.0);
        inputNumbers.add(20.0);
        Operation operation = operationFactory.getInstance("add",inputNumbers);

        // verify operation is an instance of AddOperation class
        assertThat(operation,instanceOf(AddOperation.class));
    }

    @Test
    public void shouldReturnSubOperation(){
        OperationFactory operationFactory = new OperationFactory();
        List<Double> inputNumbers = new ArrayList<>();
        inputNumbers.add(30.0);
        inputNumbers.add(20.0);
        Operation operation = operationFactory.getInstance("sub",inputNumbers);

        // verify operation is an instance of AddOperation class
        assertThat(operation,instanceOf(SubOperation.class));
    }

    @Test
    public void shouldReturnMulOperation(){
        OperationFactory operationFactory = new OperationFactory();
        List<Double> inputNumbers = new ArrayList<>();
        inputNumbers.add(30.0);
        inputNumbers.add(20.0);
        Operation operation = operationFactory.getInstance("mul",inputNumbers);

        // verify operation is an instance of AddOperation class
        assertThat(operation,instanceOf(MulOperation.class));
    }

    @Test
    public void shouldReturnDivOperation(){
        OperationFactory operationFactory = new OperationFactory();
        List<Double> inputNumbers = new ArrayList<>();
        inputNumbers.add(30.0);
        inputNumbers.add(20.0);
        Operation operation = operationFactory.getInstance("div",inputNumbers);

        // verify operation is an instance of AddOperation class
        assertThat(operation,instanceOf(DivOperation.class));
    }

    @Test
    public void shouldReturnNull(){
        OperationFactory operationFactory = new OperationFactory();
        List<Double> inputNumbers = new ArrayList<>();
        inputNumbers.add(30.0);
        inputNumbers.add(20.0);
        Operation operation = operationFactory.getInstance("mod",inputNumbers);

        // verify operation is an instance of AddOperation class
        assertThat(operation,is(isNull()));
    }
}