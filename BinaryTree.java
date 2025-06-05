class Node{
  int val;
  Node left,right;
  Node(int val){
   this.val=val;
   left=right=null;
  }
}
public class BinaryTree{
 Node root;
void buildSampleTree(){
 root=new Node(1);
 root.left=new Node(2);
 root.right=new Node(3);
 root.left.left=new Node(4);
 root.left.right=new Node(5);
}
void inorder(Node node){
 if( node!=null){
  inorder(node.left);
  System.out.println(node.val+" ");
  inorder(node.right);
 }
}
void preorder(Node node){
 if( node!=null){
  System.out.println(node.val+" ");
  preorder(node.left);
  preorder(node.right);
 }
}
void postorder(Node node){
 if( node!=null){
  postorder(node.left);
  postorder(node.right);
  System.out.println(node.val+" ");
 }
}
void levelorder(){
 if(root==null)return;
java.util.Queue<Node>queue=new java.util.LinledList<>();
 queue.add(root);
 while(!queue.isEmpty()){
  Node current=queue.poll();
  System.out.println(current.val+" ");
  if(current.left!=null)
   queue.add(current.left);
  if(current.right!=null)
   queue.add(current.right);
 }
}
public static void main(String[] args){
  BinaryTree tree=new BinaryTree();
  tree.buildSampleTree();
  System.out.println("Inorder Traversal:");
  tree.inorder(tree.root);
  System.out.println("\n Preorder Traversal:");
  tree.preorder(tree.root);
  System.out.println("\n postorder Traversal:");
  tree.postorder(tree.root);
  System.out.println("\n LevelOrder Traversal:");
  tree.levelorder();
}
}
  
  
  
  
 


  


 