import java.util.*;
import java.io.*;

public class Main{
    static class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader(){
            br=new BufferedReader(new InputStreamReader(System.in));
        }
        String next(){
            while(st==null || !st.hasMoreTokens()){
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt(){
            return Integer.parseInt(next());
        }
        long nextLong(){
            return Long.parseLong(next());
        }
        double nextDouble(){
            return Double.parseDouble(next());
        }
        String nextLine(){
            String str="";
            try {
                str=br.readLine().trim();
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
            FastReader in=new FastReader();
            FastWriter out = new FastWriter();
            // int testCases=in.nextInt();
            // while(testCases-- > 0){  
                
               // int n=in.nextInt();
                String[] str=new String[3];                
                str=in.nextLine().split(" ");
                int y=Integer.parseInt(str[0]),k=Integer.parseInt(str[1]),n=Integer.parseInt(str[2]);                                
            //    int[] a=new int[n];                
            //     for (int i = 0; i < str.length; i++) {
            //         a[i]=Integer.parseInt(str[i]);
            //     }

                
                int x=k-(y%k);
                boolean flag=false;
                while(x<=(n-y)){
                    flag=true;
                    out.print(x+" ");
                    x+=k;
                }
                if(flag)    out.println(" ");
                else    out.println(-1);
                
            //}
                
                out.close();
            }                                              
         catch (Exception e) {
            return;
        }
 
    }
}