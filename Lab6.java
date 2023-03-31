import java.util.*;

import lab2.lab62;
import lab1.lab61;

import java.io.*;

 class inti {
    String song_name;
    String artist;
    int year;
    Scanner sc=new Scanner(System.in);
    public void read()
    {
        System.out.println("\n\nEnter the song name :");
        song_name=sc.next();
        System.out.println("\nEnter the artist name: ");
        artist=sc.next();
        System.out.println("\nEnter the year the song was released :");
        year=sc.nextInt();
    }
    public void display()
    {
        System.out.println("\nSONG :"+song_name);
        System.out.println("ARTIST :"+artist);
        System.out.println("\nYEAR: "+year);
    }
}


class betas extends inti implements lab61,lab62{
    String movies;
    Scanner sc2=new Scanner(System.in);
    @Override
    public void read()
    {
        super.read();
        System.out.println("\n\nEnter the movie the song is from :  ");
        movies=sc.next();
    }
    public void song(String x)
    {
        System.out.println("MOVIE: "+x);
    }


    public void song2(int x)
    {
        System.out.println("\nThis si the second package method!\n");
    }
    }
    
public class Lab6 {
    String song_name;
    String artist;
    int year;

    Lab6(int year,String song_name)
    {
        this.year=year;
        this.song_name=song_name;
    }

    void display()
    {
        System.out.println("\nThis is how the 'THIS' keyword is used");
        System.out.println("\nSONG: "+song_name+"\nYEAR :"+year);
    }
    public static void main(String args[])
    {
        Scanner sc3= new Scanner(System.in);
        betas oo=new betas();
        int c;
        System.out.println("\n\nChoose:\n1.READ\n2.DISPLAY\n3.EXIT\n\n");
        c=sc3.nextInt();
        while(c!=4)
        {
            switch(c)
            {
                case 1:
                oo.read();
                break;

                case 2:
                oo.display();
                break;

                case 3:
                oo.song("blank space");
                oo.song2(7);
                break;
                
            }
        }
    }
}
