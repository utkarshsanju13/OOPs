package ExeptionalHandling;

public class TryCatch {

    public static void main(String[] args) {

        int result = case5();
        System.out.println(result);

    }

    public static int case1() {
        try {
            return 1;
        } catch (Exception e) {
            return 2;
        } finally {
            System.out.println("Finally executed");
        }
    }

    public static int case2() {
        try {
            return 1;
        } catch (Exception e) {
            return 2;
        } finally {
            return 3; // overrides
        }
    }

    public static int case3() {
        try {
            int a = 10 / 0; // exception
            return 1;
        } catch (Exception e) {
            return 2;
        } finally {
            System.out.println("Finally executed");
        }
    }

    public static int case4() {
        try {
            int a = 10 / 0; // exception
            return 1;
        } catch (Exception e) {
            return 2;
        } finally {
            return 3; // overrides catch
        }
    }

    public static int case5() {
        int x = 0;
        try {
            return x; // return value is evaluated here
        } catch (Exception e) {
            return 2;
        } finally {
            x = 3; // does not affect already evaluated return
        }
    }

}
