
package tugas3;

import java.util.Scanner;

/**
 * 
 * @author lenovo
 */
public class testLinEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pilihan : \n1. Soal Utama \n2. Soal Optional");
        System.out.print("pilih : ");
        int pilih = input.nextInt();
        switch(pilih){
            case 1:
            {
                System.out.print("Input\t: ");
                double a1 = input.nextDouble();
                double b1 = input.nextDouble();
                double a2 = input.nextDouble();
                double b2 = input.nextDouble();
                double c1 = input.nextDouble();
                double c2 = input.nextDouble();
                LinearEquation l1 = new LinearEquation(a1, b1, c1);
                LinearEquation l2 = new LinearEquation(a2,b2,c2);
                System.out.println("\nOutput\t:\nSistem Persamaannya:");
                l1.cetak();
                l2.cetak();
                double x = l1.getX(l2);
                double y = l1.getY(l2);
                boolean solusi;
                if (l1.cekSolusi(l2) == true)
                    System.out.println("\nHasilnya:\nSistem tidak memiliki penyelesaian");
                else
                    System.out.println("\nHasilnya: \nx = "+x+" , y = "+ y);
                break;
            }
            case 2:
            {
                System.out.print("Input\t: ");
                double a1 = input.nextDouble();
                double b1 = input.nextDouble();
                double a2 = input.nextDouble();
                double b2 = input.nextDouble();
                double a3 = input.nextDouble();
                double b3 = input.nextDouble();
                double c1 = input.nextDouble();
                double c2 = input.nextDouble();
                double c3 = input.nextDouble();
                LinearEquation l1 = new LinearEquation(a1,b1,c1);
                LinearEquation l2 = new LinearEquation(a2,b2,c2);
                LinearEquation l3 = new LinearEquation(a3, b3,c3);
                System.out.println("\nOutput\t:\nSistem Persamaannya:");
                l1.cetak();
                l2.cetak();
                l3.cetak();
                double x1 = l1.getX(l2);
                double y1 = l1.getY(l2);
                double x2 = l1.getX(l3);
                double y2 = l1.getY(l3);
                double x3 = l2.getX(l3);
                double y3 = l2.getY(l3);
                boolean solusi;
                if (l1.cekSolusi(l2) == true)
                    System.out.println("\nHasilnya:\nSistem tidak memiliki penyelesaian");
                else
                    System.out.println("\nHasilnya: ");
                    System.out.println("x = "+x1+"  , y = "+y1
                    +"\nx = "+x2+"  , y = "+y2+ "\nx = "+x3+"   , y = "+y3);
                break;
            }
        }
        
    }
}
