import java.util.Random;
import java.util.scanner;


public class guessnumber{
    public static void main(String[] args){
        int answer , guess;

        final int max = 100;
        scanner sc = new scanner(system.in);

        Random ran = new Random();
        boolean correct = false;

        answer = ran.nextInt(MAX)+1;

        while(!correct){
            System.out.println("guess a number between 1 and 100:");

            guess = in.nextInt();

            if(guess > answer){
                System.out.println("Too high , try again");
            }
            else if (guess < answer){
                System.out.println("Too low, try again");
            }
            else{
                System.out.println("Yes , you guessed the number.");

                correct = true;
            }
        }
        system.exit(0);
    }
}