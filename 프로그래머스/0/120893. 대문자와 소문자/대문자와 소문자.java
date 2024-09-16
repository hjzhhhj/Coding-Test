class Solution {
    public String solution(String my_string) {
        String answer = "";
        for ( int i = 0; i < my_string.length(); i++ ) {
            char ch = my_string.charAt(i);
            if ( ch >= 97 && ch <= 122 ) {
                ch -= 32;
            }
            else if ( ch >= 65 && ch <= 90 ){
                ch += 32;
            }
            answer += ch;
        }
        return answer;
    }
}