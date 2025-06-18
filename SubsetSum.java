import java.util.Arrays;
public class SubsetSum{
   public static boolean isSubsetSum(int[] arr,int n,int target){
	    if(target==0){
	     return true;
	  }
      if(n==0){
	     return false;
	  }
	 
	  if(arr[n-1]>target){
		  return isSubsetSum(arr,n-1,target);
	  }
	     return isSubsetSum(arr,n-1,target)||isSubsetSum(arr,n-1,target-arr[n-1]);
	  }
	  public static void main(String[] args){
	     int[] arr={34,3,4,12,5,2};
		 int target=37;
		 int n=arr.length;
		 boolean result=isSubsetSum(arr,n,target);
		 System.out.println("Subset with given sum exists:"+result);
	  }
}
	  
	   