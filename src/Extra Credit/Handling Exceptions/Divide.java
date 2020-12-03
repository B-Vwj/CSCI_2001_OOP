public class Divide {

    public int divide(int a, int b) {
        return (a / b);
    }

    public void divideWrapper(int a, int b) {
        try {
            divide(a, b);
        } catch(ArithmeticException e) {
            System.out.println("An Exception Came Up:\n" + "'" + e + "'");
        }
    }

}