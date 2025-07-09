package org.example.lv2;

import java.util.Scanner;

public class Calculator {
    //1.속성
    int num1;
    int num2;
    String mathSymbol;
    int result;

    //2.생성자

    //scanner 메소드
    Scanner scanner = new Scanner(System.in);
    public int scanner1(){
        System.out.println("첫 번째 숫자를 입력하세요 : ");
        int num1 = scanner.nextInt();
        return num1;
    }

    //덧셈 메소드
    public static int add(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

    //3.기능
}
