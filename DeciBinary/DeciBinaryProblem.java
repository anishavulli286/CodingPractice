package DeciBinary;

import java.util.Scanner;

public class DeciBinaryProblem {

    public static int calculateNumbers(String n) {
        String[] numSplit = n.split("");
        int max = 0;
        for(String s : numSplit) {
            int temp = Integer.parseInt(s);
            if(max < temp) {
                max = temp;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        int num = calculateNumbers(number);
        System.out.println(num);
        sc.close();
    }
}
