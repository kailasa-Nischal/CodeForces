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
                // int n=Integer.parseInt(str[0]),m=Integer.parseInt(str[1]);                                
                int[] a=new int[n];   
                String[] s=new String[n];                
                s=in.nextLine().split(" ");   
                int[] diff=new int[n-1];                                    
                for (int i = 0; i <(n); i++) {
                    a[i]=Integer.parseInt(s[i]);   
                    if(i>=1)    diff[i-1]=a[i]-a[i-1];                              
                }
                long ans=0,x=a[0];
                for (int i = 0; i < diff.length; i++) {
                    if(diff[i]>0){ans+=diff[i];}
                    else if(diff[i]<0){ans+=(int)Math.abs(diff[i]);x+=diff[i];}
                }
                ans+=(long)Math.abs(x);
                out.println(ans); 
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