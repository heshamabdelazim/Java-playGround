/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.second;

/**
 *
 * @author Lenovo
 */
public class Result {
//    private Result_Structure[] allResultsArr = {new Result_Structure(0,0)};
    private Result_Structure[] allResultsArr; //the error is => Cannot store to object array because "this.allResultsArr" is null
//   Result_Structure = new 
//    constructor

    public void  pushingToAllResultsArr (int index, int que, int ans){
        this.allResultsArr[index] = new Result_Structure(que,ans);
        
    }

//    getter ===============
    
    public Result_Structure[] allResultsGetter(){
        return this.allResultsArr;
    }

}
