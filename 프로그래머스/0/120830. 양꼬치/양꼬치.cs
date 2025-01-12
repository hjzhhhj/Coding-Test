using System;

public class Solution {
    public int solution(int n, int k) {
        int freeDrinks = n / 10;
    int answer = (12000 * n) + (2000 * (k - freeDrinks));
    return answer;
    }
}