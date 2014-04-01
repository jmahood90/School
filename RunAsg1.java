package runasg1;
import java.io.*;
import java.util.*;

public class RunAsg1 {
    
    public static void main(String args[]) throws IOException
    {
        System.out.println("[1]: Product");
        System.out.println("[2]: Twelve Count");
        System.out.println("[3]: Min/Max/Average");
        System.out.println("[4]: Grade");
        System.out.println("[5]: Exit");
        System.out.println("Please make a selection [1-4] or [5] to exit:");
        
        Scanner sc = new Scanner(System.in);
        int input;
        input = sc.nextInt();
        
        if (input == 1)
        {
            MyProduct pd = new MyProduct();
            pd.product();
        }
        else if (input == 2)
        {
            MyTwelveCount tc = new MyTwelveCount();
            tc.twelve();
        }
        else if (input == 3)
        {
            MyMinMaxAvg mma = new MyMinMaxAvg();
            mma.minmaxavg();
        }
        else if (input == 4)
        {
            MyGrade gd = new MyGrade();
            gd.grade();
        }
        else if (input == 5)
        {
            System.exit(0);
        }
    }
}
