//Ques 1: Given a string, find the longest length of a prefix which is also a suffix.
//https://www.geeksforgeeks.org/longest-prefix-also-suffix/

import java.util.*;
public class StrPref{
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            String str = s.nextLine();
            String temp=str;
            int k=0,n= str.length();
            //System.out.println(((n/2)) + str);
            for(int i=(int)Math.ceil((n/2));i<n;i++){
                if(str.charAt(k)==str.charAt(i)){
                    //System.out.println("HERE");
                    k++;
                    
                }
                else{
                    k=0;
                    //System.out.println("Oop");
                }
            }
            System.out.println("Prefix: " +(k));

        } catch (Exception e) {
           System.out.println("EXCEPTION");
        }
    }
}