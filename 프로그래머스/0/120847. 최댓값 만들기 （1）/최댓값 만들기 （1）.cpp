#include <string>
#include <vector>

using namespace std;

int solution(vector<int> numbers) {
    int answer = 0;
    int n = numbers.size(); // numbers의 크기를 저장합니다.

    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) { // j를 i+1로 설정하여 중복을 방지합니다.
            int product = numbers[i] * numbers[j];
            if (product > answer) {
                answer = product; // 최대 곱을 업데이트합니다.
            }
        }
    }
    return answer;
}
