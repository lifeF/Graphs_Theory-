//import com.sun.tools.javac.util.List;



public class DirectedDFS
{
    private boolean[] marked;
    public DirectedDFS(DiGraph G, int s)
    {
        marked = new boolean[G.V()];
        dfs(G, s); }
    public DirectedDFS(DiGraph G, Iterable<Integer> sources)
    {
        marked = new boolean[G.V()];
        for (int s : sources)
            if (!marked[s]) dfs(G, s);
    }
    private void dfs(DiGraph G, int v)
    {
        marked[v] = true;
        for (int w : G.adj(v))
            if (!marked[w]) dfs(G, w);
    }
    // Reached from s to v
    public boolean marked(int v)
    {  return marked[v];  }

}
