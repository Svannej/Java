package Esercitazione4;

public class Es2 {
    public static void main(){

        IntegerSet2 set1 = new IntegerSet2();
        IntegerSet2 set2 = new IntegerSet2();


        System.out.println(set1.toString());

        set1.insertElement(5);
        set1.insertElement(85);
        set1.insertElement(34);
        set1.insertElement(3);
        set1.insertElement(1);
        set1.insertElement(9);



        System.out.println(set1.toString());

        set2.insertElement(45);
        set2.insertElement(52);
        set2.insertElement(4);
        set2.insertElement(3);
        set2.insertElement(1);

        //verificare se riconosce che il numero è già esistente
        set1.insertElement(9);

        //metodo per testare lo union

        IntegerSet2 set3 = set1.unionOfIntegerSet(set2);

        System.out.println(set3.toString());

        IntegerSet2 set4 = set3.intersectionOfIntegerSet(set1);

        System.out.println(set4.toString());

        


    }
}
