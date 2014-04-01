package runasg1;
import java.io.*;
import java.util.*;

public class MyTwelveCount
    {
        public void twelve() throws IOException        
            {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter a series of integers");
                String nums = sc.nextLine();
                StringTokenizer st = new StringTokenizer(nums);
                
                int input;
                int twelve = 0;
                int firstTwelve = 0;
                int lastTwelve = 0;
                boolean foundTwelve = false;
                int counter = 0;

                do
                    {
                        input = Integer.parseInt(st.nextToken());

                        if (input == 12 && foundTwelve == false)
                            {
                                counter++;
                                firstTwelve = counter;
                                foundTwelve = true;
                                lastTwelve++;
                                twelve++;
                            }
                        else if (input != 12 && foundTwelve == true)
                            {
                                counter++;
                            }
                        else if (input == 12 && foundTwelve == true)
                            {
                                counter++;
                                lastTwelve = counter;
                                twelve++;
                            }
                        else if (input != 12)
                            {
                                counter++;
                            }
                        else if (input == 12)
                            {
                                counter++;
                                lastTwelve = counter;
                                twelve++;
                            }

                    }   while(st.hasMoreTokens());

                    System.out.println("First Twelve:   " + firstTwelve);
                    System.out.println("Last Twelve:    " + lastTwelve);
                    System.out.println("Total:          " + twelve);
            }
    }
