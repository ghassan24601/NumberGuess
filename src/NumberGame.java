import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {

        int randomNumber = (int) (Math.random() * 100) + 1;

        System.out.println("I have randomly chosen a number between 1 and 100");

        System.out.println("Try to guess it");
        System.out.println(randomNumber);

        int guesses = 10;

        Scanner scanner = new Scanner(System.in);

        while (guesses > 0){
            int usersGuess = scanner.nextInt();
            if(usersGuess > randomNumber){
                System.out.println("Try a smaller number.");
            } else if (usersGuess < randomNumber){
                System.out.println("Try a bigger number.");
            } else {
                System.out.println("Woot!!");
                break;
            }

            System.out.println("You have " + guesses + " left. Try again!");
            guesses--;
        }

    }

}
