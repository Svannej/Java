package Esercitazione4;

import java.util.ArrayList;

public class IntegerSet2 {
    
    // = new Boolean[100] si usa per definire un array finito
    //a noi servono solo gli slot dal 0 al 99

    //boolean con b piccola crea n slot tutti false

    //Boolean con la B maiuscola crea n slot tutti a null


    ArrayList<Integer> set;

    public IntegerSet2(){
        this.set = new ArrayList<>();
    }

    public IntegerSet2 unionOfIntegerSet(IntegerSet2 setConfronto){

        IntegerSet2 nuovoSet = new IntegerSet2();

        for (Integer num : this.set) {
            nuovoSet.insertElement(num);
        }

        for (Integer num : setConfronto.set) {
            nuovoSet.insertElement(num);
        }


        return nuovoSet;

    }

    public IntegerSet2 intersectionOfIntegerSet(IntegerSet2 setConfronto){

        IntegerSet2 nuovoSet = new IntegerSet2();


        for (Integer num : set) {
            if (setConfronto.set.contains(num)) {
                nuovoSet.set.add(num);
            }

        }

        return nuovoSet;


    }



    public void insertElement(int k){
        
        //controllo che l'elemento non sia già in lista

        if(!set.contains(k)){
            set.add(k);
        }
        else{
            System.out.println("il valore è già esistente");
        }


    }


    public void deleteElement(int k){

        if(set.contains(k)){
            set.remove(Integer.valueOf(k));
        }

        else{
            System.out.println("elemento non esistente");
        }

    }


@Override
public String toString(){

    String dati = "Stringa: ";

    //uso il .sort(null) sorta in automatico
    //passando null sto dicendo di non usare nessuna regola particolare

    set.sort(null);

    for (Integer num : set) {

        dati = dati + num + " ";
        
    }



    return dati;
}


}
