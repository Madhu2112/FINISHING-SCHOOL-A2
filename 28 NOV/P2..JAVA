import java.util.*;
class sol{
    public static boolean check(char p){
        char[] n={'A','a','E','e','I','i','O','o','U','u'};
        for(int i=0;i<10;i++){
            if(p==n[i]){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++){
            char n=s.charAt(i);
            if(check(n)){
                sb.append(s.charAt(i));
            }
            else if(s.charAt(i)==' '){
                sb.append(' ');
            }
            else{
                sb.append(s.charAt(i));
                sb.append('#');
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb);
    }
}