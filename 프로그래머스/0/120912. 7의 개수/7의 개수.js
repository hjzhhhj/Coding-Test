function solution(array) {
    var answer = 0;
    for ( let i = 0; i < array.length; i++ ) { 
        let a = array[i] // 70
        for ( let j = 0; j < String(array[i]).length; j++ ) { // 2
            if ( a % 10 == 7 ) { 
                answer++ 
            }
            a = parseInt(a / 10)
        }
    }
    return answer;
}