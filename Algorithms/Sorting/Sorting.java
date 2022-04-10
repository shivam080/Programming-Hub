
import java.util.*;


 /***
 *Sorting number in ascending order using arrays class
 */
public class Sorting
{
	public static void main(String[] args)

	{

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of element you want to enter :");
     int num = sc.nextInt();
    System.out.println("Enter "+num + " elements :");
     int[] arr = new int[num];
     for(int i=0;i<num;i++)
     {
        arr[i]+=sc.nextInt();
     }

	 Arrays.sort(arr);
     
     System.out.println("Sorted element are below \n");
	 for(int i=0;i<arr.length;i++)
      {
      	System.out.print(arr[i]+ " ");
      }
	}

}