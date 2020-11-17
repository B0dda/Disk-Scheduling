package disk_scheduling_algorithms;

import java.util.ArrayList;

/**
 *
 * @author xBodda
 */
public abstract class Scheduling 
{
    public int Initial_State;
    public ArrayList<Integer>Request_Queue;
    
    public abstract int[] Schedule();

    public Scheduling(int Initial_State, ArrayList<Integer> Request_Queue) 
    {
        this.Initial_State = Initial_State;
        this.Request_Queue = Request_Queue;
    }

    public int getInitial_State() 
    {
        return Initial_State;
    }

    public void setInitial_State(int Initial_State) 
    {
        this.Initial_State = Initial_State;
    }

    public ArrayList<Integer> getRequest_Queue() 
    {
        return Request_Queue;
    }

    public void setRequest_Queue(ArrayList<Integer> Request_Queue) 
    {
        this.Request_Queue = Request_Queue;
    }
}