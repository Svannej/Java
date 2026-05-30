package Esercitazione5;

public class Rettangolo {
    
    private double base;
    private double altezza;


    public Rettangolo (double base, double altezza){

        //usiamo i metodi per il costruttore
        //perché hanno già i controlli necessari per
        //rifiutare valori errati
        setAltezza(altezza);
        setBase(base);

    }

    //getter
    public double getBase() {
        return base;
    }

    public double getAltezza() {
        return altezza;
    }

    //setter
    public void setAltezza(double altezza) {
        
        if (altezza > 0) {
            this.altezza = altezza;
            return;
        }
        System.out.println("Problema di inserimento dell'altezza");
        System.out.println("inserimento di valore temporaneo: 0");
        this.altezza = 0;
    }
    
    public void setBase(double base) {
        
        if (base > 0) {
            this.base = base;
            return;
        }
        System.out.println("Problema di inserimento della base");
        System.out.println("inserimento di valore temporaneo: 0");
        this.base = 0;
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
