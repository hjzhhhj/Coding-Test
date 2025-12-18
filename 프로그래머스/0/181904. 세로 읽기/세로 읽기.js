function solution(my_string, m, c) {
    var answer = '';
    var result = []
    my_string = my_string.split("")
    for ( let i = 0; i < (my_string.length/m); i++ ) {
        result.push(my_string[m * i + c - 1])
    }
    answer = result.join("")
    return answer;
}