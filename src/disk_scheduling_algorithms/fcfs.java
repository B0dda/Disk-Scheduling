/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package disk_scheduling_algorithms;

import java.util.ArrayList;

/**
 *
 * @author Celiusty
 */
public class fcfs extends Scheduling{

    public fcfs(int Initial_State, ArrayList<Integer> Request_Queue) {
        super(Initial_State, Request_Queue);
    }

    
    public int [] Schedule(ArrayList <Integer> Requests, int head) {
    int initial=head;//number of heads 2aly habda2 mn 3ando
    int distance;//total distance 2aly 27na 3ayzin natala3o
    int count=0;//2aly ba7sab fy kol rakaman plus 2aly ba3daha 
    int size= Requests.size();//2aly requests numbers
    
    for(int i=0;i<size;i++){
        distance=head-i;
        count+=distance;
        head=count;
        System.out.println("total number of distance ="+ count);   
    }
    
    for(int i=0;i<size;i++){   
        System.out.println("requests sequence is"+Requests.get(i) + " --> ");
    }

    
     
           return null;
    }
    @Override
    public int[] Schedule() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void Scheduling() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    
    
    
}
