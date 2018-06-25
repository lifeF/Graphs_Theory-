import java.util.ArrayList;
import java.util.List;

/*
Kalana Dhananjay Rathnayake

Directed Graph
 */

public class DiGraph
{
    private final int V;
    private int E;
    private List<Integer>[] adj;
        public DiGraph(int V)
        {
            this.V = V;
            this.E = 0;
            adj = (List <Integer>[]) new List[V];
            for (int v = 0; v < V; v++)
                adj[v] = new ArrayList <> ();
        }

        public int V()  {  return V;  }
        public int E()  {  return E;  }

        public void addEdge(int v, int w) {
            adj[v].add (w);
            E++;
        }
        public Iterable<Integer> adj(int v) {
            return adj[v];
        }

        public DiGraph reverse()
        {
            DiGraph R = new DiGraph (V);
            for (int v = 0; v < V; v++)
                for (int w : adj (v))
                    R.addEdge(w, v);
            return  R;
        }
}