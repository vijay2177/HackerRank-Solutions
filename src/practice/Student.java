package practice;

import javax.naming.Name;
import java.util.Scanner;

public class Student {
    static String stuName;
    public Student(String passedName)
    {
        stuName = passedName;
    }
    public static void student(String stuName)
    {
        if(stuName.contentEquals(""))
            System.out.println("Unknown");
        else
            System.out.println(stuName);
    }
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String name = ip.nextLine();
        Student.student(name);
    }
}