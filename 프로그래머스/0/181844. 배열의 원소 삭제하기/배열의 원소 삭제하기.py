def solution(arr, delete_list):
    answer = [x for x in arr if x not in delete_list]
    return answer