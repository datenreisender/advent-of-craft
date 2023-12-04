package games;

public class FizzBuzz {
    private FizzBuzz() {
    }

    public static boolean valid(Integer input) {
        return input > 0 && input <= 100;
    }

    public static String convert(Integer input) throws OutOfRangeException {
        if (!valid(input)) throw new OutOfRangeException();

        if (input % 3 == 0 && input % 5 == 0) {
            return "FizzBuzz";
        }
        if (input % 3 == 0) {
            return "Fizz";
        }
        if (input % 5 == 0) {
            return "Buzz";
        }
        return input.toString();
    }
}
