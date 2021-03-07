import java.util.Scanner;
public class Ex2 {
    public static String abcd(String k,int n){
        String s="";
        s=s+k.charAt(k.length()-2);
        s=s+k.charAt(k.length()-1);
        int i=Integer.parseInt(s);
        int secs =i+n;
        int flg=0;
        int fg=0;
        int mins=0;
        String sec=String.valueOf(secs);
        if (secs>=60)
        {
            fg=1;
            secs=secs%60;
            sec ="0" + String.valueOf(secs);
            String s2=k.charAt(4) + "";
            mins=Integer.parseInt(s2);
            if (mins==9)
            {   
                flg=1;
                s2=k.charAt(3) + k.charAt(4) + "";
                mins=Integer.parseInt(s2);
            }
            mins+=1;
            System.out.println(secs);
            System.out.println(mins);
        }
        else
        {
            fg=0;
            return (k.substring(0,4)+String.valueOf(mins)+':'+sec);
        }
        String s2 = "";
        if (flg==0)
        {
            s2+=k.substring(0,4);
            s2=s2+String.valueOf(mins)+':'+ sec ;
        }
        else
        {
            s2+=k.substring(0,3);
            s2=s2+String.valueOf(mins)+':'+sec;
        }
        return s2;}
        public static void main(String [] args){
            Scanner in = new Scanner(System.in);
            String s = in.nextLine();
            int n = in.nextInt();
            System.out.println(abcd(s,n));
            in.close();
        }
}
