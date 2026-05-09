class Solution {
    public int solution(int[][] triangle) {
        int depth = triangle.length;
        for (int i = 1; i < depth; i++){
            for (int j = 0; j < triangle[i].length; j++){
                if (j == 0) triangle[i][j] += triangle[i-1][j];
                else if (j == triangle[i].length-1) triangle[i][j] += triangle[i-1][j-1];
                else triangle[i][j] += Math.max(triangle[i-1][j-1], triangle[i-1][j]);
            }
        }
        int max = triangle[depth-1][0];
        for (int i = 1; i < triangle[depth-1].length; i++)
            max = Math.max(triangle[depth-1][i], max);
        return max;
    }
}