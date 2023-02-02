package RowSumOddNumbers;

class RowSumOddNumbers {
    public static int rowSumOddNumbers(int row) {
        //TODO
        int temp = arithmeticProgression(1, 1, row - 1) + 1;
        int d = 2;
        int a1 = nElement(1, temp, d);

        return arithmeticProgression(a1, d, row);
    }

    public static int nElement(int a1, int n, int d) {
        return a1 + (n - 1) * d;
    }

    public static int arithmeticProgression(int a1, int d, int n) {
        return (2 * a1 + d * (n - 1)) * n / 2;
    }

}