package Esercitazione8.forme;

public abstract class Shape implements Scalable, Drawable {

    String nome;

    public Shape(String nome){
        this.nome = nome;
    }

}