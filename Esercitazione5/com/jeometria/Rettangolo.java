package Esercitazione5.com.jeometria;

public class Rettangolo {
    

    //CLASSE IMMUTABILE = valori messi una volta e mai più cambiati
    //final = fa esattamente questo, i valori sono settati e poi immortali
    private final double base;
    private final double altezza;


    public Rettangolo (double base, double altezza){

        //usiamo i metodi per il costruttore
        //perché hanno già i controlli necessari per
        //rifiutare valori errati
        this.base = base;
        this.altezza = altezza;

    }


    //VISTO CHE é UNA CLASSE IMMUTABILE POSSIAMO TENERE
    //SOLO I GETTERS, I SETTERS SPARISCONO

    public double getAltezza() {
        return altezza;
    }

    public double getBase() {
        return base;
    }

    //METODO PER CALCOLARE IL PERIMETRO
    
    public double calcolaPerimetro(){
        double perimetro = altezza + altezza + base + base;
        return perimetro;
    }    
    
    //METODO PER CALCOLARE L'AREA
    public double calcolaArea(){
        double Area = base * altezza; 
        return Area;
    }


}
