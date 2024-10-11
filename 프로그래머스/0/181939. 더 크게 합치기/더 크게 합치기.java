class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String hi = a + "";
        hi += b + "";
        String bye = b + "";
        bye += a + "";
        if ( Integer.parseInt(hi) > Integer.parseInt(bye) ) {
            answer = Integer.parseInt(hi);
        }
        else {
            answer = Integer.parseInt(bye);
        }
        return answer;
    }
}