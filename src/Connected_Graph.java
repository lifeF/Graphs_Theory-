public class Connected_Graph {

        private boolean[] marked;
        private int[] id;
        private int count;

        public Connected_Graph(Graph G) {
            marked = new boolean[G.getVertices ( )];
            id = new int[G.getVertices ( )];
            for (int s = 0; s < G.getVertices ( ); s++)

                if (!marked[s]) {
                    dfs (G, s);
                    count++;
                }
        }

        private void dfs(Graph G, int v)
        {
            marked[v] = true;
            id[v] = count;
            for (int w : G.adj(v))
                if (!marked[w])
                    dfs(G, w);
        }
        public boolean connected(int v, int w) {
            return id[v] == id[w];
        }
        public int id(int v) {
            return id[v];
        }
        public int count() {
            return count;
        }
}


