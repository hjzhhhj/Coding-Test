class Solution {
    public String solution(int age) {
        String answer = "";

        while (age > 0) {
            int digit = age % 10; 
            if (digit == 0) answer = "a" + answer;
            else if (digit == 1) answer = "b" + answer;
            else if (digit == 2) answer = "c" + answer;
            else if (digit == 3) answer = "d" + answer;
            else if (digit == 4) answer = "e" + answer;
            else if (digit == 5) answer = "f" + answer;
            else if (digit == 6) answer = "g" + answer;
            else if (digit == 7) answer = "h" + answer;
            else if (digit == 8) answer = "i" + answer;
            else if (digit == 9) answer = "j" + answer;

            age /= 10;
        }

        return answer;
    }
}
