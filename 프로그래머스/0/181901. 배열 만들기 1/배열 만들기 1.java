class Solution {
    public int[] solution(int n, int k) {
        int cnt = n/k;
        int[] answer = new int[cnt];
        
        for(int i = 0; i < cnt; i++) 
            answer[i] = k * (i + 1);
                
        return answer;
    }
}