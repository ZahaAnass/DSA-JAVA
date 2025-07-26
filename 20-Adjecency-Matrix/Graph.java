public class Graph {

    int[][] matrix;

    Graph(int size) {
        matrix = new int[size][size];
    }

    public void addNode(Node node) {

    }

    public void addEdge(Node src, Node dst) {
        matrix[src][dst] = 1;
    }

    public boolean checkEdge(Node src, Node dst) {
        return (matrix[src][dst] == 1 ) ? true : false;
    }

    public void print() {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

}
