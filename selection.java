import java.util.*;
import java.util.Scanner;
public class selection
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=sc.nextInt();
        int[]x=new int[size];
        for(int i=0;i<x.length;i++)
        {
            x[i]=sc.nextInt();
        }
        int sum=0;
        for (int i = 0; i < x.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < x.length; j++) {
                if (i != j && x[i] == x[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                sum += x[i];
            }
        }
      System.out.println(sum);
    }
}