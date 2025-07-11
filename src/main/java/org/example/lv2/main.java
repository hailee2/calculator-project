package org.example.lv2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String exit = "";

        do {
            //슷자, 연산기호 입력받기
            int num1 = calculator.scanner1();
            String mathSymbol = calculator.scanner2();
            int num2 = calculator.scanner3();

            // 연산 수행
            calculator.performCalculation(num1, num2, mathSymbol);

            //더 계산할지 입력받기
            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료)");
            exit = scanner.nextLine();

        } while (!exit.equals("exit")); {
            System.out.println("계산기를 종료합니다");
        }
    }
}