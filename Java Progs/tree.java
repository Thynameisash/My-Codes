import java.util.Arrays;
import java.util.Scanner;

class Node {
    Node left, right;
    int val;

    public Node(int val) {
        this.val = val;
    }
}

public class tree {
    static Scanner sc = null;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        Node root = create();
        System.out.println("Pre Order:  ");
        preorder(root);
        System.out.println("\nIn Order: ");
        inorder(root);
        System.out.println("\nPost Order: ");
        postorder(root);
    }

    static Node create() {
        Node root = null;
        System.out.println("Enter Data: ");
        int val = sc.nextInt();
        if (val == -1)
            return null;
        root = new Node(val);
        System.out.println("Enter left val for " + val);
        root.left = create();
        System.out.println("Enter right val for " + val);
        root.right = create();
        return root;
    }

    static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);

    }

    static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);

    }

    static void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val + " ");

    }
}
