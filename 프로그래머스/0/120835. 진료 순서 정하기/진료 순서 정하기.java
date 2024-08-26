public class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        for (int i = 0; i < emergency.length; i++) {
            int rank = 1;
            for (int j = 0; j < emergency.length; j++) {
                if (emergency[j] > emergency[i]) {
                    rank++;
                }
            }
            answer[i] = rank;
        }
        return answer;
    }
}
