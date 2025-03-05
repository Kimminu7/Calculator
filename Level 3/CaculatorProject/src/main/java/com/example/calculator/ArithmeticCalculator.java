package com.example.calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArithmeticCalculator <T extends Number> {

    private List<Double> record = new ArrayList<>();

    public double calculate(T num1, T num2, OperatorType op) {

        double result = op.apply(num1,num2);
        record.add(result); // 연산 결과 기록 추가함.
        return result;
    }

    public void removeResult() {
        if(!record.isEmpty()) {
            record.remove(0); // 가장 먼저 저장된 값을 삭제함.
        } else {
            System.out.println("연산 결과가 기록되어 있지 않습니다.");
        }
    }

    public List<Double> filterResultsGreaterThan(T value) {
        return record.stream()
                .filter(result -> result > value.doubleValue())
                .collect(Collectors.toList());
    }

    public void setRecord(List<Double> record) {
        this.record = record;
    }

    public List<Double> getRecord() {
        return record;
    }
}


