/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.second;

/**
 *
 * @author Lenovo
 */
public class TernaryOperator {
//    private int x,y,z;

    private int x;
    private int y;
    private int z;
//
    public  TernaryOperator() {
        System.out.println("Default Constructor method done");
    }
//    
  public  TernaryOperator(int x, int y){
      System.out.println("overloading happened when arguments done so we set the variables");
        this.x=x;
        this.y = y;
        this.z = y/x < 3 ? x+y : x *y ;
    }
  
  public int getterx(){
      return x;
  }
 public int gettery(){
      return y;
  }
  public int getterz(){
      return z;
  }
}
