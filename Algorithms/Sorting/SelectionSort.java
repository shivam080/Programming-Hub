package Programming_Hub.Algorithms.Sorting;
import java.util.*;

/***
 * Selection sorting using iterative method
 * */

public class SelectionSort {
    public static void main(String[] args){

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the array size :");
        int size = sc.nextInt();
        System.out.println("Enter the "+ size +" array element :");
        int[] arr = new int[size];
        
        for(int i=0;i<size;i++)
            arr[i] = sc.nextInt();

        //Displying array entered...
        System.out.println("Enter array element are :");
        for(int i=0;i<size;i++)
            System.out.println(arr[i]);

        selectSort(arr);
        
    }


/***
 * 1. Read the array upto n-1
 * 2. Take ith index as minInd each time
 * 3. Check for minVal from i to n.If minVal found then store jth index to var minInd.
 * 4. At the end of each ith iteration swap minval to minInd position.
 * */
 
    public static void selectSort(int[] arr)
    {
        int temp=0;

        for(int i=0;i<arr.length-1;i++)
        {
             int minInd = i;
             int j = i+1;
            while(j<arr.length)
            {
                if(arr[minInd]>arr[j])
                {
                    minInd = j;
                }
                j++;
            }
            temp   = arr[i];
            arr[i] = arr[minInd];
            arr[minInd] = temp;

        }
        System.out.println("Sorted Element are ");
        for(int x1 : arr)
        {
            System.out.println(x1);
        }
    }

}
