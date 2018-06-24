public class DepthFirstSearch
{
    private  boolean[] marked;
    //private static boolean[] marked;
    private  int count;
    public DepthFirstSearch(Graph G, int start)
    {
        marked = new boolean[G.getVertices ()];
        this.dfs(G, start);
    }

    public  void dfs(Graph G, int v)
    {
        marked[v] = true;
        System.out.println ("mark as true : " + v +" Vertex " );
        count++;
        for (int w : G.adj(v))
            if (!marked[w]) {

                dfs (G, w);
            }
    }

    public boolean marked(int w)
    {
        return marked[w];
    }
    public int count()
    {
        return count;
    }
}