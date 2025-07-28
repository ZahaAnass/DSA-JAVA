
public class Main {

    public static void main(String[] args) {

        // Binary Search Tree = A tree data structure, where each node is greather that it's left child,
        //                      but less that it's right. 

        //                      benefit: easy to locate a node when they are in this order

        //                      time copmlexity: best case O(log n)
        //                                       worst case O(n)

        //                      space complexity: O(n)

        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(new Node(5));
        tree.insert(new Node(1));
        tree.insert(new Node(9));
        tree.insert(new Node(2));
        tree.insert(new Node(7));
        tree.insert(new Node(3));
        tree.insert(new Node(6));
        tree.insert(new Node(4));
        tree.insert(new Node(8));

        tree.display();
        System.out.println(tree.search(3));

        tree.remove(8);

        tree.display();

    }

}