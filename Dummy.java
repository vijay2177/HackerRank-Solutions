package learning;

import java.util.Scanner;

public class Dummy {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int b, h;
        Scanner ip = new Scanner(System.in);
        b = ip.nextInt();
        h = ip.nextInt();
        area(b,h);
    }

    public static void area(int b, int h)
    {
        int area;
        if(((b>=-100)&&(b<=100)) && ((h>=-100)&&(h<=100)))
        {
            if ((b>0)&&(h>0))
            {
                System.out.println(b*h);
            }
            else
                System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
}
