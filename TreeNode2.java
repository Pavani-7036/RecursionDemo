import java.util.*;
class TreeNode {
    int val;    
    TreeNode left,right;
    TreeNode(int val){this.val=val; }
}
public class Main{

    public TreeNode sortedArrayToBST(int[] nums) {
        return buildBST(nums, 0, nums.length - 1);
    }
    
    private TreeNode buildBST(int[] nums, int left, int right) {
        if (left > right) return null;
        int mid = left + (right - left) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        
        root.left = buildBST(nums, left, mid - 1);
        root.right = buildBST(nums, mid + 1, right);
        
        return root;
    }
    public void printLevelOrederWithNulls(TreeNode root){
        if(root==null){
            System.out.println("[]");
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        List<String> result = new ArrayList<>();
        while(!queue.isEmpty()){
            TreeNode = queue.poll();
            if(node!=null){
                result.add(String.valueOf(node.val));
                queue.offer(node.left);
                queue.offer(node.right);
            } else {
                result.add("null");
            }
        }
        int i = result.size() - 1;
        while(i>=0 && result.get(i).equals("null")){
            result.remove(i);
            i--;
        }
        System.out.println(result);
        
    }
     public static void main(String[] args) {
            Main sol = new Main();
            int[] num1= {-10, -3, 0, 5, 9};
            TreeNode root = sol.sortedArrayToBST(num1);
            System.out.print("BST1: ");
            sol.printLevelOrderWithNulls(root1);
            int[] num2= {1,3};
            TreeNode root = sol.sortedArrayToBST(num2);
            System.out.print("BST2: ");
            sol.printLevelOrderWithNulls(root2);
        
        
    
     }
}
