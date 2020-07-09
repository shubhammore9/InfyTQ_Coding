/*A string will be given combination of letters and special characters. You have to return a 
reversed string keeping the special characters at the same place

Example : sd&hg#j

Answer to be returned is : jg&hd#s*/
import java.util.*;
class SpecialRev{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str=s.nextLine();
        char ch[]=str.toCharArray();
        for(char c:ch){
            //System.out.print(c+" ");
        }
        int k=0,len=ch.length;
        for(int i=(len-1);(i>=(len/2) && k<=(len/2));i--)
        {
            if(ch[k]=='#' ||ch[k]=='$' ||ch[k]=='&' ||ch[i]=='#' ||ch[i]=='&' ||ch[i]=='$'){
                
                continue;
            }
            else{
                char temp=ch[i];
                ch[i]=ch[k];
                ch[k]=temp;
                k++;
            }
        }
        for(char c:ch){
            System.out.print(c+" ");
        }
    }
}