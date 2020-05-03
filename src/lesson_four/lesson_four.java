package lesson_four;

import java.util.ArrayList;
public class lesson_four {
    public static void main(String[] args) {
        ArrayList<Integer> fibNumbers = new ArrayList<Integer>();
        fibNumbers.add(0);
        fibNumbers.add(1);
        for (int i = 2; i < 20; i ++) {
            int temp = fibNumbers.get(i-1) + fibNumbers.get(i-2);
            fibNumbers.add(temp);
        }
        System.out.println(fibNumbers);
    }
}
