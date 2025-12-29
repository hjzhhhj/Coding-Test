function solution(lines) {
    let answer = 0;

    for (let x = -100; x <= 100; x++) {
        let cnt = 0;

        if (lines[0][0] <= x && x < lines[0][1]) cnt++;
        if (lines[1][0] <= x && x < lines[1][1]) cnt++;
        if (lines[2][0] <= x && x < lines[2][1]) cnt++;

        if (cnt >= 2) answer++;
    }

    return answer;
}
