import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Polindrom {
    public static void main(String[] args) {

        System.out.println(isPalindrome(-12321));
    }
    public static boolean isPalindrome(int x){

        boolean result = false;


        ArrayList<Integer> listPol  = new ArrayList<>();
        ArrayList<Integer> listPolReversed  = new ArrayList<>();

        while (x > 0){
        listPol.add(x%10);
        x = x/10;
        }

        System.out.println(listPol.toArray().length);

        System.out.println(Arrays.toString(listPol.toArray()));

        for(int i = listPol.toArray().length - 1; i >= 0; i--){
            listPolReversed.add(listPol.get(i));
        }

     //   listPolReversed.addAll(listPol.reversed());

        System.out.println(Arrays.toString(listPolReversed.toArray()));



     if(listPol.equals(listPolReversed)){
            result = true;
        }
     if(x < 0){
         result = false;
     }

        return result;
    }

}
