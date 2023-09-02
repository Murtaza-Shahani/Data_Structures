import java.util.*;
class Node 
         {

         int data;
		 
         Node right,left;
   
          Node(){
			  
	   right=left=null;
                  }
          }
	
	
	class BstRec{
		
		Node root;
	
		BstRec(){
			
			root=null;
		        }
				
	public Node Inserbt(Node root, int value){
		  Node newnode=new Node();
		  newnode.data=value;
		  
		
		   if(root == null){
			   root=newnode;
			   return root;
		   }
		   else{
			   if(value>root.data){
				   
				   root.right=Inserbt(root.right,value);
			                       }
				   
				   else{
					   root.left=Inserbt(root.left,value);
			            }
		       
			   }
			   return root;
			   
	}
			   
			   
			   public void Inorder(Node root){
				   
			if(root==null){
				System.out.println("tree has no leaf its empty");
				return;
			}
			
			
			else{
			if(root.left!=null)
			Inorder(root.left);
			System.out.print(root.data+" ");
			
			if(root.right!=null)
			Inorder(root.right);
		
		}
		}
		
		public void LevelOrder(Node root)   // level order traversal method iteratively approach
		
		{
			if(root==null)
				return;
			
			Queue<Node> q=new LinkedList<>();
			q.add(root);
			q.add(null);
			
			while(!q.isEmpty())
			{
				
				Node currN=q.remove();
				if(currN==null){
					
					System.out.println();
					if(q.isEmpty()){
						break;
					                }
				else{
					q.add(null);
					
				    }
				                 }
    else{
		
		System.out.println(currN.data+" ");
		
		if(currN.left!=null){
			q.add(currN.left);
			
			}
			
			if(currN.right!=null){
			q.add(currN.right);
			
			}
	       }
			}
		}
			
			
			
	   public int  CountNodes(Node root)       // method to count the nodes of the the tree
	   {
		   
		   if(root==null){
			   return 0 ;
		                  }
		   int leftNodes=CountNodes(root.left);        // getting the number of the left nodes
		   int rightNodes=CountNodes(root.right);      // getting the number of the right nodes
		 //  System.out.println(" why there is nothing ");
		   
		   int total = leftNodes + rightNodes+1;             // Adding left and right + root and return them
		   return total;
		  
		  
	   }
	   
	   
	   public int SumOfNodes(Node root)     // method to caculate the sum of the nodes
	   {
	   if(root==null)                       // Base case
		   return 0;
	   
	   int leftSum=SumOfNodes(root.left);      //calculating left subtree sum
	   int rightSum=SumOfNodes(root.right);    //calculating right subtree sum
	   
	   return leftSum+rightSum+root.data;
	   
	   }
	   
	   
	   public int HeightOfTree(Node root)     //   Method to caculate the height of the tree
	   {
		if(root==null)                         // Base case
		return 0;
		
		int leftSum=HeightOfTree(root.left); 
		int rightSum=HeightOfTree(root.right);
		int Height= Math.max(leftSum,rightSum)+1;
		return Height;
	   }
	   
	   
	   public Node Deletion(Node root, int val)    // Method to delete Node from BST
	   {
		   if(root.data>val){
			   
		  root.left = Deletion(root.left,val);
		   
		                     }
	 else if(root.data<val){
	 
		root.right = Deletion(root.right,val);
								 
							 }
							 
	  else{           // root.data==val means that should be delete
	                     // case1 leaf node
		if(root.left ==null && root.right == null){
			return null;
			
		                                   }
		
		//case2 there is one child of the deleted value
		if(root.left == null){
			
			return root.right;      // root.left is null so return root .right instead root
		                   }
						   
	  else if(root.right == null){ 
	  
	          return root.left;    // root.right is null so return root.left instead root
		  
	                               }
								   
								   //case3 right node and left node both are not null
	   else{
		   
		   Node IS = InorderSuccessor(root.right);
		   
		   root.data=IS.data;
		   
		   root.right= Deletion(root.right,IS.data);
		   
		   }
	  }
		   return root;
		
		
		
		    
		
	             }
	   
	   public Node InorderSuccessor(Node curr)
	   {
		   while(curr.left!=null){
			   curr=curr.left;
		   
	                           }
	   return curr;
	   }
	   
	   
	   
	   
	   
	   
	   
	   
		   
	   
		   
		   
		   
		   
		   
		   
		   
	                              
	   
	   
	   
		public static void main(String[] args){
			
			BstRec B=new BstRec();
			Node Root=new Node();
			Root.data=5;
			B.Inserbt(Root,8);
			B.Inserbt(Root,7);
			B.Inserbt(Root,12);
			B.Inserbt(Root,4);
			B.Inserbt(Root,20);
			B.Inorder(Root);
			System.out.println();
			System.out.println("printing the nodes levelvise");
			System.out.println();
			B.LevelOrder(Root);
			System.out.println();
			System.out.println("printing the number of the nodes"+":"+B.CountNodes(Root));
			System.out.println();
			System.out.println("sum of tree is"+":"+B.SumOfNodes(Root));
		    System.out.println();
			System.out.println("height of tree is"+":"+B.HeightOfTree(Root));
			System.out.println();
			System.out.println("calling the deletion method");
			B.Inorder(Root);
			System.out.println();
			B.Deletion(Root, 8);
			B.Inorder(Root);
			
	
	
	
	}
	}
		
		
		