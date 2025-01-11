#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <string.h>

// sides_len은 배열 sides의 길이입니다.
int solution(int sides[], size_t sides_len) {
    int max = 0;
        int sum = 0;
        
        for (int i = 0; i < sides_len; i++) {
            if (sides[i] > max) {
                max = sides[i];
            }
            sum += sides[i];
        }
        
        sum -= max;
        
        if (sum > max) {
            return 1;
        } else {
            return 2;
        }
}