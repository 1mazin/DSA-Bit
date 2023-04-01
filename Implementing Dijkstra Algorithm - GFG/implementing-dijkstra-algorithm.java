//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class DriverClass
{
    public static void main(String args[]) throws IOException {

        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String str[] = read.readLine().trim().split(" ");
            int V = Integer.parseInt(str[0]);
            int E = Integer.parseInt(str[1]);
    
            ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<ArrayList<ArrayList<Integer>>>();
            for(int i=0;i<V;i++)
            {
                adj.add(new ArrayList<ArrayList<Integer>>());
            }
            
            int i=0;
            while (i++<E) {
                String S[] = read.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                int w = Integer.parseInt(S[2]);
                ArrayList<Integer> t1 = new ArrayList<Integer>();
                ArrayList<Integer> t2 = new ArrayList<Integer>();
                t1.add(v);
                t1.add(w);
                t2.add(u);
                t2.add(w);
                adj.get(u).add(t1);
                adj.get(v).add(t2);
            }
            
            int S = Integer.parseInt(read.readLine());
            
            Solution ob = new Solution();
            
            int[] ptr = ob.dijkstra(V, adj, S);
            
            for(i=0; i<V; i++)
                System.out.print(ptr[i] + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Pair
{
  int distance, node;
  Pair(int dist, int n)
  {
    this.distance = dist;
    this.node =n;
    //default constructor
  }
  
}

class Solution
{
    //Function to find the shortest distance of all the vertices
    //from the source vertex S.
    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S)
    {
        // Write your code here
        PriorityQueue<Pair> pq=new PriorityQueue<>((x,y)->x.distance-y.distance);
        int dist[]=new int[V];
        for(int i=0;i<V;i++) dist[i]=(int)1e9;
        dist[S]=0;
        pq.add(new Pair(0,S));
        
        while(!pq.isEmpty())
        {
            int currdist=pq.peek().distance;
            int currnode=pq.peek().node;
            pq.remove();
            
            for(int i=0;i<adj.get(currnode).size();i++)
            {
                int d=adj.get(currnode).get(i).get(1);
                int n=adj.get(currnode).get(i).get(0);
                
                if(dist[n]>d+currdist)
                {
                    dist[n]=d+currdist;
                    pq.add(new Pair(dist[n],n));
                }
            }
        }
        return dist;
    }
}
