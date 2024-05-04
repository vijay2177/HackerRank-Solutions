package learning;

import java.util.Scanner;

public class One {

        public static void main(String[] args)
        {
        int q,a,b,n,series,exp;
        Scanner ip=new Scanner(System.in);
        q=ip.nextInt();
        for (int i=1; i<=q;i++)
            {
                series=0;
                exp=0;
                a=ip.nextInt();
                b=ip.nextInt();
                n=ip.nextInt();
                if(n>=1 && n<=15) {
                    series+=a;
                    for (int j = 0; j < n; j++) {
                        exp = (int) Math.pow(2, j);
                        series += (exp * b);
                        System.out.print(series + " ");
                    }
                }
                System.out.println();
            }
        }
}
