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
                int n = in.nextInt();
                // String[] s = new String[2];
                // s = in.nextLine().split(" ");
                // int n = Integer.parseInt(s[0]), m = Integer.parseInt(s[1]);
                  String s=in.next();
                  String t=in.next();
                //  int[] a=new int[n];
                // String[] s1=new String[n];
                // s1=in.nextLine().split(" ");   
                // int sum=0;                           
                // for (int i = 0; i <n; i++){                               
                //     a[i]=Integer.parseInt(s1[i]); 
                //     sum+=a[i];                        
                // }                
                //long m=1000000007;                
                
                ArrayList<Character> sorder=new ArrayList<>();
                ArrayList<Integer> spos=new ArrayList<>();
                for (int i = 0; i < s.length(); i++) {
                    char ch=s.charAt(i);
                    if(ch!='b'){
                        sorder.add(ch);
                        spos.add(i);
                    }
                }
                ArrayList<Character> torder=new ArrayList<>();
                ArrayList<Integer> tpos=new ArrayList<>();
                for (int i = 0; i < t.length(); i++) {
                    char ch=t.charAt(i);
                    if(ch!='b'){
                        torder.add(ch);
                        tpos.add(i);
                    }
                }
                if(sorder.size()!=torder.size())    out.println("NO");
                else{
                    boolean flag=false;
                    for (int i = 0; i < sorder.size(); i++) {
                        if(sorder.get(i)!=torder.get(i)){flag=true;break;}
                        else{
                            if(sorder.get(i)=='a'){
                                if(spos.get(i)>tpos.get(i))   {flag=true;break;}                                
                            }
                            else{
                                if(spos.get(i)<tpos.get(i))   {flag=true;break;} 
                            }
                        }
                    }
                   if(flag)    out.println("NO");
                   else    out.println("YES");
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
