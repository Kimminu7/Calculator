package com.example.calculator;

public enum OperatorType {

    // (double) a 는 형변환, a.doubleValue()는 같은 의미임 doubleValue는 Number의 객체.
    ADD('+') {
        @Override
        public <T extends Number> double apply(T a, T b) {
            return a.doubleValue() + b.doubleValue();
        }
    },
    SUB('-') {
        @Override
        public <T extends Number> double apply(T a, T b) {
            return a.doubleValue() - b.doubleValue();
        }
    },
    MUL('*') {
        @Override
        public <T extends Number> double apply(T a, T b) {
            return (double) a * (double) b;
        }
    },
    DIV('/') {
        @Override
        public <T extends Number> double apply(T a, T b) {
            if (b.doubleValue() == 0) {
                throw new ArithmeticException("나눗셈 연산에서 분모에 0이 입력될 수 없습니다.");
            } 
            return (double) a / (double) b;
        }
    };

    // 속성 [ enum 타입은 그 위에 enum타입용 메소드가 먼저 와야하는 특성이 있다? ]
    private final char op;
    public abstract <T extends Number> double apply(T a, T b);

    // 생성자
    OperatorType(char op) {
        this.op = op;
    }
    
    public static OperatorType fromChar(char op) {
        return switch (op) {
            case '+' -> ADD;  // -> 는 switch - case 문에서 break; 없이 편하게 개발할수 있음. ( 가독성 ↑ )
            case '-' -> SUB;  // : 처럼 일반적인 switch - case문과는 다르다.
            case '*' -> MUL;
            case '/' -> DIV;
            default -> throw new IllegalStateException("부호를 잘못 입력하였습니다");
        };
    }

}
