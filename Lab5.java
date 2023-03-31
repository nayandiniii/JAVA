/* 
 * 2247153 JAVA LAB: 5
 */
import java.util.*;
import java.util.Random;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Lab5 {
    String song_name1="";
    String song_name2;
    String song_name3;
    String song_name4;
    String song_name5;
    String song_name6;
    String song_name7;
    String song_name8;
    String song_name9;

  //  char lucky_char;
  Scanner sc= new Scanner(System.in);
    int o1=0;
    int o2=0;
    void string()
    {
        while(o1!=10){
        
        System.out.println("\n\nLET'S PLAY A GAME!!!!\nCHOOSE: \n1.Lucky alphabet\t2.Guess the song\t3.Name it\t4.SHOW\t5.Funny name\n");
        o1=sc.nextInt();
        switch(o1)
        {
            case 1: // finding the charcter that matches the index//
            System.out.println("\nYOUR FAVOURITE SONG\n");
            song_name1=sc.next();
            char lucky_char=song_name1.charAt(2);
            System.out.println("\nTODAY'S LUCKY ALPHABET : \t"+ lucky_char);
            break;

            case 2: //checks if the user input matches with the word//
            
            System.out.println("\nGUESS THE SONG NAME? \n");
            System.out.println("\nA place you are at right now ,is your? ( Song by Khalid) : \t");
            song_name2=sc.next();
            String right_ans="location";
            if(right_ans.compareTo(song_name2)==0)
            {
            System.out.println("\nCORRECT! \n");
            }
            else{
            System.out.println("\nOOPS.. WRONG ANSWER \n");
            }

            break;

            case 3: // checks if the string contains the given string or not//

            System.out.println("\nENTER A SONG NAME THAT HAS GREAT IN IT:  \n");
            song_name3=sc.next();
            sc.nextLine();
            System.out.println(song_name3.contains("great"));
            
            break;

            case 4: // finds the length of the string// 

            System.out.println("\nENTER SONG NAME : \t");
            song_name4=sc.next();
            System.out.println("\nDETAILS : \n");
            System.out.println("NAME: "+song_name4);
            System.out.println("\nLENGTH OF STRING : "+song_name4.length());
            System.out.println("\nENTERED BY THE USER!\n");
            break;

            case 5:  //replaces the alphabets with the giving alphabet//
            song_name5="faceitiouos";
            char vowel;
            char alpha;
            System.out.println("\nMAKE A FUNNY NAME :\n ");
            System.out.println("\nENTER A VOWEL TO REPLACE :\n ");
            vowel=sc.next().charAt(0);
            System.out.println("\nENTER AN ALPHABET TO REPLACE IT WITH (faceitiouos): \n ");
            alpha=sc.next().charAt(0);
            System.out.println("\nFUNNY NAME YOU MADE: \t "+song_name5.replace(vowel,alpha));
            break;
            case 6:
            return;
            case 7:
            o1=10;
            break;

            default: 
            System.out.println("\nINVALID INPUT!!!\n ");


        }
    }

    }

    void buff()
    {
        while(o2!=0)
        {
        System.out.println("\nLET'S PLAY A GAME:\n\n");
        System.out.println("\nCHOOSE :\n1.TWO TOGETHER\t2.CREATE IT\t3.REPLACE\t4.WHAT'S NEW\5.IT'S REVERSE\n\n");
        o2=sc.nextInt();
        switch(o2)
        {
            case 1:
            System.out.println("\nA FUNNY SONG NAME :\t ");
            StringBuffer sb=new StringBuffer("mocking ");  
            sb.append("ozy");
            System.out.println(" "+sb);
            break;

            case 2:
            int n;
            System.out.println("\nENTER A SONG NAME :\t ");
            song_name6=sc.nextLine();
            System.out.println("\nENTER NUMBER UPTO 5:\t ");
            n=sc.nextInt();
            StringBuffer zb=new StringBuffer(song_name6);
            zb.insert(n,"zyoa");
            System.out.println("YOU CREATED :\t"+zb);
            break;

            case 3:
            System.out.println("\nENTER A SONG NAME :\t ");
            song_name7=sc.nextLine();
            StringBuffer ub=new StringBuffer(song_name7);  
           ub.replace(1,3,"haha");  
           System.out.println("NEW NAME: "+ub);
           break;

           case 4:
           System.out.println("\nNAME A SONG :\t");
           song_name8=sc.nextLine();
           StringBuffer ab=new StringBuffer(song_name8);  
           ab.delete(1,3);  
           System.out.println(ab);
           break;

           case 5:
           System.out.println("\nNAME A SONG :\t");
           song_name9=sc.nextLine();
           StringBuffer ib=new StringBuffer(song_name9);  
           ib.reverse();  
           System.out.println("SEREVER: "+ib);
           

        }
        }

    }



    public static void main( String args[])
    {
        Scanner sc= new Scanner(System.in);
        Lab5 obj=new Lab5();
        Lab5 obj2=new Lab5();

        int choice;
        System.out.println("\n\n\t\t LAB:5 \n\nMAIN PROGRAM\n\nCHOOSE : \n\n1.STRING METHOD\t\t2.STRING BUFFER\n\n");
        choice=sc.nextInt();
        switch(choice)
        {
            case 1:
            obj.string();
            break;

            case 2:
            obj2.buff();
            break;

        }
    }
}
