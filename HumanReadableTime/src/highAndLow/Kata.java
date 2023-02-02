package highAndLow;

public class Kata {
    public static String highAndLow(String numbers) {
        // Code here or
        String[] s = numbers.split(" ");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (String num : s
        ) {
            max = Math.max(max, Integer.parseInt(num));
            min = Math.min(min, Integer.parseInt(num));
        }
        return max + " " + min;
    }
}

