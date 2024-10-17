class Solution {
    public String solution(String rny_string) {
        String answer = "";
        for ( int i = 0; i < rny_string.length(); i++ ) {
            char ch = rny_string.charAt(i);
            if ( ch == 'm' ) {
                answer += "rn";
            }
            else {
                answer += ch;
            }
        }
        return answer;
    }
}