/**
 * UsdTest
 *
 * 
 */

import java.lang.IllegalArgumentException;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class UsdTest{

	PrintStream origOut = System.out;
	ByteArrayOutputStream baos = new ByteArrayOutputStream();
	PrintStream newOut = new PrintStream(baos);

	static Penny penny;
	static Nickel nickel;
	static Dime dime; 
	static Quarter quarter;
	static HalfDollar halfDollar;
	static Dollar dollar;

	static String expectedPennyResult;
	static String expectedNickelResult;
	static String expectedDimeResult;
	static String expectedQuarterResult;
	static String expectedHalfDollarResult;
	static String expectedDollarResult;

	static String testOutputPenny;
	static String testOutputNickel;
	static String testOutputDime;
	static String testOutputQuarter;
	static String testOutputHalfDollar;
	static String testOutputDollar;

    @Test
    public void testConstructor() {

	try {
		penny = new Penny();
		nickel = new Nickel();
		dime= new Dime();
		quarter = new Quarter();
		halfDollar = new HalfDollar();
		dollar = new Dollar();
	    
	    assertNotNull(penny);
	    assertNotNull(nickel);
	    assertNotNull(dime);
	    assertNotNull(quarter);
	    assertNotNull(halfDollar);
	    assertNotNull(dollar);
	}
	catch (Exception e) {
	    fail("Constructor threw exception: " + e.getMessage());
	}
    }

    @Test
    public void testGetName() {
	penny = new Penny();
	nickel = new Nickel();
	dime= new Dime();
	quarter = new Quarter();
	halfDollar = new HalfDollar();
	dollar = new Dollar();

	expectedPennyResult = "Penny";
	expectedNickelResult= "Nickel";
	expectedDimeResult= "Dime";
	expectedQuarterResult= "Quarter";
	expectedHalfDollarResult = "Half Dollar";
	expectedDollarResult = "Dollar";

	testOutputPenny = null;
	testOutputNickel= null;
	testOutputDime= null;
	testOutputQuarter= null;
	testOutputHalfDollar= null;
	testOutputDollar= null;

	testOutputPenny = penny.getName();
	testOutputNickel = nickel.getName();
	testOutputDime = dime.getName();
	testOutputQuarter = quarter.getName();
	testOutputHalfDollar = halfDollar.getName();
	testOutputDollar = dollar.getName();

	assertTrue(expectedPennyResult.equals(testOutputPenny),
		   "Expected:'" + expectedPennyResult 
		   + "' but got '" + testOutputPenny + "'.");
	assertTrue(expectedNickelResult.equals(testOutputNickel),
		   "Expected:'" + expectedNickelResult 
		   + "' but got '" + testOutputNickel + "'.");
	assertTrue(expectedDimeResult.equals(testOutputDime),
		   "Expected:'" + expectedDimeResult 
		   + "' but got '" + testOutputDime + "'.");	
	assertTrue(expectedQuarterResult.equals(testOutputQuarter),
		   "Expected:'" + expectedQuarterResult 
		   + "' but got '" + testOutputQuarter + "'.");
	assertTrue(expectedHalfDollarResult.equals(testOutputHalfDollar),
		   "Expected:'" + expectedHalfDollarResult 
		   + "' but got '" + testOutputHalfDollar + "'.");
	assertTrue(expectedDollarResult.equals(testOutputDollar),
		   "Expected:'" + expectedDollarResult 
		   + "' but got '" + testOutputDollar + "'.");
    }

    @Test
    public void testGetCountryCode() {
	penny = new Penny();
	nickel = new Nickel();
	dime= new Dime();
	quarter = new Quarter();
	halfDollar = new HalfDollar();
	dollar = new Dollar();

	expectedPennyResult = "USD";
	expectedNickelResult= "USD";
	expectedDimeResult= "USD";
	expectedQuarterResult= "USD";
	expectedHalfDollarResult = "USD";
	expectedDollarResult = "USD";

	testOutputPenny = null;
	testOutputNickel= null;
	testOutputDime= null;
	testOutputQuarter= null;
	testOutputHalfDollar= null;
	testOutputDollar= null;

	testOutputPenny = penny.getCountryCode();
	testOutputNickel = nickel.getCountryCode();
	testOutputDime = dime.getCountryCode();
	testOutputQuarter = quarter.getCountryCode();
	testOutputHalfDollar = halfDollar.getCountryCode();
	testOutputDollar = dollar.getCountryCode();

	assertTrue(expectedPennyResult.equals(testOutputPenny),
		   "Expected:'" + expectedPennyResult 
		   + "' but got '" + testOutputPenny + "'.");
	assertTrue(expectedNickelResult.equals(testOutputNickel),
		   "Expected:'" + expectedNickelResult 
		   + "' but got '" + testOutputNickel + "'.");
	assertTrue(expectedDimeResult.equals(testOutputDime),
		   "Expected:'" + expectedDimeResult 
		   + "' but got '" + testOutputDime + "'.");	
	assertTrue(expectedQuarterResult.equals(testOutputQuarter),
		   "Expected:'" + expectedQuarterResult 
		   + "' but got '" + testOutputQuarter + "'.");
	assertTrue(expectedHalfDollarResult.equals(testOutputHalfDollar),
		   "Expected:'" + expectedHalfDollarResult 
		   + "' but got '" + testOutputHalfDollar + "'.");
	assertTrue(expectedDollarResult.equals(testOutputDollar),
		   "Expected:'" + expectedDollarResult 
		   + "' but got '" + testOutputDollar + "'.");
 
    }
	@Test
    public void testGetDenomination() {

	penny = new Penny();
	nickel = new Nickel();
	dime= new Dime();
	quarter = new Quarter();
	halfDollar = new HalfDollar();
	dollar = new Dollar();

	expectedPennyResult = "0.01";
	expectedNickelResult= "0.05";
	expectedDimeResult= "0.1";
	expectedQuarterResult= "0.25";
	expectedHalfDollarResult= "0.5"; 
	expectedDollarResult= "1.0"; 

	testOutputPenny = null;
	testOutputNickel= null;
	testOutputDime= null;
	testOutputQuarter= null;
	testOutputHalfDollar= null;
	testOutputDollar= null;

	testOutputPenny = String.valueOf(penny.getDenomination());
	testOutputNickel = String.valueOf(nickel.getDenomination());
	testOutputDime = String.valueOf(dime.getDenomination());
	testOutputQuarter = String.valueOf(quarter.getDenomination());
	testOutputHalfDollar = String.valueOf(halfDollar.getDenomination());
	testOutputDollar = String.valueOf(dollar.getDenomination());

	assertTrue(expectedPennyResult.equals(testOutputPenny),
		   "Expected:'" + expectedPennyResult 
		   + "' but got '" + testOutputPenny + "'.");
	assertTrue(expectedNickelResult.equals(testOutputNickel),
		   "Expected:'" + expectedNickelResult 
		   + "' but got '" + testOutputNickel + "'.");
	assertTrue(expectedDimeResult.equals(testOutputDime),
		   "Expected:'" + expectedDimeResult 
		   + "' but got '" + testOutputDime + "'.");	
	assertTrue(expectedQuarterResult.equals(testOutputQuarter),
		   "Expected:'" + expectedQuarterResult 
		   + "' but got '" + testOutputQuarter + "'.");
	assertTrue(expectedHalfDollarResult.equals(testOutputHalfDollar),
		   "Expected:'" + expectedHalfDollarResult 
		   + "' but got '" + testOutputHalfDollar + "'.");
	assertTrue(expectedDollarResult.equals(testOutputDollar),
		   "Expected:'" + expectedDollarResult 
		   + "' but got '" + testOutputDollar + "'.");
 
    }

}