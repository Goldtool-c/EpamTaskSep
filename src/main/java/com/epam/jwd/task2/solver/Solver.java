package com.epam.jwd.task2.solver;

public enum Solver {
    GENERAL;
    //Второе задание
    public double solve(double a, double b, double c)
    {
        double numerator = b + Math.pow((b*b +4*a*c), 0.5);
        double firstSummand = numerator/(2*a);
        double secondSummand = (a*a*a*c) - (1/(b*b));
        return firstSummand-secondSummand;
    }
}
