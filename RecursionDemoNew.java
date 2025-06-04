class RecursionDemoNew{
  static int fibonacci(int n){
     if(n==0){
      return 0;
     } 
	 else if(n==1){
	   return 1;
	 }
     else{
       return fibonacci(n-1)+fibonacci(n-2);
     }
   }
    public static void main(String[] args){ 
      int number=10;
      int result=fibonacci(number);
      System.out.println("fibonacci"+ number +"is"+result);
    }
}