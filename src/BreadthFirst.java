import sun.misc.Queue;

public class BreadthFirst {

        private boolean[] marked; // Is a shortest path to this vertex known?
        //private int[] edgeTo;     // last vertex on known path to this vertex
        private final int s;      // source

        public BreadthFirst(Graph G, int s) throws InterruptedException {
            marked = new boolean[G.getVertices ()];
            //edgeTo = new int[G.getVertices ()];
            this.s = s;
            bfs(G, s);
        }

        private void bfs(Graph G, int s) throws InterruptedException {
            Queue <Integer> queue = new Queue <Integer> ( );
            marked[s] = true;          // Mark the source
            queue.enqueue (s);          //   and put it on the queue.
            while (!queue.isEmpty ( )) {
                //Remove next vertex from the queue.
                int v = queue.dequeue ( );
                for (int w : G.adj (v))
                    if (!marked[w]) {
                        //edgeTo[w] = v;
                        marked[w] = true;
                        queue.enqueue (w);

                    }
            }
        }

}
