public class Main {

    public static void main(String[] args) {
        
        // Adjecency List = An array/arrayList of linkedlists.
        //                  Each LinkedList has a unique node at head.
        //                  All adjecent nodes are stored in the linkedlist.

        //                  runtime complexity to check an Edge = 0(v)
        //                  space complexity = 0(v + e)

        Graph graph = new Graph(5);

        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));
    
        graph.addEdge(0, 1); // A <-> B
        graph.addEdge(1, 2); // B <-> C
        graph.addEdge(2, 3); // C <-> D
        graph.addEdge(2, 4); // C <-> E
        graph.addEdge(4, 0); // E <-> A
        graph.addEdge(4, 2); // E <-> C

        graph.print();

        System.out.println("Edge A <-> B: " + graph.checkEdge(0, 1));
        System.out.println("Edge B <-> D: " + graph.checkEdge(1, 3));
        System.out.println("Edge C <-> E: " + graph.checkEdge(2, 4));
        System.out.println("Edge E <-> A: " + graph.checkEdge(4, 0));
        System.out.println("Edge D <-> A: " + graph.checkEdge(3, 0));
        System.out.println("Edge E <-> C: " + graph.checkEdge(4, 2));
        System.out.println("Edge B <-> C: " + graph.checkEdge(1, 2));
        System.out.println("Edge A <-> D: " + graph.checkEdge(0, 3));
        System.out.println("Edge D <-> E: " + graph.checkEdge(3, 4));
        System.out.println("Edge C <-> D: " + graph.checkEdge(2, 3));


    }


}