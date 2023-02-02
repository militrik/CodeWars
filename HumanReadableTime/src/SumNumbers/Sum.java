package SumNumbers;

public class Sum {
    public int GetSum(int a, int b) {
        if (a < b) {

        } else if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        } else {
            return a;
        }

        int s = 0;
        for (int i = a; i <= b; i++) {
            s += i;
        }
        return s;
    }
}