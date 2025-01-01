class Solution {
public int solution(int chicken) {
        int answer = 0;

        while (chicken >= 10) {
            int newChick = chicken / 10;
            int restChick = chicken % 10;
            chicken = newChick + restChick;

            answer += newChick;
        }

        return answer;
    }
}