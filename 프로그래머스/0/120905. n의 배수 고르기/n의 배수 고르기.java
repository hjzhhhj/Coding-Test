class Solution {
    public int[] solution(int n, int[] numlist) {
        int m = 0; int k = 0;
        for ( int i = 0; i < numlist.length; i++ ) {
            if ( numlist[i] % n == 0 ) {
                m++;
            }
        }
        int[] answer = new int[m];
        for ( int i = 0; i < numlist.length; i++ ) {
            if ( numlist[i] % n == 0 ) {
                answer[k] = numlist[i];
                k++;
                
            }
        }
        return answer;
    }
}