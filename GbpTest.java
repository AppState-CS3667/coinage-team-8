// /**
//  * Gbp 
//  *
//  * 
//  */

// import java.lang.IllegalArgumentException;
// import java.io.PrintStream;
// import java.io.ByteArrayOutputStream;
// import static org.junit.jupiter.api.Assertions.*;
// import org.junit.jupiter.api.Test;

// public class UsdTest{

// 	PrintStream origOut = System.out;
// 	ByteArrayOutputStream baos = new ByteArrayOutputStream();
// 	PrintStream newOut = new PrintStream(baos);

// 	static FivePound fivePound; 
// 	static TwoPound twoPound; 
// 	static Pound pound;  
// 	static FiftyPence fiftyPence; 
// 	static TwentyPence twentyPence; 
// 	static TenPence tenPence; 
//     static FivePence fivePence;
//     static TwoPence twoPence; 

// 	String expectedFivePoundResult;
// 	String expectedTwoPoundResult;
// 	String expectedPoundResult;
// 	String expectedFiftyPenceResult;
// 	String expectedTwentyPenceResult;
// 	String expectedTenPenceResult;
// 	String expectedFivePenceResult;
// 	String expectedTwoPenceResult;

// 	String testOutputFivePound;
// 	String testOutputTwoPound;
// 	String testOutputPound;
// 	String testOutputFiftyPence;
// 	String testOutputTwentyPence;
// 	String testOutputTenPence;
// 	String testOutputFivePence;
// 	String testOutputTwoPence;

//     @Test
//     public void testConstructor() {

// 	try {

// 		fivePound = new FivePound();	    
//         twoPound = new TwoPound();
//         pound = new Pound();
//         fiftyPence = new FiftyPence();
//         twentyPence = new TwentyPence();
//         tenPence = new TenPence();
//         fivePence = new FivePence();
//         twoPence = new twoPence();

// 	    assertNotNull(fivePound);
// 	    assertNotNull(twoPound);
// 	    assertNotNull(pound);
// 	    assertNotNull(fiftyPence);
// 	    assertNotNull(twentyPence);
// 	    assertNotNull(tenPence);
// 	    assertNotNull(fivePence);
// 	    assertNotNull(twoPence);
// 	}
// 	catch (Exception e) {
// 	    fail("Constructor threw exception: " + e.getMessage());
// 	}
//     }

//     @Test
//     public void testGetName() {
//     expectedFivePoundResult = "";
// 	expectedTwoPoundResult;
// 	expectedPoundResult;
// 	expectedFiftyPenceResult;
// 	expectedTwentyPenceResult;
// 	expectedTenPenceResult;
// 	expectedFivePenceResult;
// 	expectedTwoPenceResult;

// 	String testOutputFivePound;
// 	String testOutputTwoPound;
// 	String testOutputPound;
// 	String testOutputFiftyPence;
// 	String testOutputTwentyPence;
// 	String testOutputTenPence;
// 	String testOutputFivePence;
// 	String testOutputTwoPence;
	

// 	assertTrue(expectedPennyResult.equals(testOutputPenny),
// 		   "Expected:'" + expectedResult 
// 		   + "' but got '" + testOutput + "'.");
// 	assertTrue(expectedNickelResult.equals(testOutputNickel),
// 		   "Expected:'" + expectedResult 
// 		   + "' but got '" + testOutput + "'.");
// 	assertTrue(expectedDimeResult.equals(testOutputDime),
// 		   "Expected:'" + expectedResult 
// 		   + "' but got '" + testOutput + "'.");	
// 	assertTrue(expectedQuarterResult.equals(testOutputQuarter),
// 		   "Expected:'" + expectedResult 
// 		   + "' but got '" + testOutput + "'.");
// 	assertTrue(expectedHalfDollarResult.equals(testOutputHalfDollar),
// 		   "Expected:'" + expectedResult 
// 		   + "' but got '" + testOutput + "'.");
// 	assertTrue(expectedDollarResult.equals(testOutputDollar),
// 		   "Expected:'" + expectedResult 
// 		   + "' but got '" + testOutput + "'.");
//     }

//     @Test
//     public void testGetCountryCode() {

// 	expectedPennyResult = "USD";
// 	expectedNickelResult= "USD";
// 	expectedDimeResult= "USD";
// 	expectedQuarterResult= "USD";
// 	expectedHalfDollarResult = "USD";
// 	expectedDollarResult = "USD";

// 	testOutputPenny = null;
// 	testOutputNickel= null;
// 	testOutputDime= null;
// 	testOutputQuarter= null;
// 	testOutputHalfDollar= null;
// 	testOutputDollar= null;

// 	testOutputPenny = penny.getCountryCode();
// 	testOutputNickel = nickel.getCountryCode();
// 	testOutputDime = dime.getCountryCode();
// 	testOutputQuarter = quarter.getCountryCode();
// 	testOutputHalfDollar = halfDollar.getCountryCode();
// 	testOutputDollar = dollar.getCountryCode();

// 	assertTrue(expectedPennyResult.equals(testOutputPenny),
// 		   "Expected:'" + expectedResult 
// 		   + "' but got '" + testOutput + "'.");
// 	assertTrue(expectedNickelResult.equals(testOutputNickel),
// 		   "Expected:'" + expectedResult 
// 		   + "' but got '" + testOutput + "'.");
// 	assertTrue(expectedDimeResult.equals(testOutputDime),
// 		   "Expected:'" + expectedResult 
// 		   + "' but got '" + testOutput + "'.");	
// 	assertTrue(expectedQuarterResult.equals(testOutputQuarter),
// 		   "Expected:'" + expectedResult 
// 		   + "' but got '" + testOutput + "'.");
// 	assertTrue(expectedHalfDollarResult.equals(testOutputHalfDollar),
// 		   "Expected:'" + expectedResult 
// 		   + "' but got '" + testOutput + "'.");
// 	assertTrue(expectedDollarResult.equals(testOutputDollar),
// 		   "Expected:'" + expectedResult 
// 		   + "' but got '" + testOutput + "'.");
 
//     }
// 	@Test
//     public void testGetDenomination() {

// 	expectedPennyResult = "0.01";
// 	expectedNickelResult= "0.05";
// 	expectedDimeResult= "0.10";
// 	expectedQuarterResult= "0.25";
// 	expectedHalfDollarResult= "0.50"; 
// 	expectedDollarResult= "1.00"; 

// 	testOutputPenny = null;
// 	testOutputNickel= null;
// 	testOutputDime= null;
// 	testOutputQuarter= null;
// 	testOutputHalfDollar= null;
// 	testOutputDollar= null;

// 	testOutputPenny = String.valueOf(penny.getDenomination());
// 	testOutputNickel = String.valueOf(nickel.getDenomination());
// 	testOutputDime = String.valueOf(dime.getDenomination());
// 	testOutputQuarter = String.valueOf(quarter.getDenomination());
// 	testOutputHalfDollar = String.valueOf(halfDollar.getDenomination());
// 	testOutputDollar = String.valueOf(dollar.getDenomination());

// 	assertTrue(expectedPennyResult.equals(testOutputPenny),
// 		   "Expected:'" + expectedResult 
// 		   + "' but got '" + testOutput + "'.");
// 	assertTrue(expectedNickelResult.equals(testOutputNickel),
// 		   "Expected:'" + expectedResult 
// 		   + "' but got '" + testOutput + "'.");
// 	assertTrue(expectedDimeResult.equals(testOutputDime),
// 		   "Expected:'" + expectedResult 
// 		   + "' but got '" + testOutput + "'.");	
// 	assertTrue(expectedQuarterResult.equals(testOutputQuarter),
// 		   "Expected:'" + expectedResult 
// 		   + "' but got '" + testOutput + "'.");
// 	assertTrue(expectedHalfDollarResult.equals(testOutputHalfDollar),
// 		   "Expected:'" + expectedResult 
// 		   + "' but got '" + testOutput + "'.");
// 	assertTrue(expectedDollarResult.equals(testOutputDollar),
// 		   "Expected:'" + expectedResult 
// 		   + "' but got '" + testOutput + "'.");
 
//     }

// }