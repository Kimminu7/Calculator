package com.example.calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // 3. Enum, 제네릭, 람다 & 스트림을 이해한 계산기 만들기
        Scanner sc = new Scanner(System.in);
        ArithmeticCalculator <Number> calculator = new ArithmeticCalculator<>();

        while(true) {
            System.out.print("첫번째 수를 입력하세요(실수 O): ");
            double num1 = sc.nextDouble();
            if (num1 < 0) {
                System.out.println("음수는 입력할수 없습니다.");
                continue;
            }
            System.out.print("두번째 정수를 입력하세요(실수 0): ");
            double num2 = sc.nextDouble();
            if (num2 < 0) {
                System.out.println("음수는 입력할수 없습니다.");
                continue;
            }

            System.out.print("사칙연산(+, -, x, /) 기호를 입력하세요: ");
            char op = sc.next().charAt(0); // 문자열에서 첫 번째 문자만 추출

            try {
                double result = calculator.calculate(num1, num2, OperatorType.fromChar(op));
                System.out.println("결과 = " + result);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            System.out.print("결과 필터링 값 입력 (입력값보다 큰 결과 조회, -1 입력 시 건너뜀): ");
            double filterValue = sc.nextDouble();
            if (filterValue >= 0) {
                System.out.println("필터링된 결과: " + calculator.filterResultsGreaterThan(filterValue));
            }

            sc.nextLine(); // 버퍼 지우기

            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료): ");
            String answer = sc.nextLine();

            if (answer.equals("exit")){
                System.out.println("계산기 시스템을 종료합니다.");
                System.out.println("최종연산 결과 기록 : " + calculator.getRecord());
                break;
            }

            System.out.print("먼저 저장된 연산 결과 기록을 삭제 하겠습니까? (0 입력시 삭제): ");
            String delete = sc.nextLine();
            if (delete.equals("0")) {
                calculator.removeResult();
                System.out.println("가장 먼저 들어온 연산 결과가 삭제 되었습니다.");
            }

            // 저장된 연산 결과값 매회 조회.
            System.out.println(calculator.getRecord());
        }
    }
}
