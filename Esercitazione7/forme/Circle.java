package Esercitazione7.forme;

public class Circle extends Shape {
    
    double raggio;

    public Circle (String nome, double raggio){
        super(nome);
        this.raggio = raggio;
    }

    @Override
    public void scale(double factor) {
        this.raggio = this.raggio * factor;
    }

    public void draw(){
        System.out.println("Raggio: " + raggio);
    }


}
