# 📌 계산기 과제  📌

### 사칙연산 기호(➕,➖,✖️,➗)를 입력받는 계산기 프로그램 구현 ( 필수, 도전단계 구분 )
CLI(명령형 인터페이스)로 계산기가 수행되게 진행하였으며, 사용자가 콘솔에 두 정수를 입력하고 사칙연산 부호를 입력해 결과 값을 반환하는 계산기 프로그램 입니다.
#### 기간 : 2025.2.25 ~ 3.6 (14:00)
#### 개발 인원 : 1명 ( 개인 )

## 필수 ⭐

### Lv 1. 클래스 없이 기본적인 연산을 수행할 수 있는 계산기 만들기

<a href="https://dimenshun.tistory.com/14">트러블 슈팅 1단계 TIL</a>

- [ ] 양의 정수(0 포함)를 입력받기 ( 음의 정수 입력시 오류메시지 출력후 다시 정수 입력 하게 구현 )
- [ ] 사칙연산 기호(➕,➖,✖️,➗)를 입력받기
- [ ] 위에서 입력받은 양의 정수 2개와 사칙연산 기호를 사용하여 연산을 진행한 후 결과값을 출력하기
- [ ] 반복문을 사용하되, 반복의 종료를 알려주는 “exit” 문자열을 입력하기 전까지 무한으로 계산을 진행할 수 있도록 소스 코드를 수정하기

### Lv 2. 클래스를 적용해 기본적인 연산을 수행할 수 있는 계산기 만들기

<a href="https://dimenshun.tistory.com/23">트러블 슈팅 2단계 TIL</a>

- [ ] 사칙연산을 수행 후, 결과값 반환 메서드 구현 & 연산 결과를 저장하는 컬렉션 타입 필드를 가진 Calculator 클래스를 생성
- [ ] Lv 1에서 구현한 App 클래스의 main 메서드에 Calculator 클래스가 활용될 수 있도록 수정
- [ ] App 클래스의 main 메서드에서 Calculator 클래스의 연산 결과를 저장하고 있는 컬렉션 필드에 직접 접근하지 못하도록 수정 (캡슐화)
- [ ] Calculator 클래스에 저장된 연산 결과들 중 가장 먼저 저장된 데이터를 삭제하는 기능을 가진 메서드를 구현한 후 App 클래스의 main 메서드에 삭제 메서드가 활용될 수 있도록 수정

## 도전 🔥

### Lv 3. Enum, 제네릭, 람다 & 스트림을 이해한 계산기 만들기

<a href="https://dimenshun.tistory.com/25">트러블 슈팅 3단계 TIL</a>

- [ ]  **현재 사칙연산 계산기는 (➕,➖,✖️,➗) 이렇게 총 4가지 연산 타입으로 구성되어 있습니다.**
    -   Enum 타입을 활용하여 연산자 타입에 대한 정보를 관리하고 이를 사칙연산 계산기 ArithmeticCalculator 클래스에 활용 해봅니다.
- [ ]  **실수, 즉 double 타입의 값을 전달 받아도 연산이 수행하도록 만들기**
    -   키워드 : `제네릭`
        - 단순히, 기존의 Int 타입을 double 타입으로 바꾸는 게 아닌 점에 주의하세요!
    - 지금까지는 ArithmeticCalculator, 즉 사칙연산 계산기는 양의 정수(0 포함)를 매개변수로 전달받아 연산을 수행
    - 피연산자를 여러 타입으로 받을 수 있도록 기능을 확장
        - ArithmeticCalculator 클래스의 연산 메서드(`calculate`)
    - 위 요구사항을 만족할 수 있도록 ArithmeticCalculator 클래스를 수정합니다. (제네릭)
        - 추가적으로 수정이 필요한 다른 클래스나 메서드가 있다면 같이 수정 해주세요.
    
- [ ] **저장된 연산 결과들 중 Scanner로 입력받은 값보다 큰 결과값 들을 출력**

## 📝 개선 사항
- #### (Lv1) 입력을 유도하는 문자열에 곱하기 기호가 x로 되어있는데 실제 곱하기 연산은 * 임. 
   #### → x로 입력 될경우 * 로 replace 해주거나 switch문으로 'x'도 포함 필요
- #### 분모에 0이 들어오면 결과 = 0 이 출력되는 현상.
   #### → 0으로는 입력 받을수 없게 조건문 추가 필요
-  InputMistachException, 숫자를 입력받을 때 오류가 발생하면 프로그램이 종료
   #### → try-catch문으로 예외처리 필요
- #### 
- #### 
- #### 프로젝트별 폴더를 관리함. → 개인과제 이기때문에 상관없지만, 앞으로 팀 프로젝트때 프로젝트는 하나로 하여 Lv은 패키지별로 할것
- #### 커밋 컨벤션을 지키면서 커밋을 할 것 ( 팀 프로젝트시 팀 규칙에 맞게 커밋 컨벤션 작성후 커밋해야함. )
