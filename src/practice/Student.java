package practice;

import javax.naming.Name;
import java.util.Scanner;

public class Student {
    public Student(String passedName)
    {
            System.out.println(passedName);
    }
    public Student() {
        System.out.println("Unknown");
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter Student Name : ");
        String name = ip.nextLine();
        Student std;
        if(name.isEmpty())
            std = new Student();
        else
            std = new Student(name);
    }
}