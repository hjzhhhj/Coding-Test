function solution(my_string, is_prefix) {
    var answer = 0;
    for ( let i = 1; i < my_string.length + 1; i++ ) {
        if ( is_prefix === my_string.substring(0, i)) {
            answer = 1;
            break;
        }
    }
    return answer;
}