package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    Scanner keyboard = new Scanner(System.in);
        //the variable needed in our project
       double bace;
       double height;
       double area;
        //recive values from user
       System.out.println("Please enter the bace of the triangle");
       bace = keyboard.nextDouble();
       
       System.out.println("Please enter the height of the triangle");
       height = keyboard.nextDouble();
       
       area = (bace * height) / 2;   //determain the area 
       
       //outputs the answer 
        System.out.println("The area if the triangle is");
        System.out.println(area);
    }
    
}
