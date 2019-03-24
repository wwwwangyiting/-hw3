package hw3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class test {
     
    private printPrimes primeTest;
    private static int[] result=new int [100];
    @Before
    public void setUp() throws Exception {
        primeTest = new printPrimes();
        result[0]=2;
        result[1]=3;
        result[2]=5;
        result[3]=7;
        result[4]=11;
    }
 
    @Test
    public void testPrintPrimes() {
        assertArrayEquals(result,primeTest.printPrimes(5));
        
    }
}