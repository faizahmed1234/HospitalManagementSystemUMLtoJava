/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;

public class patient extends user{

 private int p_id=041;
 private String p_name="Faiz Ahmed";
 
 public void Choice(){
  System.out.println("Enter your choice:\n1)Pay Bill\n2)Return");
  Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        
        
   switch(choice){        
         case 1 -> PayBill();
         case 2 -> main(null);
     
   }

 }
 
 public int getP_id() {
  return p_id;
 }

 public void setP_id(int p_id) {
  this.p_id = p_id;
 }

 public String getP_name() {
  return p_name;
 }

 public void setP_name(String p_name) {
  this.p_name = p_name;
 }
 
 public void PayBill(){
  System.out.println("Thanks For Paying Bill");
 }

 
}
