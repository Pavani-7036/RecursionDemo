public class Knapsack Tabulation{
    public static int Knapsack Tabulation(int[] weight,int[] profit,int W,int n){
	int[][] dp=new int[n+1][W+1];
	for(int i=1;i<=n;i++){
	for(int w=1;w<=W;w++){
	   if(weight[i-1]<=w){
	   dp[i][w]=Math.max(profit[i-1][w-weight[i-1]],dp[i-1][w]);
	   }else{
	     dp[i][w]=dp[i-1][w];
	   }
	   }
	}
	return dp[n][W];
	}
public static void main(String[] args){
        int w1 = 4;
        int[] profit1 = {1, 2, 3};
        int[] weight1 = {4, 5, 6};
        int n1 = profit1.length;
		System.out.println("Output(Tabulation):"+Knapsack Tabulation(weight1,profit1,w1,n1));
}
}
	 