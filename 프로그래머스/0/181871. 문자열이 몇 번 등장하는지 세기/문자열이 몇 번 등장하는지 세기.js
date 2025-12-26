function solution(myString, pat) {
    var answer = 0;
    for ( let i = 0; i < myString.length; i++ ) {
        if ( myString.substr(i, pat.length) == pat ) {
            answer++
        }
    }
    return answer;
}