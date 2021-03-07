
import java.util.Scanner;
public class Q3 {
    public static boolean abcd(int arr [], int x){
        int i = 0, r = arr.length - 1; 
        while (i <= r) { 
            int val = i + (r - i) / 2; 
            if (arr[val] == x) 
                return true; 
            if (arr[val] < x) 
                i = val + 1; 
            else
                r = val - 1; 
        }
        return false;

    }
public static void main(String [] args){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int array [] = new int[n];
    for (int i=0; i< array.length;i++){
        array[i]= in.nextInt();
    }
    System.out.println(abcd(array,n));
    
}
}
