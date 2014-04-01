package runasg1;
import java.io.*;
import java.util.*;

public class MyMinMaxAvg 
    {
        public void minmaxavg() throws IOException
            {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter a series of integers");
                String nums = sc.nextLine();
 
                StringTokenizer st = new StringTokenizer(nums);
                int input;
                int min;
                int max;
                int add = 0;
                float counter = 0f;
                float avg;
                input = Integer.parseInt(st.nextToken());
                min = max = input;
                add = add + input;
                counter++;
                while(st.hasMoreTokens())
                {
                
                do
                    {
                        input = Integer.parseInt(st.nextToken());
                        add = add + input;
                        counter++;
                        
                        if (input <= min)
                            {
                                min = input;
                                 
                            }
                        else if (input >= max)
                            {
                                max = input;
                            }
                    }while(st.hasMoreTokens());
                System.out.println("Minimum:    " + min);
                System.out.println("Maximum:    " + max);
                avg = add/counter;
                System.out.println("Average:    " + avg);
                
                }
    }
}
