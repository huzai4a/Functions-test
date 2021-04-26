/******************************************************************************

Write a program that gets 3 numbers
Print the max and min using the functions below:
Make a findMax function
This method receives the 3 numbers as parameters
Returns the largest number
Make a findMin function
This method receives the 3 numbers as parameters
Returns the smallest number

*******************************************************************************/
import java.util.Scanner;
public class Main
{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        double [] nums = new double [3];

        for(int i = 0; i < 3; i++) {
            say ("Enter a number");
            nums [i] = sc.nextDouble();
        }
        //findmax (nums);
        //findmin (nums);

        say ("The max number is " + findmax (nums) + " and the minimum number is " + findmin (nums));

    }

    public static void say (String x) {
        System.out.println(x);
    }

    public static double findmax(double [] tempay1){
        double maxnum = 0;
        if (tempay1 [0] > tempay1 [1] && tempay1 [0] > tempay1 [2]) {
            maxnum = tempay1 [0];
        }
        else if (tempay1 [1] > tempay1 [0] && tempay1 [1] > tempay1 [2]) {
            maxnum = tempay1 [1];
        }
        else if (tempay1 [2] > tempay1 [0] && tempay1 [2] > tempay1 [1]) {
            maxnum = tempay1 [2];
        }
        return maxnum;
    }

    public static double findmin(double [] tempay2){
        double minnum = 0;
        if (tempay2 [0] < tempay2 [1] && tempay2 [0] < tempay2 [2]) {
            minnum = tempay2 [0];
        }
        else if (tempay2 [1] < tempay2 [0] && tempay2 [1] < tempay2 [2]) {
            minnum = tempay2 [1];
        }
        else if (tempay2 [2] < tempay2 [0] && tempay2 [2] < tempay2 [1]) {
            minnum = tempay2 [2];
        }
        return minnum;
    }

}


