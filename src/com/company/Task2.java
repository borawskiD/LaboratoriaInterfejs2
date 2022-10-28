package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Task2 {
    Scanner sc = new Scanner(System.in);
    List<Integer> dividers = new ArrayList<>();
    public void run(){
        System.out.println("Podaj liczbe:");
        int number = sc.nextInt();
        divideMe(number);
    }
    private void divideMe(int number){
        for (int i = 1; i < number; i++){
            if (number % i == 0){
                dividers.add(i);
            }
        }
        long sum = dividers.stream().mapToInt(Integer::intValue).sum();
        System.out.print("Ta liczba"  + (sum == number ? " jest " : " nie jest "));
        System.out.print(" doskonala");
        System.out.println();
    }

}
