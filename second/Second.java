/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.second;
//import java.util.*;


import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Second {
   public static void main(String[] args) {
       ShoppingCart myCartObject = new ShoppingCart("red");
       System.out.println(myCartObject.myColor);
//      ----------------------------------------
TernaryOperator testing= new TernaryOperator();
      System.out.println(testing);
//      ----------------------------------------      
      solvingQuestion objectTest= new solvingQuestion(4,9);
      System.out.println(objectTest.gettingz());
//      ----------------------------------------
      array arrayObj = new array();
      
      int [] arrayToPass = {1,2,3,4};
      arrayObj.loopingArray( arrayToPass );
   //      ----------------------------------------
    Calc_Factorial ans5= new Calc_Factorial(5); //120
    Calc_Factorial ans6= new Calc_Factorial(6); //720
    Calc_Factorial ans7= new Calc_Factorial(7); //5040
//    System.out.print(ans5.allResultsGetter().length);
   //      ----------------------------------------
   
   
//   Scanner input = new Scanner(System.in) ;
//   int x = input.nextInt();
//   int finalAns=1;
//       while(x>0){
//       finalAns *=x;
//       x--;
//   }
//   System.out.print(finalAns);
   //      ----------------------------------------
   //finding copied elements O(n^2)
//   int[] myArray = {5,3,1,3, 1,2,3,4,5,5};
   int[] myArray = {1,2,3,4,5,5};
   for(int i = 0; i< myArray.length; i++){
          //myArray[0] 
       for(int j= 0+1; j<myArray.length; j++){
           //myArray[0] =5   // myArray[j] =3
           
           if(myArray[i] ==myArray[j]){
               System.out.println(myArray[i]);
               break;
            
           }
       }
   }
   }    
}
