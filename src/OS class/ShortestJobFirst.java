import java.util.Arrays;

public class ShortestJobFirst {

    public static void main(String[] args) {
        int[] arrivalTime = {0, 1, 2, 3, 4}; // Arrival times of processes
        int[] executionTime = {4, 3, 1, 6, 2}; // Execution times of processes

        shortestJobFirst(arrivalTime, executionTime);
    }

    public static void shortestJobFirst(int[] arrivalTime, int[] executionTime) {
        int n = arrivalTime.length;
        int[] completionTime = new int[n]; // Array to store completion times
        int[] waitingTime = new int[n]; // Array to store waiting times

        boolean[] visited = new boolean[n]; // Array to track visited processes
        Arrays.fill(visited, false);

        int currentTime = 0; // Current time initialized to 0

        for (int i = 0; i < n; i++) {
            int shortestTime = Integer.MAX_VALUE;
            int shortestIndex = -1;

            for (int j = 0; j < n; j++) {
                if (!visited[j] && arrivalTime[j] <= currentTime && executionTime[j] < shortestTime) {
                    shortestTime = executionTime[j];
                    shortestIndex = j;
                }
            }

            if (shortestIndex == -1) {
                currentTime++;
                i--;
                continue;
            }

            waitingTime[shortestIndex] = currentTime - arrivalTime[shortestIndex];
            completionTime[shortestIndex] = currentTime + executionTime[shortestIndex];
            currentTime += executionTime[shortestIndex];
            visited[shortestIndex] = true;
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
