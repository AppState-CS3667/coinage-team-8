/**
 * SmeltingTest 
 *
 * 
 */

import java.lang.IllegalArgumentException;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SmeltingTest{

	PrintStream origOut;
	ByteArrayOutputStream baos;
	PrintStream newOut;
    String testOutput;

    PennySmelt pennySmelt;
    NickelSmelt nickelSmelt;
    HDQDSmelt hdqdSmelt;
    DollarSmelt dollarSmelt;

	static String expectedResult1;
	static String expectedResult2;

	static String testOutputPenny;
	static String testOutputNickel;
	static String testOutputHDQD;
	static String testOutputDollar;


    @Test
    public void testSmelt() {

    pennySmelt = new PennySmelt();
    nickelSmelt= new NickelSmelt();
    hdqdSmelt = new HDQDSmelt();
    dollarSmelt = new DollarSmelt();

    expectedResult1 = "Smelting complete";
    expectedResult2 = "Smelting failed";

	testOutput = null;

    origOut = System.out;
    baos = new ByteArrayOutputStream();
    newOut = new PrintStream(baos);
    System.setOut(newOut);
    
	pennySmelt.smelt(); 

    System.out.flush();
    testOutput = baos.toString();
    testOutput = testOutput.trim();
    System.setOut(origOut);

    assertTrue(expectedResult1.equals(testOutput) || 
    expectedResult2.equals(testOutput),
		   "Expected:'" + expectedResult1 + " or " + expectedResult2 
		   + "' but got '" + testOutput+ "'.");  

    origOut = System.out;
    baos = new ByteArrayOutputStream();
    newOut = new PrintStream(baos);
    System.setOut(newOut);
    
	nickelSmelt.smelt(); 

    System.out.flush();
    testOutput = baos.toString();
    testOutput = testOutput.trim();
    System.setOut(origOut);

    assertTrue(expectedResult1.equals(testOutput) || 
    expectedResult2.equals(testOutput),
		   "Expected:'" + expectedResult1+ "or" + expectedResult2 
		   + "' but got '" + testOutput+ "'.");  


    origOut = System.out;
    baos = new ByteArrayOutputStream();
    newOut = new PrintStream(baos);
    System.setOut(newOut);
    
	hdqdSmelt.smelt(); 

    System.out.flush();
    testOutput = baos.toString();
    testOutput = testOutput.trim();
    System.setOut(origOut);

    assertTrue(expectedResult1.equals(testOutput) || 
    expectedResult2.equals(testOutput),
		   "Expected:'" + expectedResult1+ "or" + expectedResult2 
		   + "' but got '" + testOutput+ "'.");  


    origOut = System.out;
    baos = new ByteArrayOutputStream();
    newOut = new PrintStream(baos);

    System.setOut(newOut);
    
	dollarSmelt.smelt(); 

    System.out.flush();
    testOutput = baos.toString();
    testOutput = testOutput.trim();
    System.setOut(origOut);

    assertTrue(expectedResult1.equals(testOutput) || 
    expectedResult2.equals(testOutput),
		   "Expected:'" + expectedResult1+ " or " + expectedResult2 
		   + "' but got '" + testOutput+ "'.");  


    }

    
}