package edu.yu.intro.junit_testing.sqrt.test;

import edu.yu.intro.methods.sqrt.RefactoredSqrtApproximation;

import org.junit.*;
import static org.junit.Assert.*;

public class SqrtApproximationTest { 

	@Test(expected = RuntimeException.class) 
	public void sqrtRootCalculationInputCantBeNegative() {
		RefactoredSqrtApproximation.sqrt(-1); 
	}

	@Test(expected = RuntimeException.class) 
	public void calculateSquareRootsInputCantBeNegative() {
		RefactoredSqrtApproximation.calculateSquareRoots(-1); 
	}

	@Test 
	public void sqrt0() {
		assertEquals("for sqrt(0): the actual result does not match the expected result", 0.000, RefactoredSqrtApproximation.sqrt(0), 0.0004);
	}

	@Test 
	public void sqrt2() {
		assertEquals("for sqrt(2): the actual result does not match the expected result", 1.41421, RefactoredSqrtApproximation.sqrt(2), 0.0004);
	}

	@Test 
	public void sqrt42() {
		assertEquals("for sqrt(42): the actual result does not match the expected result", 6.48074, RefactoredSqrtApproximation.sqrt(42), 0.0004);
	}

	@Test 
	public void sqrt10() {
		assertEquals("for sqrt(10): the actual result does not match the expected result", 3.16228, RefactoredSqrtApproximation.sqrt(10), 0.0004);
	}


    @Test 
    public void calculateSquareRootsMinimalLength() {
    	double[] smallestSqrtArray = {0.000};
    	assertArrayEquals("the application code does not correctly supplies the correct array values for the smallest legal square root array", smallestSqrtArray, RefactoredSqrtApproximation.calculateSquareRoots(0), 0.0004);


    }

    @Test 
    public void calculateSquareRootsHappyPaths() {
    	double[] reasonableSqrtArray = {0.000,1.000,1.414,1.732,2.000,2.236,2.449,2.646,2.828,3.000,3.162};
    	assertArrayEquals("the application code does not correctly supplies the correct array values for the input parameter n=10", reasonableSqrtArray, RefactoredSqrtApproximation.calculateSquareRoots(10), 0.0004);

    	
    }








}