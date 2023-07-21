package pr1;
import java.util.Scanner;

public class Condition {
    public static void main(String[]args)
    {
        int pwd;
        System.out.println("enter your password:");
        Scanner s=new Scanner(System.in);
        pwd=s.nextInt();
        if(pwd==1428)
        {
            System.out.println("correct");
        }
        else
        {
            System.out.println("incorrect");
        }
    }
    
}
