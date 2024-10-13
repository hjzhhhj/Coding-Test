class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String hi = a + "" + b;
        int bye = a * b * 2;
        if ( Integer.parseInt(hi) > bye ) {
            answer = Integer.parseInt(hi);
        }
        else {
            answer = bye;
        }
        return answer;
    }
}