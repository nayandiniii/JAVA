import java.util.*;
class Music
{
    Scanner sc=new Scanner(System.in);
    int size;
    public String name[]=new String[1000];
    public int year_of_release[]=new int[1000];
    public Music()
    {
        size=0;
    }
    public Music(int x)
    {
        size=x;
    }
    public void read()
    {
        try
        {
            System.out.println("Enter the number of songs you want to listen to today: ");
            size=sc.nextInt();
        }
        catch(Exception e)
        {
            System.out.println("Exception Caught is "+e);
        }
        
        for(int i=0;i<size;i++)
        {
            try
            {
                System.out.println("Enter the song name:");
                sc.nextLine();
                name[i]=sc.nextLine();
            }
            catch(Exception e)
            {
                System.out.println("Exception Caught is "+e);
            }
            try
            {
                System.out.println("Enter the year it was released in:");
                year_of_release[i]=sc.nextInt();
            }
            catch(Exception e)
            {
                System.out.println("Exception Caught is "+e);
            }
        }
    }
    void buy(int x)
    {
        try
        {
            System.out.println("Song you like:"+ name[x]);
            System.out.println("Thank YOU for listening!!");

        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Wrong song Entered!!!");
        }

    }
    void display()
    {
        for(int i=0;i<size;i++)
        {
            System.out.print(i+1+". ");
            System.out.println("Song: "+name[i]);
            System.out.println("Year of Release: "+year_of_release[i]);
        }
    }
    
}
public class Lab9exp {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Music g=new Music();
        int x=0;
        g.read();
        int ch=0;
        while(ch!=10)
        {
            System.out.println("1.Show the songs");
            System.out.println("2.Listen");
            System.out.println("3.Exit");
            System.out.println("Enter your choice");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("---------------SONGS AVAILABLE---------------");
                    g.display();
                    System.out.println("---------------------------------------------");
                    break;
                
                case 2:
                    System.out.println("---------------SONGS AVAILABLE---------------");
                    g.read();
                    System.out.println("Enter the which one you want:");
                    x=sc.nextInt();
                    g.buy(x+1);
                    System.out.println("---------------------------------------------");
                    break;
                
                case 3:
                    ch=10;
                    break;
            }
        }
    }
}
