function solution(myString) {
    var answer = myString.split('x');
    answer.sort();
    // answer.filter(n => parseInt(n))
    // answer.flat();
    answer = answer.filter((e) => e !== "");
    return answer;
}