import java.io.*;
import java.util.*;
class Rec
{
    public static void main(String c[])
    {int n;
     Scanner o=new Scanner(System.in);   
          n=o.nextInt();
        int re=0;
        while(n>0)
        {
            int l=n%10;
            re=(re*10)+l;
        }
        System.out.println(re);
    }
}
