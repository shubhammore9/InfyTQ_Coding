/* Question: Find longest substring of unique characters which is case insensitive

SAMPLE TEST CASE 1:
INPUT : abcabcbb
OUTPUT: SubString: abc Count: 3

SAMPLE TEST CASE 2:
INPUT : bb
OUTPUT: SubString: b Count: 1
SAMPLE TEST CASE 3:
*/

import java.util.*;
class LongUniSubStr{
    static String curStr="";
    static int helper(String str,int i){
        String temp="";
        Set<Character> charset = new HashSet<Character>();
        for(int j=i;j<str.length();j++){
            if (charset.contains(str.charAt(j))){
                if(temp.length()>curStr.length()){
                    curStr=new String(temp);
                }
                //System.out.println("String is:" + temp);
                return (j-i);
            }else{
                temp+=str.charAt(j);
                charset.add(str.charAt(j));
            }
        }
        //System.out.println("String is:" + temp);
        if(temp.length()>curStr.length()){
            curStr=new String(temp);
        }
        return(str.length()-i);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        str=str.toLowerCase();
        int n=str.length();
        int max=0;
        for(int i=0;i<n;i++){
            int val=helper(str,i);
            //System.out.println(val);
            max=Math.max(max,val);
        }
        System.out.println("SubString: "+ curStr + " Count: "+max);
    }
}

/**
PS C:\Users\Lenovo\Desktop\javapract\infytq> java LongSubStr
shubham
SubString: ubhamCount: 5
PS C:\Users\Lenovo\Desktop\javapract\infytq> java LongSubStr
MyNameISShubhamMoreOHK
SubString: ynameisCount: 7
PS C:\Users\Lenovo\Desktop\javapract\infytq> 
 */