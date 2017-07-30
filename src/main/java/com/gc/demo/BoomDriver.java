package com.gc.demo;

import java.util.Scanner;

/**
 * Created by michaelgleeson on 7/27/17.
 */
public class BoomDriver {
    public static void main(String[] args) {
        BoomFizz boomFizz = new BoomFizz();
        Scanner scnr = new Scanner(System.in);

        System.out.println("Give me a number and I will find all the numbers divisible by 7 and all the numbers that contain a 7");
        int userInput = scnr.nextInt();

        boomFizz.boom(userInput);
    }
}
