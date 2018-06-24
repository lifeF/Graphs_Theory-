import java.util.Stack;

public class DepthFirstPath
{
    private boolean[] marked; // Has dfs() been called for this vertex?
    private int[] edgeTo;     // last vertex on known path to this vertex
    private final int s;      // source
    public DepthFirstPath(Graph G, int s)
    {
        marked = new boolean[G.getVertices ()];
        edgeTo = new int[G.getVertices ()];
        this.s = s;
        dfs(G, s);
    }
    private void dfs(Graph G, int v)
    {
        marked[v] = true;
        for (int w : G.adj(v)){
            if (!marked[w])
            {
                edgeTo[w] = v;
                dfs(G, w);
            }
        }

    }

    public boolean hasPathTo(int v)
    {
        return marked[v];
    }
    public Iterable<Integer> pathTo(int v)
    {

        if (!hasPathTo(v)) return null;
        Stack<Integer> path = new Stack<Integer>();
        for (int x = v; x != s; x = edgeTo[x])
            path.push(x);
        path.push(s);
        return path;
    }
}

