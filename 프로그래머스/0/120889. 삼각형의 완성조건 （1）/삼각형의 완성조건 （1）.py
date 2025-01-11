def solution(sides):
    max_side = max(sides)
    sum_sides = sum(sides) - max_side

    return 1 if sum_sides > max_side else 2