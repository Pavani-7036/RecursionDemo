import java.util.Arrays;
public class Main6{
   public static void addEdge(int[][] mat,int i,int j){
      mat[i][j]=1;
	  mat[j][i]=1;
   }
public static void displayMatrix(int[][] mat){
     for(int[] row:mat){
	 for(int val:row){
	    System.out.println(val+" ");
	 }
	    System.out.println( );
	 }
}
public static void main(String[] args){
   int v=4;
   int[][] mat=new int[v][v];
   addEdge(mat,0,1);
   addEdge(mat,0,2);
   addEdge(mat,1,2);
   addEdge(mat,2,3);
   int[][] math={{0,1,0,0},
                  {1,0,1,0},
			      {0,1,0,1},
                  {0,0,1,0}};
   System.out.println("Adjacency Matrix Representation");
   displayMatrix(mat);
 }
 }
   