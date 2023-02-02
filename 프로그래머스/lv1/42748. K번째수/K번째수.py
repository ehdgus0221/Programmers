def solution(array, commands):
    answer = []
    
    for i in commands:
        array2 = array[i[0]-1:i[1]]
        array2.sort()
        # 5,6번째 줄 합치면 값이 잘 안나옴
        # array2 = array[i[0]-1:i[1]].sort()
        
        answer.append(array2[i[2]-1])
    
    return answer