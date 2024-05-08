package practice;

import java.util.Scanner;

public class MethodOne {
    public static void main(String[] args) {
        //midOfStr();
        //countOfWords();
        //compoundInterest();
        sumOfInt();
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
        Scanner ip = new Scanner(System.in);
        System.out.print("\n Enter the String : ");
        String userIn = ip.nextLine();
        int count = userIn.split(" ").length;
        System.out.println("No of words = " + count);
        return 0;
        }

    //CompoundInterest for 5 years with 10% CI
    public static float compoundInterest() {
        float investAmt = 1000.0f;
        float interestRate = 10.0f;
        float maturityPeriod = 5.0f;
        float amountAtMaturity;
        amountAtMaturity = (float) (investAmt * (Math.pow((investAmt + (0.1f * investAmt)),maturityPeriod)));
        System.out.println(amountAtMaturity);
        return 0.0f;
    }

    //sumOfInteger

    public static int sumOfInt(){
        Scanner ip = new Scanner(System.in);
        System.out.printf("\n Enter any integer : ");
        int i = ip.nextInt();
        int sum = 0;
        int rem=0;
        while (i > 0)
        {
            rem = i % 10;
            sum +=rem;
            i = i/10;
        }
        System.out.println("Sum of digits : " + sum);
        return 0;
    }
}