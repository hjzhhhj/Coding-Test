function solution(num_list) {
    var answer = 0;
    for ( let i of num_list ) {
        while ( true ) {
        if ( i == 1 ) break;
        if ( i % 2 == 0 ) {
            i /= 2
            answer++
        } else if ( i % 2 != 0 ) {
            i = ( i - 1 ) / 2
            answer++
        }
        }
    }
    return answer;
}