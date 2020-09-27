import java.util.Random;

public class Tips {

    private int Iteration_amt;
    private int randomNumber;
    private String response;
    private int base;
    private int maxBase;
    private int minBase;

    Random ran = new Random();

//    Tips
    public Tips() {
        randomNumber = ran.nextInt(1000) + 1; // Initially (0 - 999), but adding one means.. (1 - 1000)
        Iteration_amt = 0;
        maxBase = 1000;
        base = 500;
    }

    public int getRandomNumber() {
        return randomNumber;
    }

    public void increaseLoopNumber() {
        Iteration_amt++;
    }

    public int getIteration_amt() {
        return Iteration_amt;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getMaxBase() {
        return maxBase;
    }

    public int getMinBase() {
        return minBase;
    }

    // Methods to help the player "zero in" to the answer

    public void setMaxBase(int highestNum) {
        this.maxBase = highestNum;
    }

    public void setMinBase(int lowestNum) {
        this.minBase = lowestNum;
    }

    public int midPointOfBase() {
        int midPoint = (getMaxBase() + getMinBase()) / 2;
        return midPoint;
    }

//    Tips Section

//    How this works:
//    User input will (depending on if-else statement) be
//    assigned to MaxBase and MinBase, then use midpoint to find the next tip number.

    public String getTip(int guess) {
        if (getRandomNumber() > guess) {
            setMinBase(guess);

            response = "TIP: The number is greater than your guess number."
                    + " Try something between " + getMinBase() + " and " + getMaxBase();

        } else if (getRandomNumber() < guess) {
            setMaxBase(guess);
            response = "TIP: The number is less than your guess number."
                    + " Try something between " + getMinBase() + " and " + getMaxBase();
        }
        return response;
    }

}