import java.util.Stack;

public class Main {

public static void main(String[] args) {

		Node root = new Node(5);
		
		root.lchild = new Node(2);
		root.rchild = new Node(3);

		root.lchild.lchild = new Node(7);
		root.lchild.rchild = new Node(8);
		
		root.lchild.lchild.lchild = new Node(9);
		
		treeDFS(root);	

	}

public static void treeDFS(Node root) {
		
		Stack<Node> arr = new Stack<>();

		if(root != null) {
			arr.push(root);
		}
		
		while(!arr.isEmpty()) {
			
			Node temp_node = arr.pop();
			System.out.println(temp_node.data);
			
			if(temp_node.rchild != null){
				arr.push(temp_node.rchild);
			}
			
			if(temp_node.lchild != null){
				arr.push(temp_node.lchild);
			}

		}
			
	}

}

class Node {
	
	int data;
	
	Node(int data) {
		this.data= data;
		lchild=null;
		rchild=null;
	}
	
	Node lchild;
	Node rchild;
	
}
