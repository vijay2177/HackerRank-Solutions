package learning;

import java.util.Scanner;

public class IntToString {
    public static void main(String[] args) {
        int n,rc=1;
        Scanner ip = new Scanner(System.in);
        n = ip.nextInt();
        if((n>=-100) && (n<=100))
            rc=conv(n);
        if (rc==0)
            System.out.println("Good job");
        else
            System.out.println("Wrong answer");
    }
    public static int conv(int n)
    {
        String s = Integer.toString(n);
        return 0;
    }
}
