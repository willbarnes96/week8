/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg.week8_05092023.q2;

import java.util.Arrays;

/**
 *
 * @author willbarnes
 */
public class q2 {
    
    public static int solution(int[] A) {
        
        
        //constraints
        if (A.length > 30000) {
            throw new ArithmeticException("array too long \n");
        }
        for (int x : A) {
            if (x > 70000 || x < 0) {
                throw new ArithmeticException("element with value " + x + " is not allowed. \n");
            }
        }
        
        
        int count = 0;
        
        double B[] = new double[A.length]; //temp
        for (int i=0; i < A.length; i++) {
                B[i] = Double.valueOf(A[i]);            
        }
        
        double target = Arrays.stream(A).sum() / 2.00000000; //for fractions
        double current = Arrays.stream(A).sum();
        //System.out.println("target: " + target + "\n");
        
        
        while(true) {
            
            //cond
            
            //System.out.println("current: " + current + "\n");
            if (current <= target) { 
                break;
            }

//            //sort and print
            Arrays.sort(B);
//            for (double i : B) {
//                System.out.print(i + " ");             
//            }
//            System.out.println("");
            
            //add filter to largest one
            B[B.length-1] /= 2.000000000; 
            count++;
            current = 0;
            for (double j: B) {
                current += j;
                //System.out.print(j + " ");             
            }
            //System.out.println("");
            
            
        }
        
        return count;
    }
    
}
