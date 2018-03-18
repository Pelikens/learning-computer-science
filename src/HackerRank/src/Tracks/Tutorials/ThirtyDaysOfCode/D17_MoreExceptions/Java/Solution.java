package HackerRank.src.Tracks.Tutorials.ThirtyDaysOfCode.D17_MoreExceptions.Java;

import java.util.*;


public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T=in.nextInt();
        while(T-->0)
        {
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try
            {
                int ans=myCalculator.power(n,p);
                System.out.println(ans);

            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}

class Calculator {
    public int power(int n, int p) throws Exception {
        if (n<0 || p<0) {
            throw new Exception("n and p should be non-negative");
        }

        int i=0;
        int res = 1;
        while(i<p){
            res = res * n;
            i++;
        }
        return res;
    }
}
