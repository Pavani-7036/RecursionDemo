public class LCS{
   public static int lcs(char[] x,char[] y,int m,int n){
     if(m==0 || n==0){
	   return 0;
	 }
	if(x[m-1]==y[n-1]){
	  return 1+lcs(x,y,m-1,n-1);
	}
	else{
	  return Math.max(lcs(x,y,m,n-1),lcs(x,y,m-1,n));
	}
   }
public static void main(String[] args) {
        String str1 = "AGGTAB";
        String str2 = "GXTXAYB";

        char[] x = str1.toCharArray();
        char[] y = str2.toCharArray();

        int m = x.length;
        int n = y.length;

        int result = lcs(x, y, m, n);
        System.out.println("Length of LCS: " + result);
}
}