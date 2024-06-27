package org.example;

public class GasStation {

    public static void main(String[] args) {
        int []gas = {1,2,3,4,5}, cost = {3,4,5,1,2};
//        int []gas = {11,4,7,1,0}, cost = {2,5,5,9,1};
        System.out.println(canCompleteCircuit(gas,cost));
    }

    public static int canCompleteCircuit(int[] gas, int[] cost) {

        int start = 0;
        int current = 0;
        int totalCost = 0;
        int totalGas = 0;
        int n = gas.length;
        int min = Integer.MAX_VALUE;
        int minIdx = -1;

        for (int i = 0; i < n; i++) {

            totalCost += cost[i];
            totalGas += gas[i];
            if(cost[i] < min){
                min = cost[i];
                minIdx = i;
            }
        }
        start = minIdx;

        if (totalGas < totalCost) {
            return -1;
        }

        for (int i = minIdx; i < n; i++) {

            current += (gas[i] - cost[i]);
            if (current < 0) {
                start = i + 1;
                current = 0;
            }
        }

        return start;
    }
}
