package runasg1;
import java.util.*;
import java.io.*;

public class MyProduct
    {
        public void product() throws IOException

            {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter a series of positive integers");
                System.out.println("Entering [0] will terminate the calculation:");
                String nums = sc.nextLine();
 
                StringTokenizer st = new StringTokenizer(nums);
                int input;
                int product = 1;
                input = Integer.parseInt(st.nextToken());
                
                while (st.hasMoreTokens())
                    {
                           if (input < 0)
                               {
                                   input = Integer.parseInt(st.nextToken());
                               }
                           else if (input > 0) 
                               {
                                   product = product * input;
                                   input = Integer.parseInt(st.nextToken());
                               } 
                            else
                               {
                              System.exit(0);
                               }
                     }
                if (input !=0)
                     {
                            product = product * input;
                            System.out.println("Product = " + product);    
                     }
                   
            }
}
