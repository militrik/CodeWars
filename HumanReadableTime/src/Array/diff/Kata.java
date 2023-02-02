package Array.diff;

public class Kata {

    public static int[] arrayDiff(int[] a, int[] b) {
        // Your code here
        String aS = toMyString(a);

        for (int element : b) {
            String reg = "\t" + element + "\t";
            String[] s = aS.split(reg);
            aS = toMyString(s);
        }
        String[] sS = aS.split("\t");

        int countNulls = 0;
        for (String element : sS
        ) {
            if (element == "") countNulls++;
        }

        int[] aA = new int[sS.length - countNulls];

        for (int i = 0, j = 0; i < sS.length; i++) {
            if (sS[i] != "") {
                aA[j] = Integer.valueOf(sS[i]);
                j++;
            }
        }
        return aA;
    }

    private static String toMyString(int[] e) {
        String coll = "";
        for (int element : e
        ) {
            coll = coll + "\t" + element + "\t";
        }
        return coll;
    }

    private static String toMyString(String[] e) {
        String coll = "";
        for (String element : e
        ) {
            coll = coll + "\t" + element + "\t";
        }
        return coll;
    }

}