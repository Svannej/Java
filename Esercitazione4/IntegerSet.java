package Esercitazione4;

public class IntegerSet {
    
    // = new Boolean[100] si usa per definire un array finito
    //a noi servono solo gli slot dal 0 al 99

    //boolean con b piccola crea n slot tutti false

    //Boolean con la B maiuscola crea n slot tutti a null


    boolean[] set;

    public IntegerSet(){
        this.set = new boolean[100];
    }

    public IntegerSet unionOfIntegerSet(IntegerSet setConfronto){

        IntegerSet nuovoSet = new IntegerSet();

        for(int i = 0; i < 100;i++){

            if (set[i] == true || setConfronto.set[i] == true) {
                nuovoSet.set[i] = true;
            }

            else{
                nuovoSet.set[i] = false;
            }
        }

        return nuovoSet;

    }

    public IntegerSet intersectionOfIntegerSet(IntegerSet setConfronto){

        IntegerSet nuovoSet = new IntegerSet();

        for(int i = 0; i < 100;i++){

            if (set[i] == true && setConfronto.set[i] == true) {
                nuovoSet.set[i] = true;
            }

            else{
                nuovoSet.set[i] = false;
            }
            }

        return nuovoSet;

    }

    public void insertElement(int k){
        
        if (k > 99 || k < 0) {
            System.out.println("numero non accettato");
            return;
        }

        if (set[k] == true) {
            System.out.println("valore già esistente");
            return;
        }

        set[k] = true;


    }


    public void deleteElement(int k){
        
        if (k > 99 || k < 0) {
            System.out.println("numero non accettato");
            return;
        }

        if (set[k] == false) {
            System.out.println("valore già vuoto");
            return;
        }

        set[k] = false;

    }


@Override
public String toString(){

    String dati = "Stringa: ";

    for (int i = 0; i < 100; i++){

        if (set[i] == true) {
            dati = dati + i + " ";
        }

        else{
            dati = dati +  "... ";
        }

    }


    return dati;
}


}
