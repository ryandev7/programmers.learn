import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] score = {0 ,0 ,0};
        
        for(int i = 0; i < answers.length; i++){
            if(answers[i] == a[i%5]) score[0]++;
            if(answers[i] == b[i%8]) score[1]++;
            if(answers[i] == c[i%10]) score[2]++;
        }
        
        int max = Math.max(score[0], Math.max(score[1], score[2]));
        
        ArrayList<Integer> arrList = new ArrayList<>(); // 갯수를 담을 가변형 리스트 생성
        
        for(int i = 0; i < 3; i++){
            if(max == score[i]) arrList.add(i+1);
        }
        
        int[] answer = new int[arrList.size()];
        
        for(int i = 0; i < arrList.size(); i++){
            answer[i] = arrList.get(i);
        }
        
        return answer;
    }
}