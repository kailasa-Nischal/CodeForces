import java.util.*;
import java.io.*;
import java.lang.reflect.Array;


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
                 int n = in.nextInt();                               
                // String s=in.nextLine();
                //  String[] s = new String[2];
                //  s = in.nextLine().split(" ");                
                // int n = Integer.parseInt(s[0]), m = Integer.parseInt(s[1]); 
                String[] s = new String[n];
                s = in.nextLine().split(" ");                     
                int[] a=new int[n];  
                int[] sum=new int[n];    
                Arrays.fill(sum,0);                                                                                                             
                for (int i = 0; i <n; i++){                      
                    a[i]=Integer.parseInt(s[i]);
                    if(i==0)    sum[i]=a[i];
                    else    sum[i]=sum[i-1]+a[i];                                                                                
                }                                    
                //long m=1000000007;                
                // ArrayList<Character> sorder=new ArrayList<>();
                //HashMap<Integer,Integer> hs=new HashMap<>();             
                boolean getans=false;
                if(sum[n-1]!=0) getans=true;
                else{
                    for (int i = 0; i < n-1; i++) {                        
                        if(sum[i]<0){getans=true;break;}
                        else if(sum[i]==0){
                            for (int j = i+1; j <n; j++){                                
                                if(sum[j]!=0){ getans=true;break;}
                            }
                            if(getans)  break;
                        }
                        if(getans)  break;
                    }
                }
                if(getans)    out.println("NO");
                else out.println("YES");                

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
