package day4;

import java.util.Scanner;

public class conditionals
{
    public static void main(String[] args)
    {
        int age=20;
        boolean condition = age<18;
        System.out.println(condition);
        if(condition)
        {
         System.out.println("not eligible");
        }
        else
        {
          System.out.println("eligible");
        }
    }
}
