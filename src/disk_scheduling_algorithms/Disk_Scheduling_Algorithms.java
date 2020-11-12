package disk_scheduling_algorithms;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author xBodda
 */
public class Disk_Scheduling_Algorithms 
{
    public static Scheduling Scheduler;
    
    public static void main(String[] args) throws FileNotFoundException 
    {
                FileReader FileReader_Object = new FileReader("numbers.txt");
		BufferedReader BufferReader_Object = new BufferedReader(FileReader_Object);
		Scanner Scanner_Object = new Scanner(FileReader_Object);
		
		int Initial_State = Scanner_Object.nextInt();
		int k = Scanner_Object.nextInt();
		ArrayList<Integer> Request_Queue = new ArrayList<Integer>();
		
		for (int i = 0; i < k; i++) 
                {
			Request_Queue.add(Scanner_Object.nextInt());		
		}
        
                Scheduler = new SCAN(Initial_State, (ArrayList<Integer>) Request_Queue.clone());
		int  Result [] = Scheduler.Schedule();
		System.out.println("SCAN");
                System.out.println("Total Distance = " + Result[0] + " \n\n ");
		for (int i = 1; i <  Result.length; i++) 
                {
			System.out.print( Result [i] + " --> ");
		}
		System.out.println();
    }
}
