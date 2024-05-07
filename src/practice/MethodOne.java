package practice;

import java.util.Scanner;

public class MethodOne {
    public static void main(String[] args) {
        midOfStr();
       // countOfWords();
    }

    //MiddleOfString
    public static void midOfStr() {
        Scanner ip = new Scanner(System.in);
        System.out.print("\n Enter the String : ");
        String str = ip.nextLine();
        int len = str.length();
        int mid = len/2;
        System.out.printf("len = %d ; mid = %d \n", len, mid);
        if((len%2)==0)
            System.out.println("Middle of " + str + " is " + str.substring(mid-1,mid+1));
        else
            System.out.println("Middle of " + str + " is " + str.substring(mid,mid+1));
    }

    //CountOfWords
    public static int countOfWords() {
        /*Scanner ip = new Scanner(System.in);
        System.out.print("\n Enter the String : ");
        //String str = ip.nextLine();
        //int len = str.length();
        //int word = 1;
        //String[] letters = new String[len];
        //for (int i=1; i<=len; i++)
        //    letters[i] = ip.next();
        String letters = ip.next();
               int len = letters.length();
        System.out.println(len);
        for (char i : letters ) {
            System.out.println(i);

       // System.out.println(return 0);

         */
        return 0;
        }
}