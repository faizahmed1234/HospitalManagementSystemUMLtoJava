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

public class receptionist extends user {

 private int r_id;
 private String r_name;
 
 public void Choice(){
  System.out.println("Enter your choice:\n1)Give Appoint\n2)Generate Bill\n3)Return");
  Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        
        
   switch(choice){        
         case 1 -> GiveAppoint();
         case 2 -> GenerateBill();
         case 3 -> main(null);
   }
   
        
      
  
 }
 public void GenerateBill(){

  billing B = new billing();
  int b_no =B.getB_no();
  String p_name =B.getP_name();
  int p_id = B.getP_id();
  int b_amt = B.getB_amt();
  System.out.println("BillNO: "+b_no +"\n PatientID: "+p_id+"\nPatientName: "+p_name+"\nBillAmount: "+b_amt);
  
 }
 
 public void GiveAppoint(){

  patient P = new patient();
  String p_name =P.getP_name();
  int p_id = P.getP_id();
  doctor D = new doctor();
  int d_id = D.getD_id();
  String d_name = D.getD_name();
  System.out.println("\n PatientID: "+p_id+"\nPatientName: "+p_name+"\nAppointment with Doctor \nDoctorID: "+d_id+
    "\nDoctorName"+d_name);
  
 }
 
}
