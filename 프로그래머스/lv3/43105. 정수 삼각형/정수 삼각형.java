class Solution {
    public int solution(int[][] triangle) {
        int answer = 0;
    
        
        triangle[0][0] = triangle[0][0];
        triangle[1][0] = triangle[0][0] + triangle[1][0];
        triangle[1][1] = triangle[0][0] + triangle[1][1];
        
        for(int i = 2; i < triangle.length; i++){
            for(int j = 0; j < triangle[i].length; j++){
                if(j == 0){ // 젤 왼쪽의 경우
                    triangle[i][j] += triangle[i-1][j];
                }
                //맨 오른쪽
                else if(j == triangle[i].length - 1){
                    triangle[i][j] += triangle[i-1][j-1];
                // 중간사이의 경우 (위 두 값 중 큰값을 더함)
                }else{
                    triangle[i][j] = Math.max(triangle[i-1][j-1],triangle[i-1][j]) + triangle[i][j];
                }
            }
        }
        int max = 0;
        for(int i = 0; i < triangle[triangle.length -1].length; i++){
            if(max < triangle[triangle.length -1][i]){
                max = triangle[triangle.length -1][i];
            }
        }
        answer = max;
        return answer;
    }
}