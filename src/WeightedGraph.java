import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WeightedGraph
{
    private  int V;
    private int E;
    private List<Edge>[] adj;
    public WeightedGraph(int V) {
        this.V = V;
        this.E = 0;
        adj = (List <Edge>[]) new List[V];
        for (int v = 0; v < V; v++)
            adj[v] = new ArrayList <Edge> ( );
    }

     public WeightedGraph(BufferedReader in) throws IOException {
         this (Integer.parseInt (in.readLine ( )));
         int E = Integer.parseInt (in.readLine ( ));

         for (int i = 0; i < E; i++) {  // Add an edge.
             String line = in.readLine ( );

             String[] Value = new String[2];

             Value = line.split (" ");

             int v = Integer.parseInt (Value[0]);
             int w = Integer.parseInt (Value[1]);
             Double weight = Double.parseDouble (Value[2]);
             Edge e = new Edge (v,w,weight);
             addEdge (e); // add edge v to w
         }
     }

        public int V() {  return V;  }
        public int E() {  return E;  }
        public void addEdge(Edge e)
        {
            int v = e.either(), w = e.other(v);
            adj[v].add(e);
            adj[w].add(e);
            E++;
        }

    public Iterable<Edge> adj(int v)
    {  return adj[v];  }
    public Iterable<Edge> edges()
    {
        List<Edge> b = new ArrayList <> () ;
        for (int v = 0; v < V; v++)
            for (Edge e : adj[v])
                if (e.other(v) > v) b.add(e);
        return b; }
}