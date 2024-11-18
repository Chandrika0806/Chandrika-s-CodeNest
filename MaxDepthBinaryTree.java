// Node class for the binary tree
class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

// BinaryTree class
class BinaryTree {
    Node root;

    public BinaryTree() {
        this.root = null;
    }

    // Method to calculate the maximum depth or height of the binary tree
    public int maxDepth(Node node) {
        // If the tree is empty, return 0
        if (node == null) return 0;

        // Recursively calculate the height of left and right subtrees
        int leftDepth = maxDepth(node.left);
        int rightDepth = maxDepth(node.right);

        // Return the maximum of the two heights plus 1
        return Math.max(leftDepth, rightDepth) + 1;
    }
}

// Main class to test the implementation
public class MaxDepthBinaryTree {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Building the tree
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        // Calculate and display the height of the tree
        System.out.println("The maximum height of the tree is: " + tree.maxDepth(tree.root));
    }
}
