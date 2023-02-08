class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown + yellow; //  타일의 총합 먼저 구하기
        
        for(int i = 1; i <= sum; i++){ // 행과 열 경우의 수 반복문으로 돌리기
            int row = i;
            int col = sum / row;
            
            if(row > col){ // 열의 개수가 행의 개수보다 같거나 커야함 == 반대의 경우에는 continue
                continue;
            }
            if(((row-2) * (col-2)) == yellow){
                answer[0] = col; // 열의 개수
                answer[1] = row; // 행의 개수
                break;
            }
        }
        return answer;
    }
}