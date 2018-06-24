import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;


/*
 Author : Rathnayake R.M.K.D
 Date : 2018 06 12
 */

public class Graph {

    // Graph space Complexcity is E+ V
    private int V;// to hold number of Vertices
    private int E; // to hold Number of Edges
    private List <Integer>[] adj;// to hold adjecancy list

    // intiate the graph by inserting Number of Vertices
    public Graph(int V) {
        this.V = V;
        this.E = 0;
        adj = (List <Integer>[]) new List[V];
        for (int v = 0; v < V; v++) {
            adj[v] = new ArrayList <> ();
        }
    }


    public Graph(BufferedReader in) throws IOException {
        this (Integer.parseInt (in.readLine ( )));

        int E = Integer.parseInt (in.readLine ( ));

        for (int i = 0; i < E; i++) {  // Add an edge.
            String line = in.readLine ( );

            String[] Value = new String[2];

            Value = line.split (" ");

            int v = Integer.parseInt (Value[0]);
            int w = Integer.parseInt (Value[1]);

            addEdge (v, w); // add edge v to w
        }
    }

    public int getVertices() {
        return V;
    }

    public int getEdges() {
        return E;
    }

    public void addEdge(int v, int w)

    {
        adj[v].add (w);
        adj[w].add (v);
        E++;
    }

    public Iterable <Integer> adj(int v) {
        return adj[v];
    }

}

