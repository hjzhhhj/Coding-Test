class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        
        char[] ch = my_string.toCharArray();
        char a = ch[num1];
        ch[num1] = ch[num2];
        ch[num2] = a;
        
        for ( int i = 0; i < ch.length; i++ ) {
            answer += ch[i];
        }
        return answer;
    }
}