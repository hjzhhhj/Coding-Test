using System;

public class Solution {
    public int solution(int[] box, int n) {
        int answer = box[0] / n;
        answer *= box[1] / n;
        answer *= box[2] / n;
        return answer;
    }
}