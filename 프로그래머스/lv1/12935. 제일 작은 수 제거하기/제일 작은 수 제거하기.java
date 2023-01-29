class Solution {
    public int[] solution(int[] arr) {
        
        if(arr.length == 1){
            int[] answer = {-1};
            return answer;
        }
        
        int[] answer = new int[arr.length-1];
        int min = arr[0]; // 첫번째 숫자를 가장 작다고 가정 후 비교할 값
        int idx = 0; // 정답 배열 인덱스용 변수
        
        for(int i = 0; i < arr.length; i++){
            
            if(min > arr[i]){
                min = arr[i];
            }
        }
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == min){
                continue;
            }
            answer[idx++] = arr[i];
        }
        
        return answer;
    }
}