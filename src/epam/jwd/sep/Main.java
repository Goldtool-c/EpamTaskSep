package epam.jwd.sep;

import epam.jwd.sep.solver.Solver;

import java.util.Scanner;

public class Main {
    public static void main(String ...args)
    {
        while(true)
        {
            System.out.println("Choose program to start");
            int way;
            System.out.println("1 -- Составить линейную программу, печатающую значение true, если указанное высказывание является истинным, и false — в противном случае:\n" +
                    "2 -- Вычислить значение выражения по формуле (все переменные принимают действительные значения):\n" +
                    "3 -- Вычислить периметр и площадь прямоугольного треугольника по длинам а и b  двух катетов.\n" +
                    "4 -- Для данных областей составить линейную программу, которая печатает true, если точка с координатами (х, у) принадлежит закрашенной области, и false — в противном случае:\n" +
                    "5 -- Даны три действительных числа. Возвести в квадрат те из них, значения которых неотрицательны, и в четвертую степень — отрицательные.\n" +
                    "6 -- Написать программу нахождения суммы большего и меньшего из трех чисел.\n" +
                    "7 -- Составить программу для вычисления значений функции  F(x) на отрезке [а, b] с шагом h. Результат представить в виде таблицы, первый столбец которой – значения  аргумента, второй - соответствующие значения функции:\n" +
                    "8 -- В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.\n" +
                    "9 -- Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в один массив, включив второй массив между k-м и (k+1) - м элементами первого\n" +
                    "10 --Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):\n" +
                    "Other -- Shut down program\n");
            Scanner sc = new Scanner(System.in);
            way = sc.nextInt();
            if (way>10||way<1)
            {
                break;
            }
            switch (way) {
                case 1: {
                    System.out.println(Solver.GENERAL.solveFirst());
                    break;
                }
                case 2: {
                    System.out.println(Solver.GENERAL.solveSecond());
                    break;
                }
                case 3: {
                    Solver.GENERAL.solveThird();
                    break;
                }
                case 4: {
                    System.out.println(Solver.GENERAL.solveFourth());
                    break;
                }
                case 5: {
                    Solver.GENERAL.solveFifth();
                    break;
                }
                case 6: {
                    System.out.println(Solver.GENERAL.solveSix());
                    break;
                }
                case 7: {
                    Solver.GENERAL.solveSeventh();
                    break;
                }
                case 8: {
                    System.out.println(Solver.GENERAL.solveEight());
                    break;
                }
                case 9: {
                    Solver.GENERAL.solveNine();
                    break;
                }
                case 10: {
                    Solver.GENERAL.solveTen();
                    break;
                }
                default:{
                    System.out.println("ahahahaha");
                }
            }
        }
    }
}
