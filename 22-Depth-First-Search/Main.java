public class Main {

    public static void main(String[] args) {
        
        // Defining First Srearch = a search algorithm for traverising
        //                          a tree or graph data structures.

        // 1. Pick a route
        // 2. Keep going until you reach a dead end, 
        //    or a previously visited node
        // 3. Backtrack to the last node that has unvisited neighbours
        // 4. Repeat until all nodes are visited


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

        graph.depthFirstSearch(4); // Starting DFS from node E (index 4) 

    }


}