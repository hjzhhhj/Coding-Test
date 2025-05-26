function solution(board, moves) {
    let answer = 0;
            let stack = [];

            moves.forEach(pos => {
                for ( let i = 0; i < board.length; i++ ) {
                    if ( board[i][pos-1] !== 0 ) {
                        let temp = board[i][pos-1];
                        board[i][pos-1] = 0;
                        if ( temp === stack[stack.length-1] ) {
                            stack.pop();
                            answer += 2;
                        } else {
                            stack.push(temp);
                        }
                        break;
                    }
                }
            });

            return answer;
}