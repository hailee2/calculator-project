package org.example.lv1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String exit;

        do {
            System.out.print("첫 번째 숫자를 입력하세요 : ");
            int num1 = scanner.nextInt();
            scanner.nextLine();  // 개행 문자 제거용

            System.out.print("사칙연산 기호(+,-,*,/)를 입력하세요 : ");
            String mathSymbol = scanner.nextLine();

            System.out.print("두 번째 숫자를 입력하세요 : ");
            int num2 = scanner.nextInt();
            scanner.nextLine();  // 개행 문자 제거


            if (mathSymbol.equals("+")) {
                int result = num1 + num2;
                System.out.println("계산 결과 : " + result);
            } else if (mathSymbol.equals("-")) {
                int result = num1 - num2;
                System.out.println("계산 결과 : " + result);
            } else if (mathSymbol.equals("*")) {
                int result = num1 * num2;
                System.out.println("계산 결과 : " + result);
            } else if (mathSymbol.equals("/") && num2 != 0) {
                int result = num1 / num2;
                System.out.println("계산 결과 : " + result);
            } else if (mathSymbol.equals("/") && num2 == 0) {
                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다");
            } else {
                System.out.println("사칙연산 입력값이 올바르지 않습니다.");
            }

            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료)");
            exit = scanner.nextLine();


        } while (!exit.equals("exit")); {
            System.out.println("계산기를 종료합니다");
        }
    }

}
