package com.epam.jwd.task2;

import com.epam.jwd.task2.solver.Solver;

import java.util.Scanner;

public class Main {

    public static void main(String ...args)
    {
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        while (!flag) {
            System.out.println("Enter a, then, b, then c");
            double a, b, c;
            a = sc.nextDouble();
            b = sc.nextDouble();
            c = sc.nextDouble();
            System.out.println("Result = " + Solver.GENERAL.solve(a, b, c));
            System.out.println("Do you wanna set another parameters?\n" +
                    "0 -- yes\n" +
                    "Other -- no");

            int i = sc.nextInt();
            if(i!=0)
            {
                flag=true;
            }
        }

    }

}
