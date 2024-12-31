package silver5.day4;


import java.util.Scanner;

public class Q1427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[] = new int [10];
        char[] temp = sc.nextLine().toCharArray();
        for (int i = 0; i < temp.length; i++) {
            int num = Integer.parseInt(String.valueOf(temp[i]));
            A[num]++;
        }
        for (int i = 9; i >= 0;) {
            if (A[i] != 0) {
                System.out.print(i);
                A[i]--;
            } else {
                i--;
            }
        }
    }
}
