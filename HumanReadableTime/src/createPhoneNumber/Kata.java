package createPhoneNumber;

public class Kata {
    String s = new String();

    public static String createPhoneNumber(int[] numbers) {
        // Your code here!
        // => returns "(123) 456-7890"
        return "(" + numbers[0] + numbers[1] + numbers[2] + ") "
                + numbers[3] + numbers[4] + numbers[5] + "-"
                + numbers[6] + numbers[7] + numbers[8] + numbers[9];
    }

}