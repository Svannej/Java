package Esercitazione8.forme;

public class Square extends Shape{

    double lato;

    public Square(String nome, double lato){
        super(nome);
        this.lato = lato;
    }

    @Override
    public void scale(double factor) {
        this.lato = this.lato * factor;
    }

    public void draw(){
        System.out.println("Lato: " + lato);
    }
}