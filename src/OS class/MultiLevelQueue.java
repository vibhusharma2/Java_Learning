import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class MultiLevelQueue {

    public static void main(String[] args) {
        int[] arrivalTime = {0, 1, 2, 3, 4}; // Arrival times of processes
        int[] executionTime = {4, 3, 1, 6, 2}; // Execution times of processes
        int[] priority = {2, 3, 1, 4, 2}; // Priority of processes

        multiLevelQueue(arrivalTime, executionTime, priority);
    }

    public static void multiLevelQueue(int[] arrivalTime, int[] executionTime, int[] priority) {
        int n = arrivalTime.length;
        int[] completionTime = new int[n]; // Array to store completion times
        int[] waitingTime = new int[n]; // Array to store waiting times

        // Create queues for different priority levels
        Queue<Integer>[] queues = new Queue[10]; // Assuming priority ranges from 0 to 9
        for (int i = 0; i < 10; i++) {
            queues[i] = new LinkedList<>();
        }

        int currentTime = 0; // Current time initialized to 0

        for (int i = 0; i < n; i++) {
            queues[priority[i]].add(i); // Add process to the queue based on its priority
        }

        for (int i = 0; i < 10; i++) {
            while (!queues[i].isEmpty()) {
                int processIndex = queues[i].poll(); // Get the process with the highest priority in the queue
                waitingTime[processIndex] = currentTime - arrivalTime[processIndex];
                completionTime[processIndex] = currentTime + executionTime[processIndex];
                currentTime += executionTime[processIndex];
            }
        }

        // Calculate average waiting time
        double totalWaitingTime = 0;
        for (int i = 0; i < n; i++) {
            totalWaitingTime += waitingTime[i];
        }
        double avgWaitingTime = totalWaitingTime / n;

        // Printing process completion times and waiting times
        System.out.println("Process\tCompletion Time\tWaiting Time");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + "\t\t" + completionTime[i] + "\t\t\t" + waitingTime[i]);
        }
        System.out.println("Average Waiting Time: " + avgWaitingTime);
    }
}
