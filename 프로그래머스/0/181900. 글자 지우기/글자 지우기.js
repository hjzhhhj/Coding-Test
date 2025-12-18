function solution(my_string, indices) {
    var answer = '';
    indices = new Set(indices)
    for (let i = 0; i < my_string.length; i++) {
        if (!indices.has(i)) answer += my_string[i];
    }
    return answer;
}