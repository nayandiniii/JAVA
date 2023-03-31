import java.util.*;

class musiclib
{
    Scanner sc=new Scanner(System.in);
    String name;
    int year;
    boolean multilistener;
    String platform;
    public musiclib()
    {
        name="";
        year=2000;
        multilistener=false;
        platform="";
    }
   musiclib(String x,int p,boolean m,String g)
    {
        name=x;
        year=p;
        multilistener=m;
        platform=g;
    }
    public void read()
    {
        
        System.out.println("Enter the song name:");
        name=sc.nextLine();
        System.out.println("Enter the song's platform:");
        platform=sc.nextLine();
        System.out.println("Enter the year of release:");
        year=sc.nextInt();
        System.out.println("Is the platform multilistener?(true/false):");
        multilistener=sc.nextBoolean();
    }
    public void catchphrase()
    {
        if(platform.equalsIgnoreCase("pantera"))
        {
            System.out.println("GREATNESS AWAITS!");
        }
        else if(platform.equalsIgnoreCase("opps"))
        {
            System.out.println("POWER YOUR DREAMS!");
        }
        else
        {
            System.out.println("HAPPY STREAMING!");
        }
    }
    public int catchphrase(int x)
    {
        if(platform.equalsIgnoreCase("pantera"))
        {
            return 1;
        }
        else if(platform.equalsIgnoreCase("opps"))
        {
            return 2;
        }
        else
        {
            return 3;
        }
    }
    public void display()
    {
        System.out.println("NAME:"+name);
        System.out.println("PLATFORM:"+platform);
        System.out.println("YEAR:"+year);
    }
}
class greatest extends musiclib
{
    
    boolean performance_mode;
    int listener_base;
    public greatest()
    {
        super();
        performance_mode=false;
        listener_base=0;
    }
    public greatest(String x,int p,boolean m,String g,boolean per,int plb)
    {
        super(x, p, m, g);
        per=true;
        plb=100000;
    }
    public void read()
    {
       // Scanner x=new Scanner(System.in);
        super.read();
        System.out.println("Does the song support 8D audio?(true/false):");
        performance_mode=sc.nextBoolean();
        System.out.println("How many listeners can stream at one time over a room?");
        listener_base=sc.nextInt();
    }

    public void display()
    {
        super.display();
        System.out.println("Performance Mode: "+performance_mode);
        System.out.println("Listener Base: "+listener_base);
    }
}
public class Lab3 {
    public static void main(String[] args)
    {
        greatest obj=new greatest("The Greatest",2017,false,"POP",true,500);
        obj.read();
        obj.display();
    }
}
