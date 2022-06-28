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
            int testCases=in.nextInt();
            while(testCases-- > 0){                  
               // int n=in.nextInt();
                String[] str=new String[2];                
                str=in.nextLine().split(" ");
                int n=Integer.parseInt(str[0]),k=Integer.parseInt(str[1]);                                
                int[] a=new int[n];   
                String[] s=new String[n];                
                s=in.nextLine().split(" ");
                for (int i = 0; i <n; i++) {
                    a[i]=Integer.parseInt(s[i]);
                }  
                
                int totall=0;
                for (int i = 1; i <n-1; i++) {
                    if(a[i]>a[i-1]+a[i+1])  totall++;
                }                          
                if(k>2) out.println(totall);
                else{
                    if(n%2==0)  out.println((n-2)/2);
                    else    out.println((n-1)/2);
                }
            }
                
                out.close();
            }                                              
         catch (Exception e) {
            System.out.print(e);
            return;
        } 
    }
     public static class Pair implements Comparable<Pair>{
        int val,t;
        public Pair(int val,int t){
            this.t=t;
            this.val=val;
        }        
        public int compareTo(Pair o) {
            if(o.val==this.val) return this.t-o.t; //ascending order
            else    return o.val-this.val;  //desending order
        }
    }    
    
}