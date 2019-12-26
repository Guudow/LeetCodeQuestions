import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {

        int[] numbers = new int[] {2, 3, 7, 4, 8};
        int target = 7;
        int[] result = getTwoSum(numbers, target);
        System.out.print(result[0] + " " + result[1]);
    }

    public static int[] getTwoSum(int[] numbers, int target) {
        Map<Integer, Integer> visitNumbers = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int delta = target - numbers[i];
            if (visitNumbers.containsKey(delta)) {
              return new int[] {i, visitNumbers.get(delta) };
            }
            visitNumbers.put(numbers[i], i);
        }
        return new int[] {-1, -1 };

    }
}
