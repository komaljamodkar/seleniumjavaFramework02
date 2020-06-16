package junitproject;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class PrimecheckTest {
	
private Integer inputNumber;
private Boolean expectedResult;
private Primecheck primecheck;

@Before
public void  intialize()
{
	primecheck =new Primecheck();
	
}

public PrimecheckTest(Integer inputNumber, Boolean expectedResult) {
    this.inputNumber = inputNumber;
    this.expectedResult = expectedResult;
 }

 @Parameterized.Parameters
 public static Collection primeNumbers() {
    return Arrays.asList(new Object[][] {
       { 2, true },
       { 6, false },
       { 19, true },
       { 22, false },
       { 23, true }
    });
 }

 // This test will run 4 times since we have 5 parameters defined
 @Test
 public void testPrimeNumberChecker() {
    System.out.println("Parameterized Number is : " + inputNumber);
    assertEquals(expectedResult, 
    		primecheck.validate(inputNumber));
 }
}
