function solution(arr) {
    var answer = arr;
    let i = 1
    while ( true ) {
        if ( i - answer.length >= 0 ) break;
        i *= 2
    }
    let o = answer.length
    for ( let j = 0; j < i - o; j++ ) {
        answer.push(0)
    }
    return answer;
}