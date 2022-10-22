/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Administrator
 */



import java.util.Scanner;

public class user {
 
 public static void main(String[] args) {
  System.out.println("Enter your choice:\n1)Receptionist\n2)Paient\n3)Doctor\n4)Exit");
  Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        
    do{
   switch(choice){        
         case 1 -> {
             receptionist R = new receptionist();
             R.Choice();
          }
         case 2 -> {
             patient P = new patient();
             P.Choice();
          }
         case 3 -> {        
             doctor D = new doctor();
             D.Choice();
          }
   }
        }while(choice!=4);
     System.out.println("Allah Hafiz :)");
     System.exit(0);
 }
 
}
    

