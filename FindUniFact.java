/*Question: For a given list of numbers, find its factors and add the factors. Then if the sum of factors 
is present in the original list, sort it and print it.
If the sum numbers are not present in original list, then return -1.

SAMPLE TEST CASE 1:
Input: 0,1,6
Factors of 0 = 0. Thus sum = 0
Factors of 1 = 1. Thus sum = 1
Factors of 6 = 1,2,3. Thus sum = 6
Output = 1,6

SAMPLE TEST CASE 2:
Input : 2,5
Output: -1
*/

import java.util.*;
class FindUniFact{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Set<Integer> set= new HashSet<Integer>();
        String temp =s.nextLine();
        String str[]=temp.split(",");
        int i=0,arr[]=new int[str.length];
        for(String c:str){
            arr[i]=Integer.parseInt(c);
            i++;
        }
        int sum,num;
        for(int j=0;j<arr.length;j++){
            sum=0;
            num=arr[j];
            if(num==0){
                continue;
            }
            if(num==1){
                //System.out.print(" "+1);
                set.add(1);
                continue;
            }
            for(int k=1;k<=(int)Math.ceil((num/2));k++){
                if(num%k==0){
                    sum+=k;
                }
            }
            for(int z=0;z<arr.length;z++){
                if(arr[z]==sum)
                {
                    set.add(sum);
                    //System.out.print(" "+sum);
                    break;
                }
            }
        }
        if(set.size()==0)
        System.out.print(-1);
        else
        for(int p:set)
        System.out.print(p+" ");
    }
}