package Esercitazione3;

import java.util.ArrayList;
import java.util.List;

public class Es4punto21 {
    public static void main(String[] args) {
        
        List <Integer> miaLista = new ArrayList<>();    
        
        miaLista.add(1);
        miaLista.add(2);
        miaLista.add(3);

        for(int i = 0; i < miaLista.size(); i++){
            System.out.println("elemento [" + i + "] = " + miaLista.get(i));
        }



    }
}
