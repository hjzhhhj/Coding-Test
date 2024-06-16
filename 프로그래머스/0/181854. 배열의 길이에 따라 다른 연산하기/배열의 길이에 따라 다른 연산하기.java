class Solution {
    public int[] solution(int[] arr, int n) {
        if (arr.length % 2 != 0){
            for ( int i = 0; i < arr.length; i++ ) {
                if ( arr[i] % 2 == 0 ) {
                    arr[i] += n;
                }
            }
        }
         else if (arr.length % 2 == 0){
             for ( int i = 0; i < arr.length; i++ ) {
                if ( arr[i] % 2 != 0 ) {
                    arr[i] += n;
                }
            }
        }
        int[] answer = {};
        return answer;
    }
}