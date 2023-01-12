class Node { 
    int data;
    int yukseklik; 
    Node left, right; 
    Node(int d) 
    { 
        data = d; 
        left = right = null; 
        yukseklik=0;
    }
    public void displayNode() { System.out.print(" "+data+" "); } 
} 
class BinaryTree { 
    Node root;
    //Ağaçcın yüksekliğini hesapla
    int height(Node node) 
    { 
        /* base case tree is empty */
        if (node == null) 
            return 0; 
        return 1 + Math.max(height(node.left), height(node.right)); 
    } 
    //Ağaç dengelimi değilmi true yada false değer üretir
    boolean isBalanced(Node node) 
    { 
        int lh; //sol alt ağacın yüksekliği
        int rh; //sağ alt ağacın yüksekliği
        
        if (node == null) //ağaçta eleman yoksa 
            return true; 
  
        lh = height(node.left); //
        rh = height(node.right); 
  
        if (Math.abs(lh - rh) <= 1
            && isBalanced(node.left) 
            && isBalanced(node.right)) 
            return true; 
        return false; 
    } 
/*
    public void preOrder(BinaryTree localRoot)
    {
        BinaryTree tree = localRoot;
        if(tree!=null) 
        {
            tree.displayNode();
            preOrder(tree.left);
            preOrder(tree.right);
        }
    }

    private void displayNode() {
    }*/
    public static void main(String args[]) 
    { 
        BinaryTree tree = new BinaryTree(); 
        tree.root = new Node(10);                                  //10
        tree.root.left = new Node(7);                      //7            //15--
        tree.root.right = new Node(15);                //4     //8   //14    //18
        tree.root.left.left = new Node(4);         //8                              //20
        tree.root.left.right = new Node(8); 
        tree.root.left.right = new Node(18);
        tree.root.left.right.right = new Node(20);
        tree.root.right.left = new Node(14);

        if (tree.isBalanced(tree.root)) 
            System.out.println("Dengeli Ağaç"); 
        else
            System.out.println("Dengesiz Ağaç"); 
    } 
} 