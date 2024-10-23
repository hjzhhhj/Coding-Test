#include <string>
#include <vector>

using namespace std;

int solution(vector<int> box, int n) {
    int answer = box[0] / n;
        answer *= box[1] / n;
        answer *= box[2] / n;
        return answer;
}