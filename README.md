# 계산기 과제 ( Sparta 6기 )

사칙연산 기호(➕,➖,✖️,➗)를 입력받는 계산기 프로그램 구현  ( 필수, 도전단계 구분 )

## 필수

### Lv 1. 클래스 없이 기본적인 연산을 수행할 수 있는 계산기 만들기

- 양의 정수(0 포함)를 입력받기
- 사칙연산 기호(➕,➖,✖️,➗)를 입력받기
- 위에서 입력받은 양의 정수 2개와 사칙연산 기호를 사용하여 연산을 진행한 후 결과값을 출력하기
- 반복문을 사용하되, 반복의 종료를 알려주는 “exit” 문자열을 입력하기 전까지 무한으로 계산을 진행할 수 있도록 소스 코드를 수정하기

### Lv 2. 클래스를 적용해 기본적인 연산을 수행할 수 있는 계산기 만들기

- 사칙연산을 수행 후, 결과값 반환 메서드 구현 & 연산 결과를 저장하는 컬렉션 타입 필드를 가진 Calculator 클래스를 생성
- Lv 1에서 구현한 App 클래스의 main 메서드에 Calculator 클래스가 활용될 수 있도록 수정
- App 클래스의 main 메서드에서 Calculator 클래스의 연산 결과를 저장하고 있는 컬렉션 필드에 직접 접근하지 못하도록 수정 (캡슐화)
- Calculator 클래스에 저장된 연산 결과들 중 가장 먼저 저장된 데이터를 삭제하는 기능을 가진 메서드를 구현한 후 App 클래스의 main 메서드에 삭제 메서드가 활용될 수 있도록 수정

## 도전

### Lv 3. Enum, 제네릭, 람다 & 스트림을 이해한 계산기 만들기
