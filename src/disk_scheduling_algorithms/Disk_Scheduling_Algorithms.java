package disk_scheduling_algorithms;

import static disk_scheduling_algorithms.Disk_Scheduling_Algorithms.s;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import static jdk.nashorn.tools.ShellFunctions.input;

/**
 *
 * @author xBodda
 */
public class Disk_Scheduling_Algorithms 
{
    Scanner input=new Scanner(System.in);
    public static ArrayList <Integer> test = new ArrayList();
     public static Scheduling s;
    public static fcfs f;
    public static void main(String[] args) throws FileNotFoundException 
    { 
        Disk_Scheduling_Algorithms d=new Disk_Scheduling_Algorithms();
       // fcfs c = new fcfs(head,test);
        d.fcfs();
        f.Scheduling();
        /*
       int n;
       System.out.println ("enter your request queue please");
       test.add(input.nextLine());
       System.out.println("enter number of heads please");
       n=input.nextInt();
       for (int i = 0; i < 8; i++) {
            test.add(i);
        }*/
    }
    public void choices(){
        
        
    }
                
      public void fcfs(){
          int head;
          System.out.println("enter your requested queue");
           test.add(input.nextInt());
          for (int i = 0; i < 8; i++) {
            test.add(i);
          System.out.println("enter a head number");
          head=input.nextInt();
           fcfs c = new fcfs(head,test);
          c.Schedule(test, head);
          
      }  
  
      }
}
