class Solution {
    public int[] solution(int[][] arr) {
        int[] answer = new int[2];
        int n = arr.length;
        solv(arr, n, 0, 0, answer);
        return answer;
    }
    private void solv(int[][] arr, int n, int row, int col, int[] answer){
        if (check(arr, n, row, col)) {
            answer[arr[row][col]]++;
            return;
        }
        solv(arr, n/2, row, col, answer);
        solv(arr, n/2, row, col + n/2, answer);
        solv(arr, n/2, row + n/2, col, answer);
        solv(arr, n/2, row + n/2, col + n/2, answer);
    }
    private boolean check(int[][] arr, int n, int row, int col){
        int first = arr[row][col];
        for (int i = row ; i < row + n; i++)
            for (int j = col ; j < col + n; j++)
                if (arr[i][j] != first) return false;
        return true;
    }
}