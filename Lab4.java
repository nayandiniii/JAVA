/*  
    2 2 4 7 1 5 3

    PROGRAMMING IN JAVA  

     LAB : 4

 */

import java.util.*;
public class Lab4 {
    Scanner sc= new Scanner(System.in);
    String song_name;
    String movie_name;
    String type;
    public static int likes;
    public static String production;
    int year;

    /* static methods can be called without creating an object whereas public
      methods need an object to be called out.*/ 
    static void def()
    {
        System.out.println("\n\nThis is a sample of how details must look!\n");
        System.out.println("NAME : PANTERA\n" );
        System.out.println("MOVIE : WAKANDA FOREVER\n");
        System.out.println("LIKES :"+likes++); /*the value of likes increements as we call static method in the main functino */
        System.out.println("\n");
    }

    static
    {
        likes=300;
        production="Marvel Productions";
    }

    public void read()
    {
        System.out.println("Enter song name :");
        song_name=sc.nextLine();
        System.out.println("\n");
        System.out.println("Enter movie name :");
        movie_name=sc.nextLine();
        System.out.println("\n");
        System.out.println("Enter song type (independent/album) :");
        type=sc.nextLine();
        System.out.println("\n");
        System.out.println("Enter Likes till now :");
        likes=sc.nextInt();
        System.out.println("\n");
        System.out.println("Enter Production :");
        production=sc.nextLine();
        System.out.println("\n");
    }

    public void display()
    {
        System.out.println("You entered : ");
        System.out.println("\n");
        System.out.println("Song :"+song_name);
        System.out.println("\n");
        System.out.println("Movie :"+movie_name);
        System.out.println("\n");
        System.out.println("Type :"+type);
        System.out.println("\n");
        System.out.println("Likes :"+likes);
        System.out.println("\n");
        System.out.println("Production :"+production);
        System.out.println("\n");
    }


    public static void main(String args[])
    {
        Lab4 obj=new Lab4();
        def(); //without using the object calling the static method using static keyword//
        def(); 
        def(); 
        obj.read();
        obj.display();
    }
}
    

