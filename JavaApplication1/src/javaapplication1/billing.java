/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Administrator
 */
public class billing{

 private final int b_no=32146;
 private final int b_amt=400;
 patient P = new patient();
 String p_name =P.getP_name();
 int p_id = P.getP_id();
 public String getP_name() {
  return p_name;
 }
 public int getB_no() {
  return b_no;
 }
 public int getB_amt() {
  return b_amt;
 }
 public patient getP() {
  return P;
 }
 public int getP_id() {
  return p_id;
 }

 
 
 
}

