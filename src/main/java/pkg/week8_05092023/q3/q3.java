/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg.week8_05092023.q3;

//import java.awt.Point;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author willbarnes
 */


//not working yet
public class q3 {
    
    
    public static int cisco(int[][] arr) {
        
        //constraints
        if (arr.length < 1 || arr[0].length > 1000) {
            throw new ArithmeticException("not within constraints");
        }
        
        //print
        for (int[] i : arr) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
        System.out.println("");        
        //System.out.println(arr[0].length); //rows
        //System.out.println(arr.length); //cols
        //System.out.println("");
        //System.out.println(arr[2][1]);
     
        //biggest in row array
        //List<List<Integer>> biggestInRow = new ArrayList<>(); //rows
        List<List<Integer[]>> biggestInRow = new ArrayList<>(); //rows
        List<Integer[]> temp = new ArrayList<>();
        int bIR = 0;
        //System.out.println(biggestInRow);
        int rCount=-1;
        int cCount=-1;
        
        for (int[] i : arr) { //rows   
            
            temp.clear();
            bIR = 0;
            rCount++;
            
            for (int j : i) { //row elements
                
                cCount++;
                
                if (j > bIR) {
                    
                    temp.clear();
                    temp.add(new Integer[]{rCount,cCount});
                    bIR = j;
                    
                } else if (j == bIR) {
                    
                    temp.add(new Integer[]{rCount,cCount});
                }

            } 
            biggestInRow.add(temp);
            
            //print
            System.out.println(biggestInRow.get(rCount));

        }
        System.out.println("");
        
        
        //smallest in col array
        List<List<Integer>> smallestInCol = new ArrayList<>(); //rows
        temp.clear();
        int cIC = 0;
   
        
        for (int i = 0; i < arr[0].length; i++) { //cols
            for (int j = 0; j < arr.length; j++) { //rows
                System.out.println(arr[j][i]);
            }
        }
        
        //little dipper
        System.out.println("");
        return -1;
    }
    
    
}
