import java.util.*; 

class tree
{  
static class Node {  
    int data;  
     Node left, right;  
     
 };

static Node newNode(int data)  
{  
    Node temp = new Node();  
    temp.data = data;  
    temp.left = null;  
    temp.right = null;  
    return temp;  
}  

static Node insert(Node root, int data)  
{  
    Node newnode = newNode(data);  
    if (root == null){
        root = newnode;  
    }
    else if (data < root.data)  
        root.left=insert(root.left,data);  
    else
        root.right=insert(root.right,data);  
    return root;
}  
  

static void Postorder(Node root)  
{  
    if (root == null)  
        return;  
    else {  
        Postorder(root.left);   
        Postorder(root.right);  
        System.out.print( root.data+" "); 
    }  
}



public static void main(String args[])  
{
    Node root = null;  
    root = insert(root, 50);  
    root = insert(root, 30);  
    root = insert(root, 20);   
    root = insert(root, 40);  
    root = insert(root, 70);  
    root = insert(root, 60);  
    root = insert(root, 80);   
    Inorder(root);  
    System.out.println(" ");
    Postorder(root);
   
    
}  
}