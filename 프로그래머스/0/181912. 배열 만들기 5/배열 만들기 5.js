function solution(intStrs, k, s, l) {
    var answer = [];
    for ( let i = 0; i < intStrs.length; i++ ) {
        let num = intStrs[i].substring(s, s+l)
        if ( k < num ) {
            answer.push(parseInt(num))
        }
    }
    return answer;
}