import java.util.Scanner;
public class Q2 {
    public static void abcd(int k) {
        int f=0,s=1,x;  //first,second
        System.out.print(f + " " + s);
        for (int i = 2;; i++) {
            x=f+s;
            System.out.print("  " + x);
            f=s;
            s=x;
            if (x>k)
            {
                break;
            }
        }
        return;
    }
public static void main(String [] args){
Scanner in = new Scanner(System.in);
int n = in.nextInt();
    abcd(n);
    in.close();
}
}
