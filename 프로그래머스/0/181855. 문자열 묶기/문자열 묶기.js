function solution(strArr) {
    var answer = 0;
    let a = [];
    for ( let i = 0; i < strArr.length; i++ ) {
        a[strArr[i].length] = (a[strArr[i].length] || 0) + 1;;
    }
    for ( let j = 0; j < a.length; j++ ) {
        if ( answer < a[j] ) answer = a[j]
    }
    return answer;
}