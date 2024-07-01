class Solution {
    public int solution(int[] array) {
        int n = array.length;
        int answer = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    answer = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = answer;
                }
            }
        }
        answer = array[n / 2];
        return answer;
    }
}
