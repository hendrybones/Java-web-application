package com.pluralsight.calcengine;

public class InterRecure {
    public  static int  SuperDigit(String n,int k){
        int sum=0;
        for(int i=0;i<n.length();i++)
        {
            sum=sum+Integer.parseInt(n.charAt(i)+"");
        }
        sum=superSingleDigit(sum*k);
        return sum;
    }
    public static  int superSingleDigit(int n) {
        if (n < 10) {
            return n;
        } else {
            while (n > 0) {
                int num = 0;
                n += n % 10;
                n = n / 10;
                return superSingleDigit(num);
            }
        }return n;

    }
}
