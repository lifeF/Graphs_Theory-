import sun.misc.Queue;

public class LazyPrimMST
{
    private boolean[] marked;
    private Queue<Edge> mst;
    private MinPQ<Edge> pq;

    public LazyPrimMST(WeightedGraph G)
    {
        pq = new MinPQ<Edge>();
        marked = new boolean[G.V()];
        mst = new Queue<Edge>();
        visit(G, 0);   // assumes G is connected (see Exercise 4.3.22)
        while (!pq.isEmpty()) {
            Edge e = pq.delMin();                  // Get lowest-weight
            int v = e.either(), w = e.other(v);    //    edge from pq.
            if (marked[v] && marked[w]) continue;  // Skip if ineligible.
            mst.enqueue (e);
            if (!marked[v]) visit(G, v);
            if (!marked[w]) visit(G, w);
        }
    }

    private void visit(WeightedGraph G, int v)
    {  // Mark v and add to pq all edges from v to unmarked vertices.
        marked[v] = true;
        for (Edge e : G.adj(v))
            if (!marked[e.other(v)]) pq.insert(e);
    }
    public Iterable<Edge> edges() {
        return (Iterable <Edge>) mst;
    }
//    public double weight()   // See Exercise 4.3.31.
}
