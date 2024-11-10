class Solution {
    public String[] solution(String[] names) {
        int c = 0;
        if ( names.length % 5 == 0 ) {
            c = ( names.length / 5 );
        }
        else {
            c = ( names.length / 5 ) + 1;
        }
        String[] answer = new String[ c ];
        int a = 0;
        int b = 0;
        for ( int i = 0; i < names.length; i++ ) {
            a++;
            if ( a == 1 ) {
                answer[b] = names[i];
                b++;
            }
            else if ( a == 5 ) {
                a = 0;
            }
        }
        return answer;
    }
}