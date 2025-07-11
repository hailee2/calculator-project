package org.example.lv2;

import java.util.Scanner;

public class Calculator {
    Scanner scanner = new Scanner(System.in);

    //속성
    private int num1;
    private int num2;
    private String mathSymbol;
    int result;

    //숫자 입력받기
    public int scanner1() {
        System.out.print("첫 번째 숫자를 입력하세요 : ");
        num1 = scanner.nextInt();
        scanner.nextLine();  // 버퍼 비우기
        return num1;
    }

    //연산자 입력
    public String scanner2() {
        System.out.print("사칙연산 기호(+,-,*,/)를 입력하세요 : ");
        mathSymbol = scanner.nextLine();
        return mathSymbol;
    }

    //두번째 숫자 입력받기
    public int scanner3() {
        System.out.print("두 번째 숫자를 입력하세요 : ");
        num2 = scanner.nextInt();
        scanner.nextLine();  // 버퍼 비우기
        return num2;
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
                    System.out.println("나눗셈 연산에서 분모(두 번째 정수)에 0이 입력될 수 없습니다.");
                    return;
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