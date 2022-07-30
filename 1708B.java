int testCases = in.nextInt();
            while (testCases-- > 0) {                                                            
                String[] str = new String[3];
                str = in.nextLine().split(" ");               
                int n = Integer.parseInt(str[0]), l = Integer.parseInt(str[1]),r=Integer.parseInt(str[2]); 
 
                
                int[] a=new int[n];
                boolean ok=true;
                for (int i = 1; i <= n; i++) {
                    int elem=(((l-1)/i)+1)*i;
                    if(elem>=l && elem<=r)  a[i-1]=elem;
                    else{ok=false;break;}
                }
                if(!ok) out.println("NO");
                else{
                    out.println("YES");
                    for (int i = 0; i < a.length; i++)  out.print(a[i]+" ");
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
