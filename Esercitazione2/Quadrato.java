package Esercitazione2;

public class Quadrato {
    int lato;

    //costruttore
    public Quadrato(int lato){
        this.lato = lato;
    }

    //metodo perimetro()

    public int perimetro(){
        
        int perimetroq = lato * 4;
        return perimetroq;

    }

    //metodo area()

    public int area(){
        int areaq = lato * lato;
        return areaq;
    }

    //metodo toString()
    @Override
    public String toString(){

        String descrizione = "il quadrato ha lato: " + lato + " e area: " + area() + " perimetro: " + perimetro();

        return descrizione;

    }

}
