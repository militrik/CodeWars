package prime;

public class Prime {
    public static boolean isPrime(int num) {
        if (num > 1) {
            if (num == 2 | num == 3) {
                return true;
            } else {
                if (num % 2 != 0) {
                    if (num % 3 != 0) {
                        int lim = (int) Math.sqrt(num) + 1;
                        for (int i = 5; i < lim; i += 2) {
                            if (num % i == 0)
                                return false;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

}

