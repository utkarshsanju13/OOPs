package org.example;

public class convert {
    public static void main(String[] args) {
        String str = "PAYPALISHIRING";
//        convert(str,4);
        System.out.println(convert(str,4));
    }

    public static  String convert(String s, int numRows) {

        int n = s.length();
        int r = n / (numRows-1) + 1;
        int c = numRows;
        System.out.println(n+ " "+ r+ " "+ c+ " ");

        Character [][] arr = new Character[r][c];
        int idx = 0;

        for(int j = 0; j < c; j++){
            arr[0][j] = s.charAt(idx++);
        }
//        print(arr);

        boolean isReverse = true;
        int end = c-2;
        int start = 1;

        for(int i = 1; i < r; i++){

            if(isReverse){
                for(int j = end; j >=0; j--){
                    if(idx < n)
                        arr[i][j] = s.charAt(idx++);
                }
                isReverse = false;
            }else{
                for(int j = start; j < c; j++){
                    if(idx < n)
                        arr[i][j] = s.charAt(idx++);
                }
                isReverse = true;
            }
        }

        print(arr);

        StringBuilder ans = new StringBuilder();
//
        for(int j = 0; j < c; j++){
            for(int i = 0; i < r; i++){
                if(arr[i][j] !=null){
                    ans.append(arr[i][j]);
//                    System.out.print(arr[i]);
                }
            }
        }

        return ans.toString();
    }

    public static void print(Character[][] arr){
        for(int i = 0 ; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
            }
    }
}
