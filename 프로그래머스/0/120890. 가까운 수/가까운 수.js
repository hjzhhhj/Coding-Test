function solution(array, n) {
    var answer = array[0];
    for ( let i = 1; i < array.length; i++ ) {
        if ( Math.abs(array[i] - n) < Math.abs(answer - n) || Math.abs(array[i] - n) == Math.abs(answer - n) && answer > array[i] ) {
            answer = array[i]
        } 
    }
    return answer;
}