 import java.util.*;
 import java.io.*;
 
 abstract class pp { // abstrcation//
    public abstract void exx();
    String music_name="Bones";
    int year=2022;
    final String genre="Rock";
}
class cc extends pp{ //inheriting properties from the parent class PP//
    Scanner sc= new Scanner(System.in);
    String music_name="Heather";
    String artist;
    String movie;
    public void exx()
    {
        System.out.println("\n\nThis is how the abstract class has been used.\n It must be noted that we can use abstract methods onyl inside the abstract class !\n");
    }

    void read()
    {
        System.out.println("\n\nEnter the music name: ");
        music_name=sc.next();
        System.out.println("\nEnter the artist name :");
        artist=sc.next();
        System.out.println("\nEnter the movie name: ");
        movie=sc.next();
    }
    void print()
    {
        System.out.println("\n\nChild class : "+music_name);
        System.out.println("\nParent class :" +super.music_name); // use of the super keyword//
        System.out.println("\nYOU ENTERED :\n");
        System.out.println("\nMUSIC: "+music_name);
        System.out.println("\nARTIST :"+artist);
        System.out.println("\nMOVIE :"+movie);
        System.out.println("\nFinal : "+genre);
    }
}
class pp2{
    int listeners;
}
class cc2 extends pp2{
    int likes;
    Scanner ss=new Scanner(System.in);
    
    void read2()
    {
        System.out.println("\nThis is the second inherited class !");
        System.out.println("\nEnter the likes for the song : ");
        likes=ss.nextInt();
        System.out.println("\nEnter the listeners for the song : ");
        listeners=ss.nextInt();

    }
    void display2()
    {
        System.out.println("\nLIKES :"+likes);
        System.out.println("\nLISTENERS :"+listeners);

    }
}

public class Lab7{
    public static void main(String args[])
    {
        cc obj=new cc();
        cc2 oo=new cc2();
        obj.exx();
        oo.read2();
        obj.print();
        oo.display2();
    }
}



