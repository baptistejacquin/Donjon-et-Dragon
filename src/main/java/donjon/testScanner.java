package main.java.donjon;

import java.util.Scanner;

public class testScanner {

    public static int nextInt(Scanner scanner){
       String input = scanner.next();
       int returnvalue;
       try{
           returnvalue = Integer.parseInt(input);
       }catch (NumberFormatException e){
           returnvalue =0;
       }
        return returnvalue;
    }
}
