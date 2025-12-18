function solution(myString) {
    var answer = [];
    let b = myString.split('x');
    for ( let i = 0; i < b.length; i++ ) {
        answer[i] = b[i].length
    }
    return answer;
}