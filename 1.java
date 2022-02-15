//Jehro F. Alcoba.
//Answer for interview question #1

//Write a method that identifies a string if it is a palindrome or not.
// For example, 'madam' - it is a palindrome', ‘laptop’ - it is not a
// palindrome, ‘12321’ - it is a palindrome


import java.util.Scanner;                   //used for getting user input
import java.util.InputMismatchException;    //is a type of exception

public class Palindrome {
    static void isPalindrome(String text) {
        text = text.toLowerCase();                      //text converted to lowercase first to prevent logical errors when comparing text and concatenated text
        
        String reversed_text = "";                      //placeholder for reversed text
        
        for(int x = text.length() - 1; x >= 0; x--){    //iterate through the text from last to first, add each character to reversed_text string
            char text_char = text.charAt(x);
            reversed_text = reversed_text + text_char;
        }
        
        if(text.equals(reversed_text)){                               //check if text and reversed_text is the same. Print the result.
            System.out.println(text + " is a palindrome.");
        }else{
            System.out.println(text + " is not a palindrome.");
        }
        
    }
    
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);                               // Create a Scanner object
        
        String text = "";                                                       // placeholder
        boolean running = true;                                                 // status of application
        
        
        System.out.println("============Palindrome Checker============");       
        System.out.println("Type 'exit' to close the application");             //instruction
        
        while(running == true){                                                 //while program is running
            System.out.print("Check if palindrome: ");          
            
            try{                                                                //get user input while checking for exception
                text = scanner.nextLine();
            }catch(InputMismatchException e){
                System.out.println("");
            }
            
            if(text.equals("exit")){                                            // if the word is exit, stop the application. if input is empty, try again. Else, run isPalindrome() method with text as argument.
                System.out.println("Application closed");                           
                running = false;
            }else if(text.equals("")){
                System.out.println("input cant be empty");
            }else{
                isPalindrome(text);
            }
            
        }
        
    }
}