//KING NUMBER
import java.util.*;
public class KingNumber{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int arr[]={2,6,9,14,20,10,30,40};
        int max=0;
        int value=0;
        for(int i=0;i<arr.length;i++)
        {
            int x=arr[i];
            int chk=checkprime(x);
            if(chk==1)
            {
                int count=0;
                for(int j=0;j<arr.length;j++)
                {
                if(arr[j]%x==0)
                    count++;
                }
                if(count>max)
                {
                max=count;
                value=x;
                // System.out.println(value);
                }
            }
            
        }
        if(value==0)
            System.out.println("No King Number");
        else
            System.out.println("King Nunber is "+value);
     }
     static int checkprime(int n)
     {
         int temp=n;
         int flag=1;
         if(n==0|| n==1)
            return 0;
         else if(n==2)
            return 1;
         for(int i=2;i<n/2;i++)
         {
             if(temp%i==0)
             {
                 flag=0;
                 break;
             }
         }
         return flag;
     }
}
