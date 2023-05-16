import java.util.*;

class Solution {
    public int solution(int N, int number) {
        int answer = 0;
        
        int n = 0;
        Set<Integer>[] set = new HashSet[9];    // N을 사용하는 횟수별로 저장하기 위한 배열 (0번은 미사용)

        for (int i = 1; i <= 8; i++) {  // N을 사용하는 횟수만큼 붙여써서 사용하는 경우
            n = (n * 10) + N;
            set[i] = new HashSet<>();
            set[i].add(n);
        }
        // N을 한 번 사용하는 경우는 위의 과정에서 추가됨 (한 번 사용하는 경우에서 다른 경우는 없으므로 2번 사용했을때부터 연산에 따른 값 저장)
        for (int i = 1; i <=8; i++) {
            for (int j = 1; j < i; j++) {
                for (Integer num1 : set[j]) {
                    for (Integer num2 : set[i - j]) {
                        set[i].add(num1 + num2);
                        set[i].add(num1 - num2);
                        set[i].add(num1 * num2);
                        /*
                        둘 중에 하나가 0 이라면
                        1. 0이 분자로 가는 경우 -> 0이 나옴 (number가 될 수 없으므로 skip)
                        2. 0이 분모로 가는 경우 -> 에러 발생 (또한 number가 될 수 없음)
                        두 가지 경우 number가 될 수 없으므로 continue 처리
                        */
                        if(num1 == 0 || num2 == 0) {     
                            continue;
                        }
                        set[i].add(num1 / num2);
                        set[i].add(num2 / num1);
                    }
                }
            }
            if (set[i].contains(number)) {  // 반복문을 돌리다가 number가 존재하면 최소 사용 횟수이므로 answer에 return (종료)
                answer = i;
                return answer;
            }
        }
        return -1;  // 마지막까지 number가 나오지 않는 경우 (9이상 사용하는 경우)
    }
}