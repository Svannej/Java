package Esercitazione2;

public class Orchestra {
    
    Direttore nomeDirettore;
    
    public Orchestra(Direttore nomeDirettore){
        this.nomeDirettore = nomeDirettore;
    }

    public void cambiaDirettore(Direttore nuovoDirettore){
        nomeDirettore = nuovoDirettore;
    }
}
