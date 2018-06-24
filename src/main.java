import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class main {

    public static void main(String [] args){


        BufferedReader br = null;
        FileReader fr = null;

        try {

            //br = new BufferedReader(new FileReader(FILENAME));
            fr = new FileReader("Graph/src/t1.txt");
            br = new BufferedReader(fr);

            Graph G1 = new Graph (br);
            DepthFirstSearch D1 = new DepthFirstSearch (G1,1);
//            for(int k : G1.adj (0)){
//                System.out.println (k);
//            }


        } catch (IOException e) {

            e.printStackTrace();

        }
    }
}
