package junittest;

import org.junit.Test;

import junit.SampleJunit;
import junit.framework.TestCase;

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