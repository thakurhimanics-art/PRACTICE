import java.util.HashSet;
import java.util.Scanner;

public class findDuplicate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];

        System.out.println("Enter elements:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();

        for (int x : arr) {

            if (set.contains(x)) {
                System.out.println("Duplicate: " + x);
                
            }

            set.add(x);
        }
    }
}