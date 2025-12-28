function solution(n) {
    var answer = Array.from(Array(n), () => Array(n).fill(0));
    let x = 0;
    let y = 0;
    let dx = [0, 1, 0, -1];
    let dy = [1, 0, -1, 0];
    let count = 1;
    let k = 0;
    while ( count <= n * n ) {
        answer[x][y] = count
        if (count === n * n) break;
        let nx = x + dx[k]; 
        let ny = y + dy[k];
        
        if ( nx < 0 || nx >= n || ny < 0 || ny >= n || answer[nx][ny] !== 0 ) {
            k = (k + 1) % 4;
            nx = x + dx[k];
            ny = y + dy[k];
        }

        x = nx
        y = ny
        count++ 
    }
    
    return answer;
}