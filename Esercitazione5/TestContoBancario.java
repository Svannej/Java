package Esercitazione5;

public class TestContoBancario {
    public static void main(String[] args) {
        
        //creare un conto

        ContoBancario conto1 = new ContoBancario("40181", 180.02);

        ContoBancario conto2 = new ContoBancario("1623");

        conto1.deposita(452.16);
        conto2.deposita(45.56);

        conto1.preleva(42.85);
        conto1.preleva(42000.85);

        

    }
}
