package DSARevision25.Combinatorics_Basic;

public class ExcelColumName {

    public static void main(String[] args) {

        int n = 3588;
        System.out.println(findexcelColumnName(n));
    }

    public static String findexcelColumnName(int n){
       StringBuilder res = new StringBuilder();
        while(n > 0){
            int rem = n % 26;

            if(rem == 0){
                res.append('Z');
                n = n /26 - 1;
            }else{
                res.append((char) ((rem - 1) +'A'));
                n = n/26;
            }
        }

        return res.reverse().toString();
    }
}
