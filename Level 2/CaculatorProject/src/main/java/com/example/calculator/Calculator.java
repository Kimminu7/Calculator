package com.example.calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    private List<Integer> record = new ArrayList<>();

    public int calculate(int num1, int num2, char op) {

        int result = 0;

        switch (op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    throw new ArithmeticException("나눗셈 연산에서 분모에 0이 입력될 수 없습니다.");
                } else {
                    result = num1 / num2;
                    break;
                }
            default:
                throw new RuntimeException("부호를 잘못 입력하였습니다");
        }
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

    public void setRecord(List<Integer> record) {
        this.record = record;
    }

    public List<Integer> getRecord() {
        return record;
    }
}


