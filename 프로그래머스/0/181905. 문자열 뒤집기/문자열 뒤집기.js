function solution(my_string, s, e) {
    if ( s == e ) var answer = my_string;
    else {
        var answer = my_string.substr(0, s);
        for ( let i = e; i >= s; i-- ) {
            answer += my_string[i]
        }
        answer += my_string.substr(e+1, my_string.length)
    }
    return answer;
}