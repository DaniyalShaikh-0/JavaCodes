
import java.util.Scanner;
public class digitroot {
    public static long abcd(long l){
        if (l == 0)
        {
            return 0;
        }
        else
        {
            return (l%10)+abcd(l/10);
        }
    }
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long ans=n;
        while(ans>9)
        {
           ans=abcd(ans);
        }
        System.out.println(ans);
        in.close();
    }
}
