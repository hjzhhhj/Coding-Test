class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int d;
        if ( a > b ){
            d = a;
            a = b;
            b = d;
        }
        for (int i = a; i<=b; i++){
            answer += i;
        }
            
        return answer;
    }
}