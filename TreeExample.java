import java.util.ArrayList;
import java.util.List;

// TreeNode class represents a single node in the tree
class TreeNode {
    String data;
    TreeNode parent;
    List<TreeNode> children;

    // Constructor to initialize a tree node
    public TreeNode(String data) {
        this.data = data;
        this.parent = null;
        this.children = new ArrayList<>();
    }

    // Add a child node
    public void addChild(TreeNode child) {
        child.parent = this;
        this.children.add(child);
    }

    // Check if the node is a leaf
    public boolean isLeaf() {
        return children.isEmpty();
    }

    // Get level of the node
    public int getLevel() {
        int level = 0;
        TreeNode current = this;
        while (current.parent != null) {
            level++;
            current = current.parent;
        }
        return level;
    }

    // Print subtree
    public void printSubtree() {
        printSubtreeHelper(this, 0);
    }

    private void printSubtreeHelper(TreeNode node, int depth) {
        for (int i = 0; i < depth; i++) System.out.print("--");
        System.out.println(node.data);
        for (TreeNode child : node.children) {
            printSubtreeHelper(child, depth + 1);
        }
    }
}

// Main class to demonstrate the tree operations
public class TreeExample {
    public static void main(String[] args) {
        // Creating nodes
        TreeNode root = new TreeNode("A");
        TreeNode b = new TreeNode("B");
        TreeNode c = new TreeNode("C");
        TreeNode d = new TreeNode("D");
        TreeNode e = new TreeNode("E");
        TreeNode f = new TreeNode("F");

        // Building the tree
        root.addChild(b);
        root.addChild(c);
        b.addChild(d);
        b.addChild(e);
        c.addChild(f);

        // Print the entire tree
        System.out.println("Tree structure:");
        root.printSubtree();

        // Demonstrate basic terminology
        System.out.println("\nBasic Tree Terminologies:");
        System.out.println("Root Node: " + root.data);
        System.out.println("Parent of B: " + b.parent.data);
        System.out.println("Children of B: ");
        for (TreeNode child : b.children) {
            System.out.println("  " + child.data);
        }
        System.out.println("Is D a leaf? " + d.isLeaf());
        System.out.println("Level of node E: " + e.getLevel());
    }
}
