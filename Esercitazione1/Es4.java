package Esercitazione1;

public class Es4 {

    public static void main(String args[]){    
        int gemini = 0;

        for(int i = 50; i <= 100; i++){
            gemini = gemini + i;
        }

        System.out.println("la somma è: " + gemini);
        
        int x = 10;

        while (x > 0) {
            if (x % 2 == 0) {
                System.out.println(x);
            }
            x--;
            
        }
    }
}
