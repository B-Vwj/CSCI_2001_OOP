import java.util.Random;

public class Tips {

    private int Iteration_amt;
    private int randomNumber;
    private String response;
    private int base;
    private int previousBase;
    private int maxBase;
    private int minBase;
//    private boolean greater_than_250;
//    private boolean greater_than_500;
//    private boolean greater_than_750;
//    private boolean greater_than_875;
    Random ran = new Random();

//    Tips (not best coding practice, but gets the work done in this case, without implementing an algorithm)
    public Tips() {
        randomNumber = ran.nextInt(1000) + 1; // Initially (0 - 999), but adding one means.. (1 - 1000)
        Iteration_amt = 0;
        previousBase = 0;
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

    //    public void setBase() {
//        this.base = midPointOfBase();
//    }

    public int getPreviousBase() {
        return previousBase;
    }

//    public void setPreviousBase(int x) {
//        this.previousBase = previousBase;
//    }

    // Methods to help the player "zero in" to the answer

//    public int addToBase() {
//        this.base = base + midPointOfBase();
//        return base;
//    }
//
//    public int subFromBase() {
//        this.base = base - midPointOfBase();
//        return base;
//    }

    public int setMaxBase(int highestNum) {
        this.base = highestNum;
    }

    public int setMinBase(int lowestNum) {
        this.previousBase = lowestNum;
    }

    public int midPointOfBase() {
        int midPoint = (getBase() + getPreviousBase()) / 2;
        return midPoint;
    }

//    Tips Section

//    How this works:
//    User input will (depending on if-else statement) be
//    assigned to MaxBase and MinBase, then use midpoint to find the next tip number.

    public String getTip(int guess) {
        if (getRandomNumber() > guess) {
            response = "TIP: The number is greater than " + getBase();
            setMaxBase(guess);

//            addToBase();
        } else if (getRandomNumber() < guess) {
            response = "TIP: The number is less than " + getBase();
            setMinBase(guess);
//            subFromBase();
        }
        return response;
    }



}