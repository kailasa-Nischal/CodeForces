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
                String[] str=new String[2];                
                str=in.nextLine().split(" ");
                int n=Integer.parseInt(str[0]),k=Integer.parseInt(str[1]);                                
                int[] vals=new int[n];   
                int[] time=new int[n];         
                for (int i = 0; i <n; i++) {
                    String[] s=new String[2];                
                    s=in.nextLine().split(" ");
                    vals[i]=Integer.parseInt(s[0]);
                    time[i]=Integer.parseInt(s[1]);
                }                
                
                Pair[] node=new Pair[n];
                for(int i=0;i<n;i++)    node[i]=new Pair(vals[i],time[i]);
                Arrays.sort(node);
                int currval=node[k-1].val,currtime=node[k-1].t,res=0;                
                for(int i = 0; i < node.length; i++) {
                    if(node[i].val<currval || (node[i].val==currval && node[i].t>currtime)) break;
                    else if(node[i].val==currval && node[i].t==currtime)   res++;   
                }
                out.println(res);
            //}
                
                out.close();
            }                                              
         catch (Exception e) {
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
            if(o.val==this.val) return this.t-o.t;
            else    return o.val-this.val;
        }
    }    
    
}