import java.util.Scanner;
public class to8 {
    public static void main(String[] args){ 
int sum=0,sum1=0,n,n1,avg,avg1;
int b,count=0,count1=0;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int[] a=new int[100];
for(int i=0;i<n;i++)
a[i]=sc.nextInt();
b=n;
for(int j=0;j<n/2;j++)
{
sum=sum+a[j];
count++;
}
for(int i=b/2;i<b;i++)
{
sum1=sum1+a[i];
count1++;
}
avg=sum/count;
avg1=sum1/count1;
if(avg==avg1)
System.out.println("Avg are same");
else
System.out.println("Avg are not same");
}
}
