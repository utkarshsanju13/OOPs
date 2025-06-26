package DSARevision25.Arrray;

import java.util.ArrayList;

public class Josephus_Problem_using_recursion_And_the_jump_is_define {

    public static void main(String[] args) {

        int n = 10;
        int k =2;
        int ans = -1;

        ArrayList<Integer> person = new ArrayList<Integer>();

        for(int i = 1 ; i <= n; i++){
            person.add(i);
        }

        josphusProblemN2(n,k-1,0,person,ans);
        System.out.println(ans);
    }

    public static void josphusProblemN2(int n,int k,int index, ArrayList<Integer> person,int ans){

        if(person.size() == 1){
            ans = person.get(0);
            return;
        }

        index = (index + k) % person.size();
        person.remove(index);

        josphusProblemN2(n,k,index,person,ans);
        return;
    }

}
