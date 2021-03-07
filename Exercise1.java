import java.util.Scanner;

public class Exercise1 {
    public static boolean abcd(String X){
        X=X.toLowerCase();
        System.out.println(X);
        String s = "";
        for (int i = 0; i < X.length(); i++) {
            if (X.charAt(i)>='a' && X.charAt(i)<='z') {
                s=s+X.charAt(i);
            }
        }
        for (int i = 0,j=s.length()-1; i!=j;i++,j--) {
            if (s.charAt(i)!=s.charAt(j))
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String [] args ){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(abcd(s));
        in.close();
    }
}