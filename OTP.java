/**
 * QUESTION: Generate an Four digit OTP using given array. Use Odd places of array and multiply.
 * Input : N (Size of Array) N Elements (Array Elements)
 * Output: 4 digit OTP
 */

import java.util.*;
class OTP{
    public static void main(String[] args) {
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int temp,arr[]=new int[n];
        String str="";
        if(n>=8){
            for(int i=0;i<8;i++)
            {   
                if(i%2==1){
                    arr[i]=s.nextInt();
                    str+=Integer.toString(arr[i]*arr[i]);
                }else{temp=s.nextInt();}
            }
            System.out.println("OTP is:"+str.substring(0,4));

        }
        else{
            for(int i=0;i<n;i++)
            {
            arr[i]=s.nextInt();
            }
            for(int j=1;j<n;j+=2){
                str+=Integer.toString(arr[j]*arr[j]);
            }
            System.out.println("OTP is:"+str.substring(0,4));
        }        

    }
}