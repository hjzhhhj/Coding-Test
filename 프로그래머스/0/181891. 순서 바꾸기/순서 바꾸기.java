class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int a = 0;
        for ( int i = n; i < num_list.length; i++ ) {
            answer[a] = num_list[i];
            a++;
        }
        for ( int i = 0; i < n; i++ ) {
            answer[a] = num_list[i];
            a++;
        }
        return answer;
    }
}