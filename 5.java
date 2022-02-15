//Jehro F. Alcoba.
//Answer for interview question #5

// Write a method that returns 'Fizz' for multiples of three and
// 'Buzz' for the multiples of five.
// For numbers which are multiples of both three and five return
// 'FizzBuzz'.
// For numbers that are neither, return the input number

// I assume that there is only one numerical input

import java.util.Scanner;                   				//used for getting user input


public class FizzBuzz {
    static Scanner scanner = new Scanner(System.in);        //for getting user input
    
    static String fizzBuzzerator(int num){                  //FizzBuzz Algorithm, I used modulo operator to check if value is multiple of 5 and 3       
        if(num%3 == 0){                                     //Check if multiple of 3
            if(num%5 == 0){                                 //if it is multiple of 3, check also if it is multiple of 5
                return "FizzBuzz";                          //return FizzBuzz if multiple of 3 and 5, return 3 if only multiple of 3
            }else{
                return "Fizz";
            }
        }else if(num%5 == 0){                               //check if multiple of 5, return buzz if it is
            return "Buzz";
        }else{
            return Integer.toString(num);                   //else return the integer input.
        }
        
    }
    
    public static void main(String args[]) {                        //main loop
        int num = 0;                                                //placeholder for input
        
        System.out.print("Input integer: ");                  
        try{                                                        //get inputwhile handling input exceptions
            num = scanner.nextInt();
        }catch(Exception e){
            System.out.println("Pleanse input only integer");
        }
        
        System.out.print("Output: ");
        System.out.print(fizzBuzzerator(num));                      //call fizzBuzzerator method and output result
        
    }
}