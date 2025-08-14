def solution(n):
    answer = []
    x = n;
    
    while True:
        answer.append(x)
        if x == 1:
            return answer
            break;
        elif x % 2 == 0:
            x /= 2
        elif x % 2 != 0:
            x = 3 * x + 1