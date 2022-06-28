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
                int n=in.nextInt();
                // String[] str=new String[2];                
                // str=in.nextLine().split(" ");
                // int n=Integer.parseInt(str[0]),z=Integer.parseInt(str[1]);                                
                int[] a=new int[n];   
                String[] s=new String[n];                
                s=in.nextLine().split(" ");
                for (int i = 0; i <n; i++) {
                    a[i]=Integer.parseInt(s[i]);
                }  
                
                    int start=0,end=n-1;
                    while(start<n && a[start]==0)   start++;
                    while(end>=0 && a[end]==0)  end--;
                    if(start==n || end==-1) out.println(0);
                    else{
                    int res=0,prev=0;
                    if(start>0) prev=a[start-1];                                         
                    for (int i =start;i<=end; i++) {
                        if(a[i]==0 && prev!=0) res++;
                        prev=a[i];
                    }
                    if(res==0)  out.println(1);
                    else    out.println(2);   
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
