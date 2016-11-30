/**
 * Created by mrxuso on 30/11/2016.
 */
public class Main {

    private static final int START_NUMBER = 30;

    public static void main(String[] arg0){
        Collatz collatz = new Collatz(START_NUMBER);

        System.out.print("La sucesción de Collatz de " + START_NUMBER + " tiene " + collatz.getCollatzSequence().size()
         + " términos y es: ");

        for (int i = 0; i < collatz.getCollatzSequence().size(); i++){
            System.out.print(collatz.getCollatzSequence().get(i).toString() + ' ');
        }
    }

}
