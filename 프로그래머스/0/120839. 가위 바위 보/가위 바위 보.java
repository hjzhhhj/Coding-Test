class Solution {
    public String solution(String rsp) {
        String answer = "";
        for ( int i = 0; i < rsp.length(); i++ ) {
            int num = rsp.charAt(i)-'0';
            if ( num == 2 ) {
                answer += "0";
            }
            else if ( num == 0 ) {
                answer += "5";
            }
            else {
                answer += "2";
            }
        }
        return answer;
    }
}