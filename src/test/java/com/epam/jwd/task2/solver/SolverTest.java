package com.epam.jwd.task2.solver;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolverTest {

    @Test
    public void solve() {
        double a = 1, b = 2, c = 4;
        double res = Solver.GENERAL.solve(a,b,c);
        Assert.assertEquals(-0.51, res, 0.01);
    }
}