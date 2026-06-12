package Esercitazione8.forme;

import java.util.ArrayList;

public class Schermo{

    //noi possiamo creare una lista di una classe astratta, ma
    //non possiamo inserire oggetti che non siano estesi da questa
    //altrimenti errore rosso

    ArrayList <Shape> listaShapes;

    public Schermo(){
        this.listaShapes = new ArrayList<>();
    }

    public void aggiungiForma(Shape forma){
        listaShapes.add(forma);
        System.out.println("Aggiunta nuova forma: " + forma.nome);
    }
    
    public void rimuoviForma(Shape forma){
        listaShapes.remove(forma);
        System.out.println("Rimossa forma: " + forma.nome);
        
    }

    public void disegna(){
        System.out.println("==RIDISEGNO==");
        for (Shape shape : listaShapes) {
            System.out.println("=====");
            shape.draw();
            System.out.println("=====");
        }
    }

    public void scalaTutto(double fattore){
        System.out.println("==Scalo Tutto==");
        for (Shape shape : listaShapes) {
            shape.scale(fattore);
        }
    }
}