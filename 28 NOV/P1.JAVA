/*import java.util.*;
class sol{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            for(int k=1;k<n+1;k++){
                int count=0;
                String st=Integer.toString(k);
                for(int i=0;i<st.length()-1;i++){
                    for(int j=i+1;j<st.length();j++){
                        if(st.charAt(i)==st.charAt(j)){
                            count++;
                            break;
                        }
                    }
                }
                if (count == 0){
                    System.out.print(k+" ");
                }
                
            }
        }
}
*/
import java.util.*;
class P1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=1 ; i<=n ; i++)
        {
            int num = i;
            boolean visited[] = new boolean[10];
            while (num != 0)
            {
                if (visited[num % 10])
                    break;
      
                visited[num%10] = true;
      
                num = num/10;
            }
      
            if (num == 0)
                System.out.print(i + " ");
    }
}
}