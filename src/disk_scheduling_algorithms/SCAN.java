package disk_scheduling_algorithms;
import java.util.ArrayList;
/**
 *
 * @author xBodda
 */
public class SCAN extends Scheduling
{

    public SCAN(int Initial_State, ArrayList<Integer> Request_Queue) 
    {
        super(Initial_State, Request_Queue);
    }

    @Override
    public int[] Schedule() 
    {
        int Total_Distance = 0;
        int Counter = 0;
        Request_Queue.add(199);
        
        int Track [] = new int [Request_Queue.size()];
        java.util.Collections.sort(Request_Queue);
        
        int Node = 0;
        
        for (int i = 0; i < Request_Queue.size(); i++) 
        {
            if(Request_Queue.get(i) >= Initial_State)
            {
                    Node = i;
                    break;
            }
        }
        
        Total_Distance += Math.abs(Initial_State - Request_Queue.get(Node));
        
        for (int i = Node; i < Request_Queue.size()-1; i++, Counter++) 
        {
            Total_Distance+= Math.abs(Request_Queue.get(i+1) - Request_Queue.get(i));
            Track[Counter] = Request_Queue.get(i);
        }
        
        Track[Counter] = Request_Queue.get(Request_Queue.size()-1);
        Counter++;


        Total_Distance+= Math.abs(Request_Queue.get(Request_Queue.size()-1) - Request_Queue.get(Node -1));
        
        for (int i = Node-1; i > 0; i--, Counter++) 
        {
                Total_Distance += Math.abs(Request_Queue.get(i-1) - Request_Queue.get(i));
                Track[Counter] = Request_Queue.get(i);
        }
        
        Track[Counter] = Request_Queue.get(0);


        Track[0] = Total_Distance;
        
        
        return Track;
    }
}
