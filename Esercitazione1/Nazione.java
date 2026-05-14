package Esercitazione1;

public class Nazione {
    String nome;
    String capitale;
    int popolazione;

    //Adesso utulizzo un costruttore perché ci viene chiesto di creare TRE OGGETTI
    //di tipo nazione. Per creare l'oggetto abbiamo bisogno del costruttore

    public Nazione(String nomeScelta, String capitaleScelta, int popolazioneScelta){
        nome = nomeScelta;
        capitale = capitaleScelta;
        popolazione = popolazioneScelta;
    }

    
}
