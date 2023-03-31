import java.io.*;
import java.util.*;
import pack3.artist;
import pack3.music;

class Input
{

    //defining all the necessary data members//
    String username;
    int age;
    int id;
    String emailid;

    public void welcome()
    {
        System.out.println("\nWELCOME TO THE LAB - 8 PROGRAM !\n");
    }
    
}

class Program extends Input implements artist,music{
    Scanner sc2=new Scanner(System.in);
    String name;
    String song_name;
    int song_release;
    String artist_name;
    String origin;
    int artist_age;
    int total_albums;
// user details //
    public void read()
    {
        System.out.println("\n\nEnter your UserName :");
        username=sc2.next();
        System.out.println("\n\nWhat is your age :");
        age=sc2.nextInt();
        System.out.println("\n\nEnter the unique ID provided to you :");
        id=sc2.nextInt();
        System.out.println("\n\nE-Mail Id :");
        emailid=sc2.next();
        System.out.println("\nEnter your full name:");
        name=sc2.next();
    }
// details of the song// 
    public void song()
    {
        System.out.println("\nSong you listen to the most :");
        song_name=sc2.next();
        sc2.nextLine();
        System.out.println("\nYear the song was released: ");
        song_release=sc2.nextInt();
        sc2.nextLine();

    }
// details of the artist //
    public void details()
    {
        System.out.println("\nEnter the name of the artist you like the most :");
        artist_name=sc2.next();
        sc2.nextLine();

        System.out.println("\nWhich place does this artist belong to ? ");
        origin=sc2.next();
        System.out.println("\nEnter the age of artist :");
        artist_age=sc2.nextInt();
        System.out.println("\nTotal albums released : " );
        total_albums=sc2.nextInt();
    }
// method to display the details entered so far//
    public void display()
    {
        System.out.println("\nUserName:"+username);
        System.out.println("\nAge: "+age);
        System.out.println("\nID:"+id);
        System.out.println("\n E-Mail: "+emailid);
        System.out.println("\nMost liked song: "+song_name);
        System.out.println("\nYear of release: "+song_release);
        System.out.println("\nMost liked artist: "+artist_name);
        System.out.println("\nOrigin: "+origin);
        System.out.println("\nAge: "+age);
        System.out.println("\nTotal Albums: "+total_albums);




    }
}

public class Lab8
{
    public static void main(String args[]) //main class//
    {
        Input o=new Input();
        o.welcome();
        Program obj=new Program(); //creating an object for the extnded class which is implementing interface//
        obj.read();
        obj.song();
        obj.details();
        System.out.println("\n\n------ LET'S SEE WHAT YOU LIKE -----\n");
        obj.display();
    }
}
