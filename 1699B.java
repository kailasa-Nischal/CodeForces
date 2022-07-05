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
                String[] str = new String[2];
                str = in.nextLine().split(" ");
                int n = Integer.parseInt(str[0]), m = Integer.parseInt(str[1]);
                // String s=in.next();
                // int[][] a=new int[n];
                // String[] s=new String[m];
                // s=in.nextLine().split(" ");
                // for (int i = 0; i <n; i++){
                // String[] s=new String[m];
                // s=in.nextLine().split(" ");
                // for (int j = 0; j < s.length; j++){
                // a[i][j]=Integer.parseInt(s[j]);
                // }
                // }
 
                String one = "", two = "";
                int[] row1 = new int[m];
                int[] row2 = new int[m];
                for (int i = 0; i < (row2.length) / 2; i++) {
                    if (i % 2 == 0) {
                        row1[i * 2] = 1;
                        row1[(2 * i) + 1] = 0;
                    } else {
                        row1[2 * i] = 0;
                        row1[(2 * i) + 1] = 1;
                    }
                }
                for (int i = 0; i < row2.length; i++) {
                    if (row1[i] == 0)
                        row2[i] = 1;
                    else
                        row2[i] = 0;
                }
                for (int i = 0; i < (n / 2); i++) {
                    if (i % 2 == 0) {
                        for (int j = 0; j < row1.length; j++) {
                            out.print(row1[j] + " ");
                        }
                        out.println("");
                        for (int j = 0; j < row2.length; j++) {
                            out.print(row2[j] + " ");
                        }
 
                        out.println("");
                    } else {
                        for (int j = 0; j < row2.length; j++) {
                            out.print(row2[j] + " ");
                        }
                        out.println("");
                        for (int j = 0; j < row1.length; j++) {
                            out.print(row1[j] + " ");
                        }
                        out.println("");
                    }
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
                return this.t - o.t; // ascending order
            else
                return o.val - this.val; // desending order
        }
    }
 
}
