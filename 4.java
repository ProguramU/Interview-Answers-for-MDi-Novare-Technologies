//Jehro F. Alcoba.
//Answer for interview question #4

// Write a method that returns the largest integer in the list.
// You can assume that the list has at least one element.

// I assume here that we get list values and size from the user. 

import java.util.Scanner;                   //used for getting user input
import java.util.Arrays;                    //used for printing arrays


public class LargestInt {
    static Scanner scanner = new Scanner(System.in);        //for getting user input
    
    static int getLargestInt(int int_list[]){               
        int largest = int_list[0];                          //take first element as largest
        for(int x = 1; x < int_list.length; x++){           //iterate through the list starting from the second element of list
            if(int_list[x] > largest){                      //if value of element is greater than current largest value, take that value and set it as largest.
                largest = int_list[x];
            }
        }   
        return largest;
        
    }
    
    public static void main(String args[]) {                        //main loop
        int int_size = 0;                                           //placeholder for list size
        
        System.out.print("Input list size: ");                  
        try{                                                        //get list size while handling input exceptions
            int_size = scanner.nextInt();
        }catch(Exception e){
            System.out.println("Pleanse input only integer");
        }
       
        int[] int_list = new int[int_size];                             //Create List object with a determined size
        
        for(int x = 0; x < int_size; x++){                              //set each value of list one by one.            
            try{
                System.out.print("List [" + x + "]: ");
                int_list[x] = scanner.nextInt();
            }catch(Exception e){
                System.out.println("Pleanse input only integer");
            }
            
        }
        
        System.out.println(Arrays.toString(int_list));              //print list
        
        int largest_int = getLargestInt(int_list);
        System.out.print("Largest Value in list: " + largest_int);
        
    }
}