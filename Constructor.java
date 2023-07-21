package pr1.src;
import javafx.application.Application;

public class Constructor
{
    int a;boolean b;String c;
    A()
    {
        a=1000;b=true;c="himanshu";
    }
    void show()
    {
        System.out.println(a+" "+b" "+c);
    }


}
public class B
{
    Constructor c=new A();
    c.show();
} 