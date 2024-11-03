class Solution {
    public String solution(String myString) {
        String answer = "";
        myString = myString.toLowerCase();
        for ( int i = 0; i < myString.length(); i++ ) {
            char ch = myString.charAt(i);
            if ( ch == 'a' || ch == 'A' ) {
                answer += "A";
            }
            else {
                answer += ch;
            }
        }
        return answer;
    }
}