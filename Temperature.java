/**
 * 12 months 
 * variables = highestvalue, highestmonth, currentmonth
 * temperature array (18.2  22.6  26.4  31.1  36.6  42.2 45.7  44.5  40.2  33.1  24.2  17.6)
 * user input array and move on to next in while loop 
 */

import java.util.Scanner;

 public class Temperature
 {
    public static void main(String[] args)
    {
        System.out.println("Enter temperature: ");
        Scanner in = new Scanner(System.in);

        //Variables 
        double hightestValue = in.nextDouble();
        int highestMonth = 1;
        // int currentMonth = 1;

        //Looping
        for (int currentMonth = 2; currentMonth<=12; currentMonth++)
        {
            double nextValue = in.nextDouble();
            if (nextValue > hightestValue)
            {
                hightestValue = nextValue;
                highestMonth = currentMonth;
            }
        }
        System.out.println("Shih-Hung Yang Lab 6A");
        System.out.printf("Highest Month is %d \n",highestMonth);
    }
 }