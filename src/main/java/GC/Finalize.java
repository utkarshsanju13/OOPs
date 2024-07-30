package GC;

public class Finalize {

    @Override
    protected void finalize() throws Throwable {
        try{
            System.out.println("inside demo's finalize()");
        }
        catch (Throwable e) {

            throw e;
        }
        finally {
            super.finalize();
        }

    }

    public static void main(String[] args) {

        Finalize f = new Finalize();
        f = null;

        System.gc();




    }
}
