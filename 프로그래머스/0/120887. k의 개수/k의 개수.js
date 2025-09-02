function solution(i, j, k) {
    var answer = 0;
    for (let o = i; o <= j; o++ ) {
        answer += o.toString().split(k.toString()).length - 1;
    }
    return answer;
}