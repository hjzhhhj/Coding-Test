class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int answer2 = 1;
        for ( int i = 0; i < num_list.length; i++ ) {
            answer += num_list[i];
            answer2 *= num_list[i];
        }
        answer *= answer;
        if ( answer < answer2 ) {
            answer = 0;
        }
        else if ( answer > answer2 ) {
            answer = 1;
        }
        return answer;
    }
}