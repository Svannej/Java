package Esercitazione2;

public class Es4punto14 {
    public static void main(String[] args) {
        Dado dado1 = new Dado();
        Dado dado2 = new Dado();

        for(int i = 0; i < 100; i++){
            int temp1 = dado1.lancia();
            int temp2 = dado2.lancia();
            int tempTot = temp1 + temp2;
            System.out.println("-------------------lancio [" + i + "]");
            System.out.println("dado1 = " + temp1);
            System.out.println("dado2 = " + temp2);
            System.out.println("totale = " + tempTot);
            
            if (tempTot == 12) {
                System.out.println("è uscito 12!");
            }
            //System.out.println(i);
        }

    }
}
