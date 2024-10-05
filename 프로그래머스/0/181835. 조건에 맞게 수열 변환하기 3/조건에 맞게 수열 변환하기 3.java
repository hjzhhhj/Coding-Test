class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[arr.length];
        int a = 0;
        if ( k % 2 != 0 ) {
            for ( int i = 0; i < arr.length; i++ ) {
                answer[a] = arr[i] * k;
                a++;
            }
        }
        else {
            for ( int i = 0; i < arr.length; i++ ) {
                answer[a] = arr[i] + k;
                a++;
            }
        }
        return answer;
    }
}