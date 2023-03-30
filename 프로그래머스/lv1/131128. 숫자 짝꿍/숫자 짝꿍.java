class Solution {
    public String solution(String X, String Y) {
        
        String answer = "";
        StringBuilder sb = new StringBuilder();
        boolean inconsistency = true;
        
        // X와 Y의 숫자별 개수 저장하기 위한 배열 선언
        int[] X_num = new int[10];
        int[] Y_num = new int[10];
        
        for (String x : X.split("")) {
            X_num[Integer.parseInt(x)] += 1;
        }
        for (String y : Y.split("")) {
            Y_num[Integer.parseInt(y)] += 1;
        }
        
        for (int i = 9; i >= 0; i--) {
            while ((X_num[i] > 0) && (Y_num[i] > 0)) {
                sb.append(i);
                
                X_num[i] -= 1;
                Y_num[i] -= 1;
                inconsistency = false;
            }
        }      
        
        // 일치하는 숫자가 없을 경우
        // if ("".equals(sb.toString())) {
        if (inconsistency == true) {
            answer = "-1";
        }
        // 공통 정수가 0으로만 존재하는 경우 (첫번째 원소가 0)
        else if("0".equals(sb.toString().substring(0,1))) {
            answer = "0";
        }            
        else {
            answer = sb.toString();
        }
        
        return answer;
    }
}