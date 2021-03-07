import java.util.Scanner;

public class Q1 {
    public static String abcd(String X){
    int l = X.length();
    int s=0,e=l-1;
    for (int i = 0; i < l; i++) {
        char res= X.charAt(i);
        if (res == ' ') {
            s=i+1;
            break;
        }
    }
    for (int i = l-1; i >= 0; i--) {
        char res= X.charAt(i);
        if (res == ' ') {
            e=i;
            break;
        }
    }
    X=X.substring(s,e);
    return X; }
    public static void main(String [] args ){
        Scanner in = new Scanner(System.in);
        int k = 0;
        String s = in.nextLine();
        System.out.println(abcd(s));
        in.close();

    }
}