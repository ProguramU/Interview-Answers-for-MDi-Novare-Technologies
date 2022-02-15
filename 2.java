//Jehro F. Alcoba.
//Answer for interview question #2

// Write a method that returns the index of the first occurrence of a
// given integer in a list.
// Assume that the index of the first element in the list is zero.
// If the number does not exist, return -1

// *i am assuming that we get integer size and values of integer list as input from user.
// * i implemented the application using both java List and Array to store a list of integers.


import java.util.Scanner;                   //used for getting user input
import java.util.Arrays;                    //used for printing arrays


public class LinearSearch {
    static Scanner scanner = new Scanner(System.in);        //for getting user input
    
    static int linearSearch(int size,int[] int_list){       //linear search algorithm. 
        int found_int_index = -1;                           //placeholder for result index
        int search_int = 0;                                 //placeholder for integer to be searched in list
        
        System.out.print("Search: ");   
        try{                                                    //get integer to be searched in list
            search_int = scanner.nextInt();
        }catch(Exception e){
            System.out.println("Pleanse input only integer");
        }
        
        for(int x = 0; x < size; x++){                  //search through by list one by one starting from zero
            if(int_list[x] == search_int){
                found_int_index = x;                    //if found, save it to placeholder and break the loop
                break;
            }
        }
        
        return found_int_index;                         //if not found, found_int_index remains at "-1"
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
        System.out.println(Arrays.toString(int_list));                                  //print list
        
        int output = linearSearch(int_size, int_list);                                  //search using linear search alogorithm
        System.out.println("Integer's first occurence found at index = " + output);     //print output
        
    }
}