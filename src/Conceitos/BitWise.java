package Conceitos;

import java.util.Scanner;

public class BitWise {
    public static void main(String[] args) {
        // 0101 1001 = 89
        // 0011 1100 = 60
        int n1 = 89;
        int n2 = 60;
        System.out.println(n1 & n2);
        System.out.println(n1 | n2);
        System.out.println(n1 ^ n2);
        System.out.println();
        //

        Scanner scan = new Scanner(System.in);

        int mask = 0b100000;
        int n = scan.nextInt();
        if((n & mask) != 0){
            System.out.println("6th bit is true!");
        } else {
            System.out.println("6th bit is false!");
        }
    }
}
