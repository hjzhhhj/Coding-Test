function solution(arr, queries) {
    var answer = arr;
    for ( let i = 0; i < queries.length; i++ ) {
        let a = queries[i][0];
        let b = queries[i][1];
        for ( let j = 0; j < arr.length; j++ ) {
            if ( j >= a && j <= b ) {
                arr[j] += 1;
            }
        }
    }
    return answer;
}