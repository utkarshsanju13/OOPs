package Cvent;

import java.util.*;

public class Solution {

    public static List<int[]> getFreeTimes(int start, int end, int[][] busy) {
        List<int[]> freeSlots = new ArrayList<>();

        int current = start;

        for (int[] interval : busy) {
            int busyStart = interval[0];
            int busyEnd = interval[1];

            if (current < busyStart) {
                freeSlots.add(new int[]{current, busyStart});
            }
            current = Math.max(current, busyEnd);
        }

        // After last busy slot, check until end
        if (current < end) {
            freeSlots.add(new int[]{current, end});
        }

        return freeSlots;
    }

    public static void main(String[] args) {
        int start = 9, end = 17;
        int[][] busy = {
                {10, 12},
                {14, 15},
                {15,17}
        };

        List<int[]> freeTimes = getFreeTimes(start, end, busy);

        for (int[] slot : freeTimes) {
            System.out.println(slot[0] + " -> " + slot[1]);
        }
    }
}

