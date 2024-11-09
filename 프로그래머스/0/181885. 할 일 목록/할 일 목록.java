public class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int a = 0;
        for ( int i = 0; i < todo_list.length; i++ ) {
            if ( finished[i] == false ) {
                a++;
            }
        }
        String[] answer = new String[a];
        int b = 0;
        for ( int i = 0; i < todo_list.length; i++ ) {
            if ( finished[i] == false ) {
                answer[b] = todo_list[i];
                b++;
            }
        }
        return answer;
    }
}