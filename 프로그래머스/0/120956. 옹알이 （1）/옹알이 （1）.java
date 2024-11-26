class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] pron = {"aya", "ye", "woo", "ma"};
        
        for(String word : babbling){
            for(String p : pron){
                if(word.contains(p)){
                    word = word.replace(p, " ");
                }
            }
            
            word = word.replace(" ", "");
            if(word.equals("")) answer++;
        }
        
        return answer;
    }
}