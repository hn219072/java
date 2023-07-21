package pr1;

import java.util.Scanner;

public class Forloop {

    public static void main(String[]args)
    {
        int num,i;
        System.out.println("enter a number:");
        Scanner s=new Scanner(System.in);
        num=s.nextInt();
        for(i=1;i<=10;i++)
        {
            System.out.println(num*i);
        }


        System.out.println("For loop ended..");
    }
    
}
