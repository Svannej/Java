package Esercitazione5;

public class ContoBancario {
    
    private double saldo;
    private String numeroConto;

    public String getNumeroConto() {
        return numeroConto;
    }

    public double getSaldo() {
        return saldo;
    }

    //dei metodi setter public non sono sicuri


    //OVERLOADING COSTRUTTORI = usare 2 costruttori in "combo"
        //Constructor Chaining

    //costruttore [1] in cui non dichiari un importo iniziale
    public ContoBancario(String numeroConto){
        this.numeroConto = numeroConto;
        this.saldo = 0.0;
    }

    //costruttore [2] in cui viene dichiarato l'importo iniziale
    public ContoBancario(String numeroConto,double saldo){
        this.numeroConto = numeroConto;
        this.saldo = saldo;

    }


    public void deposita(double importo){
        saldo = getSaldo() + importo;
        System.out.println("Saldo: " + saldo + " Depositato: +" + importo);
    }    
    
    public void preleva(double importo){
        if (getSaldo() - importo >= 0) {
            saldo = getSaldo() - importo;
            System.out.println("Saldo: " + saldo + " Prelevato: -" + importo);
            return;
        }
        System.out.println(" Saldo Insufficiente. Saldo attuale : " + saldo);
    }


}
