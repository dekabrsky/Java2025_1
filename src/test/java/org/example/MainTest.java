package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MainTets{
    @Test
    void findsTwoRoots(){
        double[] roots = Main.solveQuadratic(1, -3, 2);
        assertArrayEquals(new double[]{1.0, 2.0}, roots, 0.000001);
    }

    @Test
    void findsOneRoot() {
        double[] roots = Main.solveQuadratic(1, -2, 1);
        assertArrayEquals(new double[]{1.0}, roots, 0.000001);
    }

    @Test
    void findsNoRealRoots() {
        double[] roots = Main.solveQuadratic(1, 0, 1);
        assertArrayEquals(new double[]{}, roots, 0.000001);
    }
}