function solution(dots) {
    const [[x1, y1], [x2, y2], [x3, y3], [x4, y4]] = dots
    if ( (y1-y2) / (x1-x2) == (y3-y4) / (x3-x4) ) return 1
    if ( (y2-y3) / (x2-x3) == (y1-y4) / (x1-x4) ) return 1
    if ( (y2-y4) / (x2-x4) == (y1-y3) / (x1-x3) ) return 1
    return 0;
}