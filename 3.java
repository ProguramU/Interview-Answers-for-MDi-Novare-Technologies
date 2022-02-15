//Jehro F. Alcoba.
//Answer for interview question #3

// Write a program to sort a list of elements using the bubble sort
// algorithm.
// Bubble Sort works by repeatedly swapping the adjacent
// elements if they are in the wrong order.
// Original Array:
// [7, -5, 3, 2, 1, 0, 45]
// Sorted Array
// [-5, 0, 1, 2, 3, 7, 45

// I assume here that we get list values and size from the user. 

import java.util.Scanner;                   //used for getting user input
import java.util.Arrays;                    //used for printing arrays


public class BubbleSort {
    static Scanner scanner = new Scanner(System.in);        //for getting user input
    
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
        
        System.out.print("List before using bubble sort: ");
        System.out.println(Arrays.toString(int_list));              //print list
        
        int temp_int = 0;                                           //placeholder for tempeorary number used for swapping values
        for(int x = 0; x < int_size; x++){                          //Bubble sort algorithm, iterate through int list 
            for(int y = 1; y < (int_size-x); y++){
                if(int_list[y-1] > int_list[y]){                    //if left side is greater than right side, swap values
                    temp_int = int_list[y-1];
                    int_list[y-1] = int_list[y];
                    int_list[y] = temp_int;
                }
            }
        }
        System.out.print("List after sorting using bubble sort: ");
        System.out.println(Arrays.toString(int_list));              //print bubble sorted list
        
    }
}