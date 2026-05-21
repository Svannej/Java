package Esercitazione3;

public class Es3 {
    public static void main(String args[]){

        Persona p1 = new Persona("Pietro", "Sermonti", 58);

        System.out.println("UOMO DELL'ANNO: " + p1.toString());

        Persona p2 = new Persona("Pietro", "Sermonti", 58);

        System.out.println("UOMO DELL'ANNO nummero due: " + p2.toString());

        System.out.println("Sono la stessa persona???");

        if (p1.equals(p2) == true) {
            System.out.println("SII");
        }
        else{
            System.out.println("NOO");
        }
    }
}
