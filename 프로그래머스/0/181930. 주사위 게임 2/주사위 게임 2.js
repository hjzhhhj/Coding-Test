function solution(a, b, c) {
    var answer = 0;
    let count = 0;
    if ( a == b ) {
        count++;
    }
    if ( b == c ) {
        count++;
    }
    if ( c == a ) {
        count++;
    }
    
    if ( count == 0 ) {
        answer = a + b + c;
    } else if ( count == 1 ) {
        answer = (a + b + c) * ( a*a + b*b + c*c );
    } else if ( count == 3 ) {
        answer = (a + b + c) * ( a*a + b*b + c*c ) * (a*a*a + b*b*b + c*c*c);
    }
        
    return answer;
}