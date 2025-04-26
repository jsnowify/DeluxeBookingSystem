/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author joshu
 */
import java.util.LinkedList;
import java.util.Queue;

public class WaitingList {
    private Queue<String> waitingQueue;

    public WaitingList() {
        waitingQueue = new LinkedList<>();
    }

    public void addToWaitingList(String passengerName) {
        waitingQueue.add(passengerName);
    }

    public String processNextPassenger() {
        return waitingQueue.poll(); // Removes and returns next in queue
    }
}
