/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg.week8_05092023.q4;



/**
 *
 * @author willbarnes
 */

//works now
public class q4 {
    
    public static void unique(int[] A) {
        


        int[] C = new int[A.length]; //zeroes
        int c_count = 0;
        C[0] = A[0]; //first value is always unique
        
        for (int a = 0; a < A.length; a++) {
            for (int b = 0; b < A.length; b++) {
                if (A[a] == A[b] && a != b) {
                    //System.out.println("yes: " + A[a] + ", " + A[b]);
                    break;
                } else if (A[a] == A[b] && a == b){
                    //System.out.println("a == b: " + A[a] + ", " + A[b]);
                    C[c_count] = A[b];
                    c_count++;
                }
                
            }
             
        }
        
        for (int c : C) {
            if (c != 0) { System.out.println(c + " "); }
        }
        
    }
    
}
