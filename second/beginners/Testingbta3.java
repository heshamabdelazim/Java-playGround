/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.second;

/**
 *
 * @author Lenovo
 */
public class Testingbta3 {
    
    
   public boolean findTarget(String [] myArray, String target ){
        //return true or false
        for(int i=0; i<myArray.length; i++){
            if(myArray[i] == target){
                return true; // If true? we get it 
            }
        }               
            return false; //the loop ended without return SO this return will work
    }
    
}
