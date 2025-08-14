function solution(binomial) {
    var answer = 0;
    arr = binomial.split(" ")
    
    num1 = parseInt(arr[0])
    num2 = parseInt(arr[2])
    op = arr[1]
    
    if (op == '+') {
        answer = num1 + num2 }
    else if (op == '-') {
        answer = num1 - num2 }
    else if (op == '/') {
        answer = num1 / num2 }
    else if (op == '*') {
        answer = num1 * num2 }
        
    return answer
}