package HackerRank.src.Tracks.ProblemSolving.DataStructures.Arrays.Arrays_DS.Java;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.nextLine();
        int[] elements = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        for (int i=num-1; i>=0; i--){
            System.out.print(elements[i] + " ");
        }
        scan.close();
    }
}
