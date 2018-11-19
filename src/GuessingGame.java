import java.util.Scanner;

public class GuessingGame {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Guesser guesser = new Guesser(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        guesser.start();

    }



}
