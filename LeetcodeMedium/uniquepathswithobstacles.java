public class uniquepathswithobstacles {

    public static int alluniqueobstaclespaths(int[][] obstacleGrid) {
        
        int rowlen = obstacleGrid.length;
        int collen = obstacleGrid[0].length;
        int dp[][] = new int[rowlen][collen];
        
        for(int i = 0; i < rowlen; i++) {
            if(obstacleGrid[i][0] == 1) {
                break;
            } else {
                dp[i][0] = 1;
            }
        }
        
        for(int i = 0; i < collen; i++) {
            if(obstacleGrid[0][i] == 1) {
                break;
            } else {
                dp[0][i] = 1;
            }
        }
        
        for(int i = 1; i < rowlen; i++) {
            for(int j = 1; j < collen; j++) {
                if(obstacleGrid[i][j] == 1) {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
                }
            }
        }
        
        return dp[rowlen - 1][collen - 1];

    }

    public static void main(String[] args) {
        
        
        int[][] obstacleGrid = {{0,0,0},{0,1,0},{0,0,0}};


        int result = alluniqueobstaclespaths(obstacleGrid);

        System.out.println("result " + result);

    }


}
