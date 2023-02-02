import java.util.ArrayList;
import java.util.List;

public class DeadFish {
    public static int[] parse(String data) {
        // Implement me! :)
        int[] value = {0};
        List<Integer> list = new ArrayList<>();
         data.chars().mapToObj(c -> (char) c)
                .forEach(character -> {
                    switch (character){
                        case 'i' ->  value[0]++;
                        case 'd'->  value[0]--;
                        case 's'->  value[0]*=value[0];
                        case 'o'-> list.add(value[0]);
                    }
                });
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
