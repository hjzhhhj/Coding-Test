class Solution {
    public int[] solution(int[] num_list, int n) {
        int a = 0;
        if ( num_list.length % n == 0 ) {
            a = num_list.length/n;
        }
        else {
            a = (num_list.length/n)+1;
        }
        int[] answer = new int[a];
        for ( int i = 0; i < a; i++ ) {
            answer[i] = num_list[i*n];
        }
        return answer;
    }
}