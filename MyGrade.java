package runasg1;
import java.util.*;
import java.io.*;

public class MyGrade 
    {
        public void grade() throws IOException
            {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter a string of exam scores [Integers]:");
                String nums = sc.nextLine();
 
                StringTokenizer st = new StringTokenizer(nums);
                int input;
                int sumA;
                int sumB;
                int sumC;
                int sumD;
                int sumF;
                sumA=sumB=sumC=sumD=sumF=0;
                
                do
                    {
                        input = Integer.parseInt(st.nextToken());
                        if(input>=90)
                            {
                                sumA = sumA + 1;
                                System.out.println(new Integer(input) + ":    A");
                            }
                        else if(input >= 70)
                            {
                                sumB++;
                                System.out.println(new Integer(input) + ":    B");
                            }
                        else if(input >= 50)
                            {
                                sumC++;
                                System.out.println(new Integer(input) + ":    C");
                            }
                        else if(input >= 35)
                            {
                                sumD++;
                                System.out.println(new Integer(input) + ":    D");
                            }
                        else
                            {
                                sumF++;
                                System.out.println(new Integer(input) + ":    F");
                            }
                    }   while(st.hasMoreTokens());
                System.out.println("The total number of A's is " + sumA);
                System.out.println("The total number of B's is " + sumB);
                System.out.println("The total number of C's is " + sumC);
                System.out.println("The total number of D's is " + sumD);
                System.out.println("The total number of F's is " + sumF);
            }
    }
