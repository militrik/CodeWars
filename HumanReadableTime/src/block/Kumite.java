package block;

import java.util.Arrays;
// 1 6 -11 22 5 -32 28 -26 -19
public class Kumite {
    public static boolean block(int[] attackers, int[] defenders) {
        if (attackers.length == 0) {
            return true;
        } else if (defenders.length == 0) {
            return false;
        } else {
            attackers = Arrays.copyOf(attackers, Math.max(attackers.length, defenders.length));
            defenders = Arrays.copyOf(defenders, Math.max(attackers.length, defenders.length));
            int survivals = Arrays.stream(defenders).sum()-Arrays.stream(attackers).sum() ;
            if (survivals < 0) {
                return false;
            } else if (survivals > 0) {
                return true;
            } else {
                if (Arrays.stream(attackers).sum() > Arrays.stream(defenders).sum()) {
                    return false;
                } else {
                    return true;
                }
            }
        }
    }
}

