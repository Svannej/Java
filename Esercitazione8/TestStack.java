package Esercitazione8;

public class TestStack {
    public static void main(String[] args) {
        
        Stack stack = new Stack();

        stack.push("primo elem");
        stack.push("Secondo elem");
        stack.push("terzo elem evva");
        stack.push("quarto e assai siamo elem evva");
        System.out.println(stack.toString());
        stack.pop();
        System.out.println(stack.toString());
        
        //riempiamo di 100 elementi
        
        for(int i = 5; i <= 102 ; i++){
            try{

            stack.push("elemento numero" + i );
            }catch(IllegalStateException e){
                System.out.println("Stai sforando il numero, stai sbagliando");
            }
        }
        
        System.out.println(stack.toString());
        System.out.println("ora togliamo tutto");
        
        //rimuovo tutti gli elementi
        
        for(int i = 0; i <= 102 ; i++){
            try{
                stack.pop();
            }catch(IllegalStateException e){
                System.out.println("Stai sforando il numero, hai tolto troppa roba, stai sbagliando");
            }
        }
        
        System.out.println(stack.toString());


        Stack stack2 = new Stack();

        System.out.println(stack.equals(stack2));
        
        stack.push("Piero");
        
        System.out.println(stack.equals(stack2));

    }
}
