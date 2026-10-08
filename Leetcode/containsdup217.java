
import java.util.HashSet;
import java.util.Scanner;
public class containsdup217{

    public static boolean containsDuplicate(int[] nums){
        HashSet<Integer> set=new HashSet<>();
        for (int x: nums){
            if(set.contains(x)){
                return true;
            }
            set.add(x);
        }
        return false;


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nums[]=new int[5];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(containsDuplicate(nums));


    }
}