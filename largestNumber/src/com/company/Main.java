package com.company;

public class Main {

    public static void main(String[] args) {

        int number1 =55;
        int number2=56;
        int number3=58;
        /*int largestNumber=number1;


        if(largestNumber< number2){
            largestNumber=number2;

        }
        if(largestNumber<number3){
            largestNumber=number3;

        }
        System.out.println("The largest number is "+ largestNumber);*/

        if (number1>number2 && number1>number3){
            System.out.println("largest number is "+number1);
        }
        else if(number2>number1 && number2>number3){
            System.out.println("largest number is "+number2);
        }
        else {
            System.out.println("largest number is "+number3);
        }

    }

}
