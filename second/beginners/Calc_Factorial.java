/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.second;

/**
 *
 * @author Lenovo
 */
public class Calc_Factorial extends Result {

    static int index=0;
// constructor

 public Calc_Factorial (int x){
       int ansEveryStep =1; //every step in the loop it will update
      while(x>0){
           ansEveryStep *= x; //5*4*3*2*1
          x--;
    }
      
//      after calc then push to array
      
//     pushingToAllResultsArr(index, x, ansEveryStep); //here there's error => Index 1 out of bounds for length 1
//     index++;
     
    System.out.println(ansEveryStep);
    }      
 }

