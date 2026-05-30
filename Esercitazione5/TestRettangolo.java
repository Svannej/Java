package Esercitazione5;

public class TestRettangolo {
    public static void main(String[] args) {
        Rettangolo rettangolo1 = new Rettangolo(10.6, 14.8);

        System.out.println("IL RETTANGOLO HA BASE: " + rettangolo1.getBase());
        System.out.println("IL RETTANGOLO HA ALTEZZA: " + rettangolo1.getAltezza());
        System.out.println("IL RETTANGOLO HA PERIMETRO: " + rettangolo1.calcolaPerimetro());
        System.out.println("IL RETTANGOLO HA AREA: " + rettangolo1.calcolaArea());

    }
}
