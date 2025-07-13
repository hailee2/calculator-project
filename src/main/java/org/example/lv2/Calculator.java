package org.example.lv2;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class Calculator {
    Scanner scanner = new Scanner(System.in);

    //속성
    private int num1;
    private int num2;
    private String mathSymbol;
    private int result;

    //첫번째 숫자 입력받기 (숫자 외 입력시 예외 발생)
    public int scanner1() {
        System.out.print("첫 번째 숫자를 입력하세요 : ");
        if (!scanner.hasNextInt()) {
            scanner.nextLine();  // 잘못된 입력 버퍼에서 제거(int 입력값 받을 때만)
            throw new InputMismatchException("숫자가 아닙니다. 다시 입력해주세요.");
        }else {
            num1 = scanner.nextInt();
            scanner.nextLine();  // 버퍼 비우기
            return num1;
        }
    }

    //연산자 입력 (연산기호 외 입력시 예외 발생)
    public String scanner2() {
        System.out.print("사칙연산 기호(+,-,*,/)를 입력하세요 : ");
        mathSymbol = scanner.nextLine();
        Set<String> allowedOps = Set.of("+", "-", "*", "/"); //연산자 기호 컬렉션에 모아놓기
        if (!allowedOps.contains(mathSymbol)) {  //연산자가 아닌 입력값을 입력했을 시
            throw new IllegalArgumentException("허용되지 않은 연산자입니다."); //예외 만들기
        }
        return mathSymbol;
    }

    //두번째 숫자 입력받기
    public int scanner3() {
        System.out.print("두 번째 숫자를 입력하세요 : ");
        if (!scanner.hasNextInt()) {
            scanner.nextLine();  // 잘못된 입력 버퍼에서 제거(int 입력값 받을 때만)
            throw new InputMismatchException("숫자가 아닙니다. 다시 입력해주세요.");
        }else {
            num2 = scanner.nextInt();
            scanner.nextLine();  // 버퍼 비우기
            if (mathSymbol.equals("/")&& num2 == 0) {
                throw new IllegalArgumentException("나눗셈 두번째 숫자 0은 입력할 수 없습니다. 다시 입력해주세요.");
            }
            return num2;
        }
    }

    //계산수행 메소드
    public void performCalculation(int num1, int num2, String mathSymbol) {

        switch (mathSymbol) {
            case "+":
                this.result = num1 + num2;
                System.out.println("결과 계산 : " + result);
                break;
            case "-":
                this.result = num1 - num2;
                System.out.println("결과 계산 : " + result);
                break;
            case "*":
                this.result = num1 * num2;
                System.out.println("결과 계산 : " + result);
                break;
            case "/":
                if (num2 == 0) {
                    throw new ArithmeticException("0으로 나눌 수 없습니다.");
                } else {
                    this.result = num1 / num2;
                    System.out.println("결과 계산 : " + result);
                }
                break;
            default:
                System.out.println("사칙연산 입력값이 올바르지 않습니다.");
                return;
        };
    }
}