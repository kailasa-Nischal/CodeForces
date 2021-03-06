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
                //int n=in.nextInt();                
                String[] str=new String[2];                
                str=in.nextLine().split(" ");
                int n=Integer.parseInt(str[0]),m=Integer.parseInt(str[1]);   
                // int[] a=new int[n];           
                int maxi=Integer.MIN_VALUE,posr=-1,posc=-1;;                                                                                            
                for (int i = 0; i <n; i++) {                      
                    String[] s=new String[m];                
                    s=in.nextLine().split(" ");    
                    for (int j = 0; j < s.length; j++) {
                        int x=Integer.parseInt(s[j]);
                        if(x>=maxi){maxi=x;posr=i;posc=j;}
                    }                      
                }

            long h=(long)Math.max(posr+1, n-posr);
            long w=(long)Math.max(posc+1,m-posc);
                out.println(h*w);

                
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
