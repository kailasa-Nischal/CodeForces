import java.util.*;
import java.io.*;
 
 
 
public class Main {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
 
        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt() {
            return Integer.parseInt(next());
        }
 
        long nextLong() {
            return Long.parseLong(next());
        }
 
        double nextDouble() {
            return Double.parseDouble(next());
        }
 
        String nextLine() {
            String str = "";
            try {
                str = br.readLine().trim();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return str;
        }
    }
 
    static class FastWriter {
        private final BufferedWriter bw;
 
        public FastWriter() {
            this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }
 
        public void print(Object object) throws IOException {
            bw.append("" + object);
        }
 
        public void println(Object object) throws IOException {
            print(object);
            bw.append("\n");
        }
 
        public void close() throws IOException {
            bw.close();
        }
    }
 
    public static void main(String[] args) {
        try {
            FastReader in = new FastReader();
            FastWriter out = new FastWriter();
            int testCases = in.nextInt();
            while (testCases-- > 0) {
                //int n = in.nextInt();                                               
                String[] str = new String[2];
                str = in.nextLine().split(" ");               
                int n = Integer.parseInt(str[0]), x = Integer.parseInt(str[1]); 
                String[] s1 = new String[2*n];
                s1 = in.nextLine().split(" ");                     
                 int[] a=new int[2*n];                                                 
                 //HashMap<Integer,Integer> hs=new HashMap<>(); 
                //String s=in.nextLine();                                                       
                for(int i = 0; i <2*n; i++){                      
                    a[i]=Integer.parseInt(s1[i]);
                     //hs.put(a[i],hs.getOrDefault(a[i], 0)+1);                                                                                                            
                }                                    
                //long m=1000000007;                
                // ArrayList<Character> sorder=new ArrayList<>();    
                
               
                Arrays.sort(a);
                boolean ok=false;
                for (int i = 0; i < n; i++) {
                    if(a[n+i]-a[i]>=x)    continue;
                    else{ok=true;break;}
                }
                if(ok)  out.println("NO");
                else    out.println("YES");
            }                                                            
            
 
            out.close();
        } catch (
 
        Exception e) {
            System.out.print(e);
            return;
        }
    }
 
 
    public static class Pair implements Comparable<Pair> {
        int val, t;
 
        public Pair(int val, int t) {
            this.t = t;
            this.val = val;
        }
 
        public int compareTo(Pair o) {
            if (o.val == this.val)
                return this.val - o.val; // ascending order
            else
                return o.t - this.t; // desending order
        }
    }
 
}
