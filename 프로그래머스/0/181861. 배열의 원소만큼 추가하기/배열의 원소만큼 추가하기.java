class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int a = 0;

        for (int i = 0; i < arr.length; i++) {
            a += arr[i];    
        }
        answer = new int[a];

        int b = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                answer[b++] = arr[i];
            }
        }
        return answer;
    }
}