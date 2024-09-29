class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int y = 0, p = 0;
        for ( int i = 0; i < s.length(); i++ ) {
            char ch = s.charAt(i);
            if ( ch == 'y' || ch == 'Y' ) {
                y++;
            }
            else if ( ch == 'p' || ch == 'P' ) {
                p++;
            }
        }
        if ( p == y ) {
            answer = true;
        }
        else {
            answer = false;
        }
        return answer;
    }
}