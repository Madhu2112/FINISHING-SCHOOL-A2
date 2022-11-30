import java.util.*;
public class P3 {
    void   convert(String s,int n)
    {
        HashMap<Integer,String>hm=new HashMap<>(); 
        boolean inc=true;
        int row=1;
        int index=0;
        while(index<s.length())
        {
            String cs=hm.getOrDefault(row,""); 
            hm.put(row,cs+s.charAt(index++)); 
            if(inc)
            {
                row++; 
                if(row==n) 
                  inc=false;
                
            } 
            else if(!inc){ 
                row--;
                if(row==1)
                  inc=true;
            }
        }  
        String ans="";
        for(int r:hm.keySet()){
            ans=ans+hm.get(r);
        } 
        System.out.println(ans);
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	  String s=sc.nextLine();
	  int n=sc.nextInt(); 
	  fsprogram3 m=new fsprogram3();
	  m.convert(s,n);
      sc.close();
	}
}