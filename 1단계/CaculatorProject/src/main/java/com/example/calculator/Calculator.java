package com.example.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // 1단계 클래스 없이 기본적인 연산을 수행할 수 있는 계산기 만들기
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("첫번째 정수를 입력하세요: ");
            int num1 = sc.nextInt();
            System.out.print("두번째 정수를 입력하세요: ");
            int num2 = sc.nextInt();

            System.out.print("사칙연산(+, -, x, /) 기호를 입력하세요: ");
            char operator = sc.next().charAt(0); // 문자열에서 첫 번째 문자만 추출

            int result = 0;

            switch (operator) {
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
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                        break;
                    } else {
                        result = num1 / num2;
                        break;
                    }
                default:
                    System.out.println("부호를 잘못 입력하였습니다.");
            }
            System.out.println("결과 = " + result);

            sc.nextLine(); // 버퍼 비우기 (중요) 엔터값이 남아있어서 초기화 필요함!!

            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료): ");
            String answer = sc.nextLine();

            if (answer.equals("exit")) {
                System.out.println("계산기 시스템을 종료합니다.");
                break;
            }
        }

    }
}
