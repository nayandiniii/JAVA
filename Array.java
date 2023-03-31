


import java.util.*;
class MyArray
{
    int n;
    int[] arr=new int[1000];
    Scanner sc=new Scanner(System.in);
    MyArray(int a)
    {
        n=a;
        for(int i=0;i<n;i++)
        {
            arr[i]=i;
        }
    }
    void readArray()
    {
        System.out.println("Enter the array size: ");
        n=sc.nextInt();
    
        System.out.println("Enter the array elements: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
    }
    void displayArray()
    {
        System.out.println("The array....");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }

    int highestNumber()
    {
        int max=arr[0];
        for(int i=1;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }
    int smallestNumber()
    {
        int min=arr[0];
        for(int i=1;i<n;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        return min;
    }
    int isRepeat(int a,int f)
    {
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(a==arr[i])
            c++;
        }
        if(f==0)
        {
            if(c>1)
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }
        else
        {
            if(c>1)
            {
                return c;
            }
            else
            {
                return 0;
            }
        }
    }
    void showRepeatedNumbers()
    {
        int temp[]=new int[n];
        int l=0;
        System.out.println("Number\tCount");
        for(int i=0;i<n;i++)
        {
            int c=0;
            for(int j=0;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    c++;
                }
            }
            int f=0;
            
            if(c>1)
            {
                //System.out.println("TEMP:"+temp.length);
                if(l==0)
                {
                    temp[l++]=arr[i];
                    System.out.println(arr[i]+"\t"+c);
                }
                else
                {
                    for(int k=0;k<l;k++)
                    {
                        if(temp[k]==arr[i])
                        f=1;
                    }
                    if(f!=1){
                        System.out.println(arr[i]+"\t"+c);
                        temp[l++]=arr[i];
                    }
                
                }
                
                
            }
            
        }
    }
    
}
public class Lab1 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        MyArray obj=new MyArray(5);
        int ch=0;
        while(ch!=8)
        {

        System.out.println("\n\nMAIN PROGRAM\n\n");
        System.out.println("1.Read Array\t2.Display Array");
        System.out.println("3.Highest Number\t4.Smallest Number");
        System.out.println("5.Is the Number Repeated?\t6.Find the number of times the number is repeated");
        System.out.println("7.All repeated numbers with count");
        System.out.println("8.Exit");

        
        System.out.println("Enter your choice");
        ch=sc.nextInt();
        int k=0;
        int z;
        switch(ch)
        {
            case 1:
                obj.readArray();
                break;

            case 2:
                obj.displayArray();
                break;
            
            case 3:
                int x=obj.highestNumber();
                System.out.println("Highest Number="+x);
                break;

            case 4:
                int y=obj.smallestNumber();
                System.out.println("Smallest Number="+y);
                break;

            case 5:
                System.out.println("Enter the number to be checked=");
                z=sc.nextInt();
                
                if(obj.isRepeat(z, 0)==1)
                {
                    System.out.println("Number is repeated");
                }
                else
                {
                    System.out.println("Number is not repeated");
                }
                break;

            case 6:
            
                System.out.println("Enter the number to be checked=");
                z=sc.nextInt();
                System.out.println("Number is repeated "+obj.isRepeat(z, 1)+" times");
                break;

            case 7:
                obj.showRepeatedNumbers();
                break;

            case 8:
                break;
            

        }
    }
    }
    
}
