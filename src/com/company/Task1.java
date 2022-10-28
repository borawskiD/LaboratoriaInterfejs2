package com.company;

import java.util.Scanner;

public class Task1 {
    Scanner sc = new Scanner(System.in);
    int[][]matrix;
    public void run(){
        System.out.println("Podaj rozmiar tablicy: ");
        int size = sc.nextInt();
       matrix = new int[size][size];
       setMatrix();
       displayMatrix();
       calcSums();
    }
    public void setMatrix(){
        for (int c = 0; c < matrix.length; c++) {
            for (int r = 0; r < matrix.length; r++) {
                System.out.println("Podaj liczbe do pozycji (" + (r+1) +"," + (c+1) + "):");
                matrix[c][r] = sc.nextInt();
            }
        }
    }
    public void displayMatrix(){
        for (int c = 0; c < matrix.length; c++) {
            for (int r = 0; r < matrix.length; r++) {
                System.out.print(matrix[c][r] + " ");
            }
            System.out.println();
        }
    }
    public void calcSums(){
        int sumTop = 0;
        int sumBottom = 0;
        for (int c = 0; c < matrix.length; c++) {
            for (int r = 0; r < matrix.length; r++) {
                if(c == r) continue;
                if(c < r) sumTop += matrix[c][r];
                if(c > r) sumBottom += matrix[c][r];
            }
            System.out.println();
        }
        System.out.println("Suma liczb ponad glowna przekatna: " + sumTop);
        System.out.println("Suma liczb pod glowna przekatna: " + sumBottom);
        if(sumTop > sumBottom) {
            System.out.println("Wygrywa gorna czesc");
        }else if(sumTop < sumBottom){
            System.out.println("Wygrywa dolna czesc");
        }else{
            System.out.println("Remis");
        }
    }
}
