public class TestFactorial {

    public static void main(String[] args) {
        int result = Factorial.factorial(5);

        if (result == 120) {
            System.out.println("Test Passed: Factorial is correct.");
        } else {
            System.out.println("Test Failed.");
            System.exit(1);
        }
    }
}