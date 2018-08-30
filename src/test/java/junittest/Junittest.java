package junittest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import junit.SampleJunit;
import junit.framework.TestCase;

@RunWith(Suite.class)
@SuiteClasses(SampleJunit.class)
public class Junittest extends TestCase{

   SampleJunit sampleJunit = new SampleJunit();
   
   @Test
   public void testAddTwoNumbers() {	
      System.out.println("Running test for adding two numbers");    
      assertEquals(4, sampleJunit.addTwoNumbers(1, 3));     
   }
   
   
   @Test
   public void testsubtractTwoNumbers() {	
      System.out.println("Running test for adding two numbers");    
      assertEquals(2, sampleJunit.addTwoNumbers(3, 1));     
   }
}