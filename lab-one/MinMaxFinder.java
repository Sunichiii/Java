import java.util.Arrays;

public class MinMaxFinder {
    public static void main(String[] args) {
        int[] numbers = {12, 35, 1, 10, 34, 1};
        int[] result = findSecondMinMax(numbers);
        System.out.println("Second Minimum: " + result[0]);
        System.out.println("Second Maximum: " + result[1]);
    }

    public static int[] findSecondMinMax(int[] numbers) {
        Arrays.sort(numbers);
        int secondMin = -1, secondMax = -1;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] != numbers[0]) {
                secondMin = numbers[i];
                break;
            }
        }
        for (int i = numbers.length - 2; i >= 0; i--) {
            if (numbers[i] != numbers[numbers.length - 1]) {
                secondMax = numbers[i];
                break;
            }
        }
        return new int[] { secondMin, secondMax };
    }
}
