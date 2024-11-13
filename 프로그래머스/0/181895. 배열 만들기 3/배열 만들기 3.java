class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int a = 0;
        for ( int i = intervals[0][0]; i <= intervals[0][1]; i++ ) {
            a++;
        }
        for ( int j = intervals[1][0]; j <= intervals[1][1]; j++ ) {
            a++;
        }
        int[] answer = new int[a];
        int b = 0;
        for ( int i = intervals[0][0]; i <= intervals[0][1]; i++ ) {
            answer[b] = arr[i];
            b++;
        }
        for ( int j = intervals[1][0]; j <= intervals[1][1]; j++ ) {
            answer[b] = arr[j];
            b++;
        }
        return answer;
    }
}