function solution(my_string, is_suffix) {
    var answer = 0;
    for ( let i = 0; i < my_string.length; i++ ) {
        let str = my_string.substring(i, my_string.length)
        if ( str == is_suffix ) {
            answer = 1;
            break;
        }
    }
    return answer;
}