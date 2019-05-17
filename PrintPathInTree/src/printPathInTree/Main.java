
package printPathInTree;

import java.util.Stack;

public class Main {

public static void main(String[] args) {
		
		Stack<Integer> stk = new Stack<>();
		
		Node root = new Node(2);
		
		root.lchild = new Node(3);
		root.rchild = new Node(5);
		
		root.lchild.lchild = new Node(4);
		root.rchild.lchild = new Node(7);
		root.rchild.rchild = new Node(8);
						
		printAllPathUtil( root , stk );
		
	}

private static void printAllPathUtil(Node curr, Stack<Integer> stk) { 

	if (curr == null)
		return;          

	stk.push(curr.data);          

	if (curr.lchild == null && curr.rchild == null) {                  
		System.out.println(stk);
		stk.pop();
		return;          
	}          

	printAllPathUtil(curr.rchild, stk);          
	printAllPathUtil(curr.lchild, stk);

	stk.pop(); 

	}

}

class Node {
	
	int data;
	
	Node(int data) {
		this.data= data;
	}
	
	Node lchild;
	Node rchild;
	
}
