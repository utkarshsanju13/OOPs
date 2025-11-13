package Java17Feature.PaternMatchingPreviewforSwitch;

public class Main {

    public String checkTypeUsingIfElse(Object obj){
        if(obj instanceof Integer){
            Integer i = (Integer) obj; //Manully casting is done in this case
            return "Integer " + i;
        }else if(obj instanceof String){
            String str = (String) obj;
            return "String " + str;
        }

        return "Unknown Type";
    }

    public String checkTypeUsingSwitchCase(Object obj){
//        return switch (obj){
//            case Integer i -> "Integer from switch" + i;
//            case String str -> "String from switch " + str;
//            case Double dou -> "Double from switch " + dou;
//            deafult -> "Unknown type";
//        };

        return null;
    }

    public static void main(String[] args) {

//        try(MemorySegment memorySegment = MemorySegment.allocateNative(4)){
//                MemoryAccess.setInt(memorySegment,0,1234);
//
//        }

    }
}
