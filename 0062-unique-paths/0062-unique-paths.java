class Solution {
    int dp[][]=new int [101][101];
    public int solve(int x,int y,int m,int n){
        
        if(x<0 || y<0 || x>m || y>n )return 0;
        if(dp[x][y]!=-1)return dp[x][y];
        if(x==m-1 && y==n-1)return dp[x][y]=1;
        return dp[x][y]=solve(x,y+1,m,n)+solve(x+1,y,m,n);
        
    }
    public int uniquePaths(int m, int n) {
        for(int i=0;i<101;i++){
            for(int j=0;j<101;j++) {
                dp[i][j]=-1;
            }
        }
        return solve(0,0,m,n);
    }
}