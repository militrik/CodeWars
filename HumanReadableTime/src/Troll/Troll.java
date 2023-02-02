package Troll;

public class Troll {
    public static String disemvowel(String str) {
        // Code away...
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < vowels.length(); i++) {
            int res = 0;
            String rem = "" + vowels.charAt(i);
            while (res > -1) {
                res = str.indexOf(rem);
                if (res > -1) {
                    str = str.substring(0, res) + str.substring(res + 1);
                }
            }
        }
        return str;
    }
}
