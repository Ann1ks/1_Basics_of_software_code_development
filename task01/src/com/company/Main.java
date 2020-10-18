
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double z,a,b,c;
        System.out.println("input number (a)");
        a = in.nextDouble();
        System.out.println("input number (b)");
        b = in.nextDouble();
        System.out.println("input number (c)");
        c = in.nextDouble();
        z=((a-3)*b/2)+c;
        System.out.println("z="+z);
        in.close();
    }
}
