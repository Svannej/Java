package Esercitazione7.forme;

public class Rectangle extends Shape {
    
    double base;
    double altezza;

    public Rectangle(String nome, double base, double altezza){
        super(nome);
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public void scale(double factor) {
        this.base = this.base * factor;
        this.altezza = this.altezza * factor;
    }

    public void draw(){
        System.out.println("Base: " + base);
        System.out.println("Altezza: " + altezza);
    }


}
