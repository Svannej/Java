package Esercitazione8;

import java.util.LinkedList;
import java.util.Objects;

public class Stack{

    LinkedList <String> lista;
    
    
    public Stack(){
        
        lista = new LinkedList<>();
        
    }
    //gli stack sono di tipo LIFO - Last In First Out
    //quindi il "push" deve aggiungere un elemento in cima: addFirst()

    //dobbiamo implementare l'aggiunzione solo se abbiamo spazio
    void push(String s){
        if (!isFull()) {
            System.out.println("L'elemento: " + s + " è stato aggiunto!");
            lista.addFirst(s);
        }
        else{
            throw new IllegalStateException("Impossibile aggiungere l'elemento: " + s + " capacità massima raggiunta!");
        }
    }

    //stessa cosa deve fare il pop
    String pop(){
        if (!isEmpty()) {
            String ultimo = lista.getFirst();
            lista.removeFirst();
            return ultimo;
        }    
        else{
            throw new IllegalStateException("La Lista è vuota, non ci sono elementi da rimuovere");
        }

    }

    boolean isEmpty(){
        if (lista.isEmpty()) {
            return true;
        }
        else{return false;}
    }

    boolean isFull(){
        if(lista.size() == 100){return true;}
        else{return false;}
    }

    @Override
    public String toString(){

        if (isEmpty()) {
         return "è vacante";   
        }
        
        String stampa = "";

        for (String valore : this.lista) {
            stampa += "=====\n";
            stampa += ": " + valore + " :";
            stampa += "\n=====";
        }

        return stampa;
    }

    //controlla se l'oggetto chiamato e quello inserito sono
    //la stessa cosa fisicamente

    @Override
    public boolean equals(Object ins){

        //1. controllo se l'elemento inserito è nullo
        if (ins == null) {return false;}

        //2. controllo che la tipologia di oggetto sia uguale
        if (ins.getClass() != this.getClass()){return false;}

        //se abbiamo passato questo controlli, procediamo a fare casting

        Stack compareStack = (Stack) ins;

        //non ci resta che fare il controllo finale
        //ovvero comparare le due liste e vedere se sono uguali
        if (Objects.equals(compareStack.lista, this.lista)) {
            return true;
        }
        else{return false;}

    }

}