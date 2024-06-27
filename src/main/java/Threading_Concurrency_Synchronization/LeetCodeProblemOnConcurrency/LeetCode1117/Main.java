package Threading_Concurrency_Synchronization.LeetCodeProblemOnConcurrency.LeetCode1117;

public class Main {
    public static void main(String[] args) {
        H2O h2o = new H2O();

        Runnable releaseHydrogen = () -> System.out.print("H");
        Runnable releaseOxygen = () -> System.out.print("O");

        // Number of hydrogen and oxygen atoms to simulate
        int hydrogenAtoms = 6;
        int oxygenAtoms = 3;

        // Creating hydrogen threads
        for (int i = 0; i < hydrogenAtoms; i++) {
            new Thread(() -> {
                try {
                    h2o.hydrogen(releaseHydrogen);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }).start();
        }

        // Creating oxygen threads
        for (int i = 0; i < oxygenAtoms; i++) {
            new Thread(() -> {
                try {
                    h2o.oxygen(releaseOxygen);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }).start();
        }
    }
}

