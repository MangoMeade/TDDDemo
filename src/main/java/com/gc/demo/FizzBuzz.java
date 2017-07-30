package com.gc.demo;

public class FizzBuzz {
    public String fizzBuzz(int input){
        String result = String.valueOf(input);
        if (input % 3 == 0 && input % 5 == 0) {
            result =  "fizz buzz";
        }
        else if (input % 3 == 0) {//divisible by 3
            result = "fizz";
        }
        else if (input % 5 == 0) {//divisible by 5
            result = "buzz";
        }
        return result;
    }
}
