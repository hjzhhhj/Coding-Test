function solution(num_list, n) {
    var answer = [];
    for ( let j = 0; j < num_list.length / n; j++ ) {
         answer.push([])
         for ( let i = 0; i < n; i++ ) {
             answer[j].push(num_list[j * n + i])
         }
    } 
    return answer;
}