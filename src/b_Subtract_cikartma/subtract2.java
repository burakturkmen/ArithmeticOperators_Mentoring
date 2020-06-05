package b_Subtract_cikartma;

import java.util.Scanner;

public class subtract2 {
    public static void main(String[] args) {

        Scanner dp = new Scanner(System.in);

        int num1 = dp.nextInt();
        byte num2 = dp.nextByte();  //MAX BYTE: 127     MIN BYTE: -128
        byte num3 = dp.nextByte();  //MAX BYTE: 127     MIN BYTE: -128


        System.out.println(num1 - num2 - num3); //<<<<<----------------------------------------
    }
}
