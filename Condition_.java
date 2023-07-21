package pr1;
import java.util.Scanner;


public class Condition_ 
{
    public static void main(String[]args)
{
    int marks;
    System.out.println("enter marks:");
    Scanner s=new Scanner(System.in);
    marks=s.nextInt();
    if(marks>=60 && marks<=100)
    {
        System.out.println("first division");
    }

    else if(marks>=44 && marks<60)
    {
        System.out.println("second division");
    }

    else if(marks>=33 && marks<44)
    {
        System.out.println("Third division");
    }

    else
    {
        System.out.println("Fail");
    }
}

}
