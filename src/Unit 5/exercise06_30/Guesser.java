import java.util.Scanner;

public class Guesser {

    public static void main (String[] args) {

        Scanner s = new Scanner(System.in);
        Tips t = new Tips();
        
        int num_of_tries = 10;
        boolean failed = true;

        for (int i = 0; i < num_of_tries; i++) {
            System.out.println("");
            System.out.println("Number of tries used: " + i);
            System.out.println("Guess a number (of type integer) between 1 to 1000. You have " + (num_of_tries - i) + " tries left. ");
            int guess = s.nextInt();

            if (guess > 1000) {
                System.out.println("Error: Number cannot exceed a value of 1000");
                break;
            } else if (guess < 1) {
                System.out.println("Error: Number cannot be a value lower than 1!");
                break;
            }

//            Catching those pesky trolls who go over 1000 or under 1

            if (guess > t.getRandomNumber()) {
                System.out.println("");
                System.out.println("TOO HIGH. Try again.");
            } else if (guess < t.getRandomNumber()) {
                System.out.println("");
                System.out.println("TOO LOW. Try again.");
            } else if (guess == t.getRandomNumber()) {
                System.out.println("");
                System.out.println("Congratulations! You guessed correctly!");
                failed = false;
                break;
            }

//        Tips
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
        if (failed) {
            System.out.println("");
            System.out.println("Game Tips from Mimir:");
            System.out.println("---");
            System.out.println("Start the game with 500. Then, with the tips given.\n"
                    + "try adding the lowest number and the highest number together\n"
                    + "then divide it by two. Then use that number as your next guessing number.");
        }

    }

}