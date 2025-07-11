import java.util.Arrays;
class TreeNode{
  int data;
  TreeNode left;
  TreeNode right;
public TreeNode(int val){
   this.data=val;
   this.right=null;
   this.left=null;
}
}
public class Main2{
  public static TreeNode createbtree(int[]arr,int i,int n){
    if(i>n){
       return null;
    }
    TreeNode root=new TreeNode(arr[i-1]);
    root.left=createbtree(arr,2*i,n);
    root.right=createbtree(arr,2*i+1,n);
      return root;
  }
  public static void pre(TreeNode root){
    if(root==null){
      return;
    }
   System.out.println(root.data+" ");
   pre(root.left);
   pre(root.right);
 }
 public static void main(String[] args){
 int[] arr={1,2,3,4,5,6,7,};
 TreeNode btree=createbtree(arr,1,arr.length);
 System.out.println(btree);
 pre(btree);
 }
}
