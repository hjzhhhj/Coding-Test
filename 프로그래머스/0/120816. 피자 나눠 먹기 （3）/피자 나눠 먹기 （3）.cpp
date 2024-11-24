#include <string>
#include <vector>

using namespace std;

int solution(int slice, int n) {
    int answer = 0;
        answer += n / slice;
        if ( n % slice != 0) {
            answer += 1;
        }
        return answer;
    }