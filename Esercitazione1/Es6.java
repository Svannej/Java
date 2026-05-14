package Esercitazione1;

public class Es6 {
    public static void main(String args[]) {

        int somma = 0;
        for (int i = 0; i < args.length; i++) {

            int x = Integer.parseInt(args[i]);
            somma = somma + x;

        }
        
        System.out.println("la somma è: " + somma);

    }

}
