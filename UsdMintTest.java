/**
 * UsdMintTest
 *
 * 
 */

import java.lang.IllegalArgumentException;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class UsdMintTest{

	PrintStream origOut = System.out;
	ByteArrayOutputStream baos = new ByteArrayOutputStream();
	PrintStream newOut = new PrintStream(baos);

    static USDMint mint;

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
    public void testMakeCoin() {
    mint = USDMint.getInstance(); 
    Coin penny = mint.makeCoin("Penny");
	Coin nickel= mint.makeCoin("Nickel");
	Coin dime = mint.makeCoin("Dime"); 
	Coin quarter = mint.makeCoin("Quarter");
	Coin halfDollar = mint.makeCoin("HalfDollar");
	Coin dollar = mint.makeCoin("Dollar");

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

    
}