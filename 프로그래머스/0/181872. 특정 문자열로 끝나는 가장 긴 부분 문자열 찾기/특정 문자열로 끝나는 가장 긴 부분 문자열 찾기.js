function solution(myString, pat) {
    let i = myString.lastIndexOf(pat)
    var answer = myString.substr(0, i+pat.length);
    return answer;
}