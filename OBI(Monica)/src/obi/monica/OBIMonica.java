package obi.monica;

import java.util.Scanner;

public class OBIMonica {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int M = in.nextInt();
        int A = in.nextInt();
        int B = in.nextInt();       
        int C = M -(A+B);
        System.out.printf("%d\n", C);
    }
}
