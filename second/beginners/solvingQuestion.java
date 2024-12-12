/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.second;

/**
 *
 * @author Lenovo
 */
public class solvingQuestion {
    private int x,y,z;
    
//  constructor method
    public solvingQuestion(){
        System.out.println("default constructor is working");
    }
    
//  constructor method overload  
    public  solvingQuestion(int x, int y){
        System.out.println("constructor method overload is happened");
        this.x=x;
        this.y=y;
        this.z = y/x < 3 ? x+y : x *y ; //when x=4 and y = 9  Then z = 13
    }
    
//    getter methods
    public int gettingx(){
        return this.x;
    }
    public int gettingy(){
        return this.y;
    }
    public int gettingz(){
        return this.z;
    }
}
