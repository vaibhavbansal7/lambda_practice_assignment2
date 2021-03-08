package com.knoldus;

import java.util.*;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number = sc.nextLong();
        long nextEvenNumber = (Long) GetNextEven.getNextEvenNumber.apply(number);
        System.out.println("Next Even Number is --"+ " " + nextEvenNumber);
    }
}
