def solution(array, height):
    answer = 0
    
    for i in array:
        if i > height:
            answer += 1
        else:
            print("머쓱이가 더 큼")
    
    return answer