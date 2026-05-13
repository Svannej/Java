package Esercitazione2;

public class Es2 {
    
    public static void main(String args[]){

        Rettangolo ret1 = new Rettangolo(10, 20);

        System.out.println("il rettangolo ha lati: " + ret1.latoCorto + " e " + ret1.latoLungo + " la sua area è: " + ret1.Area() + " il perimetro: " + ret1.Perimetro());

    }
}
