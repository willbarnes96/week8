/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg.week8_05092023.q1;
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;

import java.lang.CharSequence;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author willbarnes
 */
public class q1 {

    public static void getSearchResults(String words[], String queries[]) {

        List<List<String>> complete = new ArrayList<>();

        for (String q : queries) {

            List<Character> qTemp = new ArrayList<>();
            int counter = 0;
            int bad_counter = 0;

            List<String> s = new ArrayList<>();

            for (String w : words) {

                for (int i = 0; i < q.length(); i++) {
                    qTemp.add(q.charAt(i));

                }

                for (int k = 0; k < w.length(); k++) {

                    for (Character j : qTemp) {

                        if (w.charAt(k) == j) {
                            counter++;

                            qTemp.remove(j);

                            break;
                        } else {
                            bad_counter++;

                        }

                    }

                    if (bad_counter == w.length()) {
                        bad_counter = 0;
                        counter = 0;
                    } else if (counter == w.length()) {
                        s.add(w);
                        counter = 0;
                        bad_counter = 0;

                    }

                }

            }
            complete.add(s);

        }

        System.out.println(complete);

    }
}
