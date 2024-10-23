import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int n = numbers.length;
        return Math.max(numbers[n - 1] * numbers[n - 2], numbers[0] * numbers[1]);
    }
}
