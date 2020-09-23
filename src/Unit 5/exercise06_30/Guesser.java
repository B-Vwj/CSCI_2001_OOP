import java.util.Scanner;

public class Guesser {

    public static void main (String[] args) {

        Scanner s = new Scanner(System.in);
        Tips t = new Tips();
        
        int num_of_tries = 10;

        for (int i = 0; i < num_of_tries; i++) {
            System.out.println("");
            System.out.println("Number of tries used: " + i);
            System.out.println("Guess a number (of type integer) between 1 to 1000. You have " + (num_of_tries - i) + " tries left. ");
            int guess = s.nextInt();

            if (guess > t.getRandomNumber()) {
                System.out.println("TOO HIGH. Try again.");
            } else if (guess < t.getRandomNumber()) {
                System.out.println("TOO LOW. Try again.");
            } else if (guess == t.getRandomNumber()) {
                System.out.println("Congratulations! You guessed correctly!");
                break;
            }

//        Tips
//        TODO: Create if-else function (based on times ran/looped) that contains
//              separate Methods that'll print String outputs (i.e. TipOne, TipTwo, TipThree, etc.)
            System.out.println("");
            t.increaseLoopNumber();

            switch(t.getIteration_amt()) {
                case 1:
                    System.out.println(t.getTip(guess));
                    break;
                case 2:
                    System.out.println(t.getTip(guess));
                    break;
                case 3:
                    System.out.println(t.getTip(guess));
                    break;
                case 4:
                    System.out.println(t.getTip(guess));
                    break;
                case 5:
                    System.out.println(t.getTip(guess));
                    break;
                case 6:
                    System.out.println(t.getTip(guess));
                    break;
                case 7:
                    System.out.println(t.getTip(guess));
                    break;
                case 8:
                    System.out.println(t.getTip(guess));
                    break;
                case 9:
                    System.out.println(t.getTip(guess));
                    break;
                case 10:
                    System.out.println(t.getTip(guess));
                    break;
            }

        }

        System.out.println("The randomly generated number was: " + t.getRandomNumber());

    }

}