class Solution {
    public int[][] generateMatrix(int n) {
        int[][] array = new int[n][n];
        int startI = 0;
        int startJ = 0;
        int offset = n - 1;
        int count = 1;
        for(int circle = 0; circle < n / 2; circle++){
            int i = startI;
            int j = startJ;
            for(;j < offset; j++){
                array[i][j] = count;
                count++;
            }
            for(;i < offset; i++){
                array[i][j] = count;
                count++;
            }
            for(;j > startJ; j--){
                array[i][j] = count;
                count++;
            }
            for(;i > startI; i--){
                array[i][j] = count;
                count++;
            }
            startI++;
            startJ++;
            offset--;
        }
        if(n % 2 == 1){
            array[startI][startJ] = count;
        }
        return array;
    }
}