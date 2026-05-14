package Esercitazione2;

public class Es4punto2 {

    public static void main(String args[]){
        Direttore dir1 = new Direttore("Blackmore");
        Orchestra orch = new Orchestra(dir1);

        System.out.println("Il direttore dell'orchestra è " + orch.nomeDirettore.nome);
        Direttore dir2 = new Direttore("Lord");
        orch.cambiaDirettore(dir2);
        System.out.println("Il  NUOVO direttore dell'orchestra è " + orch.nomeDirettore.nome);

    }

}
