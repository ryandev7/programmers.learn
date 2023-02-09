import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        // 그리디 알고리즘
        // 몸무게가 가장 작은 사람과 큰 사람을 더해서 비교하기
        int answer = 0;
        
        Arrays.sort(people);
        int min_index = 0;
        int max_index = people.length - 1;
        
        while(max_index >= min_index){
            if(people[min_index] + people[max_index] <= limit){
                answer++;
                min_index++;
                max_index--;
            }else{                  // 합이 제한용량보다 클 때 -> 남아있는 제일 큰 무게 사람 먼저 뺌
                answer++;
                max_index--;
            }
        }
        
        return answer;
    }
}