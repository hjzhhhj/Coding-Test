class Solution {
    public String solution(String my_string, String alp) {
        char a = alp.charAt(0);
        String answer = "";
        for ( int i = 0; i < my_string.length(); i++ ) {
            char ch = my_string.charAt(i);
            if ( ch == a ) {
                ch = Character.toUpperCase(ch);
                answer += ch;
            }
            else answer += ch;
        }
        return answer;
    }
}