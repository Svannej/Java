package Esercitazione2;

public class Rettangolo{

    //variabili
    int latoCorto;
    int latoLungo;

    //costruttore
    public Rettangolo(int latoCorto, int latoLungo){

        this.latoCorto = latoCorto;
        this.latoLungo = latoLungo;

    }

    //metodi
    public int Perimetro(){
        return latoCorto + latoCorto + latoLungo + latoLungo;
    }

    public int Area(){
        return latoCorto * latoLungo;
    }

}