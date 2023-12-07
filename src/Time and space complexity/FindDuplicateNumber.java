// https://docs.google.com/document/d/1uhAM1X_eRR-o6xqLD9Yvs0wgPRSjFn9B1hHdJlJrUTI/edit

/*
Question: Find the Duplicate Number

Given an array nums containing n + 1 integers where each integer is between 1 and n (inclusive), prove that at least one duplicate number must exist. Assume that there is only one duplicate number, find the duplicate one.

Example:

makefile

Input: [1,3,4,2,2]
Output: 2
Solution:

Here's a Java solution using the Floyd's Tortoise and Hare (Cycle Detection) algorithm.

 */
public class FindDuplicateNumber {
    public int findDuplicate(int[] nums) {
        // Use Floyd's Tortoise and Hare algorithm
        int tortoise = nums[0];
        int hare = nums[0];

        // Phase 1: Find the intersection point of the two pointers
        do {
            tortoise = nums[tortoise];
            hare = nums[nums[hare]];
        } while (tortoise != hare);

        // Phase 2: Find the entrance to the cycle
        tortoise = nums[0];
        while (tortoise != hare) {
            tortoise = nums[tortoise];
            hare = nums[hare];
        }

        return hare;
    }

    public static void main(String[] args) {
        FindDuplicateNumber solution = new FindDuplicateNumber();
        int[] nums = {1, 3, 4, 2, 2};
        System.out.println("Duplicate number: " + solution.findDuplicate(nums));
    }
}
