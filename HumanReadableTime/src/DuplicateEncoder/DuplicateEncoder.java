package DuplicateEncoder;

public class DuplicateEncoder {
    static String encode(String word) {

        word = word.toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c != 'A' & c != 'B') {
                long cc = word.chars().filter(ch -> ch == c).count();
                if (cc > 1) {
                    word = word.replace(c, 'A');

                } else {
                    word = word.replace(c, 'B');
                }
            }
        }
        word = word.replace('A', ')').replace('B', '(');
        return word;
    }
}
