/**
 * Question: Find a Palindrome of number by adding the revrse of number.
 * SAMPLE TEST CASE 1:
 * Input: 23
 * Output:55 
 * Explanation: 23 --> reverse 32 (Not Same) --> 23+32 -->55 --> reverse 55 (Same) --> Stop
 */
import java.util.*;
class SumRev{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();
        while(true){
            String str= Integer.toString(n);
            StringBuffer temp = new StringBuffer(str);
            StringBuffer sbn = temp.reverse();
            str=new String(sbn);
            int num=Integer.parseInt(str);
            System.out.println(num);
            if(n==num){
                System.out.println("Found.."+num);
                break;
            }else{
                n=n+num;
                System.out.println("Again.."+n);
            }
            
        } 
    }
}