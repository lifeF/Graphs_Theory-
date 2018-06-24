/*
Author Kalana Dhananjaya Rathnayajake
Date : 2018 06 22
Depth first search algorithms
 */

public class DepthFirstSearch
{
    private  boolean[] marked;
    private  int count;

    public DepthFirstSearch(Graph G, int start) {

        marked = new boolean[G.getVertices ()];
        this.DepthFirstSearch(G, start);
    }

    public  void DepthFirstSearch(Graph G, int v) {

        marked[v] = true;
        count++;

        for (int w : G.adj(v))
            if (!marked[w]) {
                DepthFirstSearch (G, w);
            }
    }

    public boolean marked(int w) {
        return marked[w];
    }
    public int count() {
        return count;
    }
}