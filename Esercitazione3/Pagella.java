package Esercitazione3;

public class Pagella {

    //creo dal record studente
    private Studente alunno;
    //definisco una tabella voti
    public String[][] tabellaVoti;
    


    public Pagella(Studente alunno, String[][] tabellaVoti){
        this.alunno = alunno;
        this.tabellaVoti = tabellaVoti;
    }
    
    
    public void datipagella(){
        //devo stampare prima le informazioniAlunno
        String informazioniAlunno = "Nome = " + alunno.nome() + " Cognome = " + alunno.cognome(); 
        System.out.println(informazioniAlunno);
        
        
            //capiamo come impostare la tabella voti:
            //facciamo [0] = materia [1] = voto [2] = giudizio
        for(int i = 0; i < tabellaVoti.length; i++){
            
            System.out.println("[" + tabellaVoti[i][0] + "," + tabellaVoti[i][1] + ", " + tabellaVoti[i][2]);

        }
    
    }

}
