package Esercitazione4;

import java.util.ArrayList;

public class Es5punto4 {
    
    public static void main(String args[]){

        ArrayList <Integer> interi = new ArrayList<>();

        int a = 1;

        while (a <= 10) {
           
            if (a % 2 == 0 || a == 1) {
            interi.add(a);
           } 

           a++;
        
        }

        System.out.println(interi);

    }

}
