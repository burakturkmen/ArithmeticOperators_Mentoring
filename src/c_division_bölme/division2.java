package c_division_bölme;

import java.util.Scanner;

public class division2 {
    public static void main(String[] args) {

        Scanner dp = new Scanner(System.in);

        int num1 = dp.nextInt();     //İŞLEM ÖNCELİĞİNDEN SOLDAN SAĞA BAŞLAR
        int num2 = dp.nextInt();     // 100 2 2
        int num3 = dp.nextInt();

        /* double num1 = dp.nextDouble();
           double num2 = dp.nextDouble();

           ---------  100 3
           ------------------ KÜSÜRAT YUVARLAMAYI SÖYLEDİKTEN SONRA DOUBLE LA DENE.
        */




        System.out.println(num1 / num2 / num3);
    }
}
