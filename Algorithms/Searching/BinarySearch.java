
import java.util.*;

public class BinarySearch {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements : ");
        int x = sc.nextInt();

        Integer arr[] = new Integer[x];

        System.out.println("Enter elements : ");
        for(int i=0; i<x; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter number to find : ");
        int find = sc.nextInt();
        
        Arrays.sort(arr);

        for(int i=0; i<x; i++){
            System.out.print(" " + arr[i]);
        }

        int left = 0, right = arr.length;

        int result = BinarySearchTest(arr, left, right, find);

        if(result == -1){
            System.out.println(find + " Not Found");
        }
        else{
            System.out.println(find + " Found at " + result);
        }

        sc.close();
    }

    public static int BinarySearchTest(Integer[] arr, int left, int right, int find){
        
        while(right >= left){
            int mid = left + (right - left) / 2;

            if(arr[mid].equals(find)){
                return mid;
            }
            else if(arr[mid] > find){
                 left = mid - 1;
            }
            else{
                right = mid + 1;
            }
        }

        return -1;
    }
}
