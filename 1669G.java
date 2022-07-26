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
                // int n = in.nextInt();                               
                // String s=in.nextLine();
                String[] s = new String[2];
                s = in.nextLine().split(" ");                
                int n = Integer.parseInt(s[0]), m = Integer.parseInt(s[1]);                   
                char[][] a=new char[n][m];                                                                                                                    
                for (int i = 0; i <n; i++){  
                    // String[] s1=new String[m];
                    // s1=in.nextLine().split(" ");  
                    String s1=in.nextLine();
                    for (int j = 0; j < m; j++){
                        a[i][j]=s1.charAt(j); 
                    }                                                                                                               
                }                                    
                //long m=1000000007;                
                // ArrayList<Character> sorder=new ArrayList<>();
                //HashMap<Integer,Integer> hs=new HashMap<>();             
                       
                for (int i = 0; i < m; i++) {
                    int rem=n;
                    for (int j = n-1; j >=0; j--) {
                        if(a[j][i]=='o')    rem=j;
                        else if(a[j][i]=='*'){
                            a[j][i]='.';
                            a[rem-1][i]='*';
                            rem--;
                        }
                    }
                }                
                for (int i = 0; i < a.length; i++){
                    for (int j = 0; j < a[0].length; j++){
                        out.print(a[i][j]);
                    }
                    out.println("");
                }


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
