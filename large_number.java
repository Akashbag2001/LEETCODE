import java.io.*;
import java.util.*;

public class Solution {
    
    static int getSum(int n){
            int sumOdd = 0;
    int sumEven = 0;
  
    // Converting integer to String
    String num = String.valueOf(n);
  
    // Traversing the String
    for(int i = 0; i < num.length(); i++)
        if (i % 2 == 0)
            sumOdd = sumOdd + (num.charAt(i) - '0');
        else
            sumEven = sumEven + (num.charAt(i) - '0');
            
            int diff = Math.abs(sumOdd-sumEven);
            return diff;
    }

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in); 
       int t = sc.nextInt();
       while(t--!=0){
           int n = sc.nextInt();
           System.out.println(getSum(n));
       } 
    }
}
