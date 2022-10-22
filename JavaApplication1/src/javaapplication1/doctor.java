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

public class doctor extends user{
 
 private int d_id=001;
 private String d_name="Dr. Atif Hafeez";
 
 public int getD_id() {
  return d_id;
 }

 public void setD_id(int d_id) {
  this.d_id = d_id;
 }

 public String getD_name() {
  return d_name;
 }

 public void setD_name(String d_name) {
  this.d_name = d_name;
 }

 public void Choice(){
  System.out.println("Enter your choice:\n1)Check Patient\n2)Return");
  Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        
        
   switch(choice){        
         case 1 -> CheckPatient();
         case 2 -> main(null);
     
   }
 }
 
 public void CheckPatient(){
  patient P = new patient();
  String p_name =P.getP_name();
  int p_id = P.getP_id();
  System.out.println(d_name+" has check patient "+p_name);
 }

}
