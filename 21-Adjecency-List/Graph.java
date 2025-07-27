import java.util.*;

public class Graph {

    ArrayList<LinkedList<Node>> alist;
    
    Graph(int size) {
        alist = new ArrayList<>();
    }

    public void addNode(Node node) {
        LinkedList<Node> currentList = new LinkedList<>();
        currentList.add(node);
        alist.add(currentList);
    }

    public void addEdge(int src, int dst) {
        LinkedList<Node> currentList = alist.get(src);
        Node destinationNode = alist.get(dst).get(0);
        currentList.add(destinationNode);

    }

    public boolean checkEdge(int src, int dst) {
        LinkedList<Node> currentList = alist.get(src);
        Node destinationNode = alist.get(dst).get(0);

        for (Node node : currentList) {
            if (node.data == destinationNode.data) {
                return true;
            }
        }
        return false;
    }

    public void print() {
        for(LinkedList<Node> list : alist) {
            for(Node node : list) {
                System.out.print(node.data + " -> ");
            }
            System.out.println("");
        }

    }

}
