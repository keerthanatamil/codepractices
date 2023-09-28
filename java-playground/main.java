import java.util.*;
// import java.lang.*;
import java.util.ArrayList;
// import java.util.Collection;


class Main {
    public static void main(String arg[]) {

        System.out.print("Two Sum :");
        Scanner scn = new Scanner(System.in);

        int[] Array = { 1, 2, 3, 5, 7, 8, 3, 5 };
        List<Integer> array1 = new ArrayList<Integer>();
        int input = scn.nextInt();

        for (int i = 0; i < Array.length; i++) {
            for (int j = 0; j < Array.length; j++) {
                if (i == j) {
                    continue;
                } else {
                    if (Array[i] + Array[j] == input) {
                        array1.add(i);
                        System.out.print("j=>" + array1);
                    }
                }
            }
        }
        System.out.print(array1);

        scn.close();
    }
}