import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> arrList = new ArrayList<>();
        
        while(true){                
            if (n < 3){
                arrList.add(n);
                break;
            }
            arrList.add(n % 3);     // 3진법 계산 시 나머지를 역순으로 바로 담음
            n /= 3;
        }
        
        for(int i = 0; i < arrList.size(); i++){        // 바로 담은 값을 바로 10진법 변환
            answer += Math.pow(3,arrList.size() - i- 1) * arrList.get(i);
        }
        
        return answer;
    }
}