package studio5;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import edu.princeton.cs.introcs.StdDraw;
import studio5.tests.ArrayMeanTestSuite;
import studio5.tests.ArraySumTestSuite;
import studio5.tests.DistanceBetweenTest;
import studio5.tests.FilledArraySumAndMeanComprehensiveTest;
import studio5.tests.FilledArrayTestSuite;
import studio5.tests.SubstituteAllTestSuite;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ DistanceBetweenTest.class, SubstituteAllTestSuite.class, ArraySumTestSuite.class,
		FilledArrayTestSuite.class, ArrayMeanTestSuite.class, FilledArraySumAndMeanComprehensiveTest.class })
public class MethodsTestSuite {
	public static void drawBullsEye(double x, double y, double radius) {
radius=0.5;
		
		
		x=0.5;
				
		y=0.5;
		
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.filledCircle(x, y, radius);
		
		StdDraw.setPenColor(StdDraw.BLUE);
		StdDraw.filledCircle(x, y, (3.0/4.0)*radius);
		
		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.filledCircle(x, y, (2.0/4.0)*radius);
		
		StdDraw.setPenColor(StdDraw.YELLOW);
		StdDraw.filledCircle(x, y, (1.0/4.0)*radius);
	

	}
}
