

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int nums[] = {2,5,5,1};


        int[] intermidate = twoSum(nums, 10);

        for(int i=0; i< intermidate.length; i++){
            System.out.println(intermidate[i]);
        }

    }

    public static int[] twoSum(int[] nums, int target) {
        int result[] = new int[2];
        for(int i= 0;i< nums.length;i++){
           for(int j= i+1; j< nums.length; j++){
               if(nums[i] + nums[j] == target){
                   result[0] = i;
                   result[1] = j;
                   return result;
               }
           }
        }

        return result;
    }
}