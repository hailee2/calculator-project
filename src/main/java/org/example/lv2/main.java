package org.example.lv2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String exit = "";

        do {
            //첫번째 숫자 입력받기, 숫자 외 입력시 예외처리
            int num1 = 0; //여기서 선언안해주면 밑에 연산수행 .... 모르겠네 이 개념 다시 복습하기 ****************
                while(true) { //예외 발생 시 다시 처음으로 돌아가도록 루프 설정
                    try {
                        num1 = calculator.scanner1();
                        break; //올바른 값 입력했을 경우 무한 루프 벗어나기
                    } catch (InputMismatchException e) {
                        System.out.println(e.getMessage());
                    }
                }
            //연산기호 입력받기, 기호 외 입력시 예외처리
            String mathSymbol="";
            while(true) {
                try {
                    mathSymbol = calculator.scanner2();
                    break;
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }

            int num2 = 0;
            while(true){
                try {
                    num2 = calculator.scanner3();
                    break;
                } catch (InputMismatchException | IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }

            // 연산 수행
            calculator.performCalculation(num1, num2, mathSymbol);


            //최근 결과 출력
            System.out.println("계산 결과: " + calculator.getLast());
            System.out.println("최근 계산 결과: "+ calculator.getResultHistory());

            //더 계산할지 입력받기
            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료)");
            exit = scanner.nextLine();

        } while (!exit.equals("exit")); {
            System.out.println("계산기를 종료합니다");
        }
    }
}