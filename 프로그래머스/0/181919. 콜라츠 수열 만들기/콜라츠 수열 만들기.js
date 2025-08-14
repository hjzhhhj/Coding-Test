function solution(n) {
    var answer = [];
    var x = n;
    
    while (true) {
        answer.push(x)
        if ( x == 1 ) {
            return answer;
            break;
        } else if ( x % 2 == 0 ) {
            x /= 2
        } else if ( x % 2 != 0 ) {
            x = 3 * x + 1
        }
    }
}