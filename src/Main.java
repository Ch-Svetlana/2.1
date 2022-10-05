import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> even = new ArrayList<>();

        for (int i = 0; i < intList.size(); i++) {
            Integer targetInt = intList.get(i);
            if (targetInt > 0 && targetInt % 2 == 0) {
                even.add(targetInt);
            }
        }
        Collections.sort(even);
        for (int counter : even) {
            System.out.print(counter + " ");
        }
    }
}