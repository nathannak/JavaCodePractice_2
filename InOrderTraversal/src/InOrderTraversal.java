
public class InOrderTraversal {

	public static void main(String[] args) 
	{
		//create tree call in-order traversal
	}

	//
	void printInorder(Node node) 
	{ 
	    if (node == null) 
	        return; 

	    /* first recur on left child */
	    printInorder(node.left); 

	    /* then print the data of node */
	    System.out.print(node.data + " "); 

	    /* now recur on right child */
	    printInorder(node.right); 
	} 
	//
	
	// Tree Node 
    static class Node { 
        int data; 
        Node left, right; 
        Node(int data) 
        { 
            this.data = data; 
            this.left = null; 
            this.right = null; 
        } 
    } 

}


