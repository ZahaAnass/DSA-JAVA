import java.util.ArrayList;

public class Graph {

    ArrayList<Node> nodes;
    int[][] matrix;
    
    Graph(int size) {
        nodes = new ArrayList<>();
        matrix = new int[size][size];
    }

    public void addNode(Node node) {
        nodes.add(node);
    }

    public void addEdge(int src, int dst) {
        matrix[src][dst] = 1;
    }

    public boolean checkEdge(int src, int dst) {
        return (matrix[src][dst] == 1 ) ? true : false;
    }

    public void print() {
        System.out.print("  ");

        for(Node node : nodes) {
            System.out.print(node.data + " ");
        }

        System.out.println();

        for (int i = 0; i < matrix.length; i++) {
            System.out.print(nodes.get(i).data + " ");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    public void depthFirstSearch(int start) {
        boolean[] visited = new boolean[matrix.length];
        dFSHelper(start, visited);

    }

    private void dFSHelper(int start, boolean[] visited) {

        if(visited[start]) {
            return;
        }else{
            visited[start] = true;
            System.out.println(nodes.get(start).data + " = visited ");

            for (int i = 0; i < matrix[start].length; i++) {
                if (matrix[start][i] == 1 && !visited[i]) {
                    dFSHelper(i, visited);
                }
            }
        }
        
        for(int i = 0; i < matrix[start].length; i++) {
            if(matrix[start][i] == 1 && !visited[i]) {
                dFSHelper(i, visited);
            }
        }
        
        return;

    }

}
