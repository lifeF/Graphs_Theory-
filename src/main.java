import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/*
    Author Kalana Dhananajaya Rathnayake
    Date : 2018 09 13
 */
public class main {

    public static void main(String [] args){


        BufferedReader br = null;
        FileReader fr = null;

        try {
//use for Undirected Graph---------------------------------------------------
//            //br = new BufferedReader(new FileReader(FILENAME));
//            fr = new FileReader("Graph/src/t1.txt");
//            br = new BufferedReader(fr);
//
//            Graph G1 = new Graph (br);
//            DepthFirstSearch D1 = new DepthFirstSearch (G1,1);
//
//            int s = 0;
//            DepthFirstPath search = new DepthFirstPath(G1, s);
//             for (int v = 0; v < G1.getVertices (); v++)
//             {
//                System.out.print(s + " to " + v + ": ");
//                if (search.hasPathTo(v))
//                   for (int x : search.pathTo(v))
//                      if (x == s) System.out.print(x);
//                      else System.out.print("-" + x);
//                 System.out.println();

//        }
//--------------------------------------------------------------------------------

// Use for Directed Graph---------------------------------------------------------
            fr = new FileReader("Graph/src/t2.txt");
            br = new BufferedReader(fr);

            WeightedGraph WG1 = new WeightedGraph (br);
            LazyPrimMST L1 = new LazyPrimMST (WG1);


//            for(Edge E: L1.edges ()){
//                System.out.println (E.toString () );
//            }


//--------------------------------------------------------------------------------
        } catch (IOException e) {

            e.printStackTrace();

        }
    }
}
