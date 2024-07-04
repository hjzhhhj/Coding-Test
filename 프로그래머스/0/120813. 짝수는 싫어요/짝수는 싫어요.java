class Solution {
    public int[] solution(int n) {
        int[] answer = new int[(n/2)+(n%2)];
        int w = 1;
        for (int i = 0; i < (n/2)+(n%2); i++){
            answer[i] = w;
            w += 2;
        }
        return answer;
    }
}