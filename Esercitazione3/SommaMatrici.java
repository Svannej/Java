package Esercitazione3;

public class SommaMatrici {
    public static void main(String args[]){

        double[][] matrice1 = new double[3][5];
        double[][] matrice2 = new double[3][5];
        double[][] risultato = new double[3][5];

        for(int i = 0; i < 3 ; i++){
            for(int j = 0; j < 5; j++){
                matrice1[i][j] = Math.random() * 100;
                matrice2[i][j] = Math.random() * 100;
                risultato[i][j] = matrice1[i][j] + matrice2[i][j];

                System.out.println("--------[" + i +"] [" + j + "]-----------");
                System.out.println("Matrice1 = " + matrice1[i][j]);
                System.out.println("Matrice2 = " + matrice2[i][j]);
                System.out.println("RISULTATO SOMMA = " + risultato[i][j]);
            }
        }



    }
}
