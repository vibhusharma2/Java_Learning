import java.util.Arrays;

public class PriorityScheduling {

    public static void main(String[] args) {
        int[] arrivalTime = {0, 1, 2, 3, 4}; // Arrival times of processes
        int[] executionTime = {4, 3, 1, 6, 2}; // Execution times of processes
        int[] priority = {2, 3, 1, 4, 2}; // Priority of processes

        priorityScheduling(arrivalTime, executionTime, priority);
    }

    public static void priorityScheduling(int[] arrivalTime, int[] executionTime, int[] priority) {
        int n = arrivalTime.length;
        int[] completionTime = new int[n]; // Array to store completion times
        int[] waitingTime = new int[n]; // Array to store waiting times

        int currentTime = 0; // Current time initialized to 0

        for (int i = 0; i < n; i++) {
            int highestPriority = Integer.MAX_VALUE;
            int highestIndex = -1;

            for (int j = 0; j < n; j++) {
                if (arrivalTime[j] <= currentTime && priority[j] < highestPriority) {
                    highestPriority = priority[j];
                    highestIndex = j;
                }
            }

            waitingTime[highestIndex] = currentTime - arrivalTime[highestIndex];
            completionTime[highestIndex] = currentTime + executionTime[highestIndex];
            currentTime += executionTime[highestIndex];
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
