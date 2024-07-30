package ExeptionalHandling;

public class Main2 {

    public static void main(String[] args) throws CatchException, TryException, FInallyException {

        try{
            throw  new TryException();
        }catch(Exception e){
            throw new CatchException();
        }finally{
            throw new FInallyException();
        }
    }
}
