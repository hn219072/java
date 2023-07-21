package pr1;
import java.util.Scanner;

public class Ternary
 {
    public static void main(String[]args)
    {
        int a=100,b=20,c=50;
        int r=(a>b)?(a>c?a:c):(b>c?b:c);
        System.out.println(r);
    }
    
}
