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

    public static long findmax(int s,int m){
        long res=0;
        while(s>0){
            for(int i=9;i>=1;i++){
                if(s>=i){
                    res+=(long)(i*Math.pow(10, --m));
                    s-=i;
                    break;
                }
            }
        }
        return res;        
    }
    public static void main(String[] args) {
        try {
            FastReader in=new FastReader();
            FastWriter out = new FastWriter();
            // int testCases=in.nextInt();
            // while(testCases-- > 0){  
                
                int n=in.nextInt();
                String[] str=new String[n];                
                str=in.nextLine().split(" ");
               // int m=Integer.parseInt(str[0]),s=Integer.parseInt(str[1]);                
               int[] a=new int[n];                
                for (int i = 0; i < str.length; i++) {
                    a[i]=Integer.parseInt(str[i]);
                }

                Arrays.sort(a);
                int idx=1;
                for (int i = 0; i < a.length; i++) {
                    if(a[i]!=idx)   break;
                    else    idx++;
                }
                out.println(idx);

                
            //}
                
                out.close();
            }                                              
         catch (Exception e) {
            return;
        }
 
    }
}
