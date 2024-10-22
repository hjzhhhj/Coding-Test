class Solution {
    public int solution(String myString, String pat) {
        String hi = "";
        for ( int i = 0; i < myString.length(); i++ ) {
            char ch = myString.charAt(i);
            if ( ch == 'A' ) {
                hi += 'B';
            }
            else {
                hi += "A";
            }
        }
        int answer = 0;
        if ( hi.contains(pat) ) {
            answer = 1;
        }
        return answer;
    }
}