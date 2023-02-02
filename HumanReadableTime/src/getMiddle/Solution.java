package getMiddle;

class getMiddle {
    public static String getMiddle(String word) {
        //Code goes here!
        int beginIndex = word.length() / 2 - (word.length() - 1) % 2;
        int endIndex = word.length() / 2 + 1;
        return word.substring(beginIndex, endIndex);
    }
}