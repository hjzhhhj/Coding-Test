class Solution {
    public int solution(int n) {
        int answer = 0;
        int hi = 1;
        for ( int i = 1; i < 20; i++ ) {
            hi *= i;
            if ( n / hi < 1 ) {
                answer = i-1;
                break;
            }
        }
        return answer;
    }
}