package junittest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.SampleJunit;

public class Junittest {

   SampleJunit sampleJunit = new SampleJunit();
   
   @Test
   public void testAddTwoNumbers() {	
      System.out.println("Running test for adding two numbers");    
      assertEquals(4, sampleJunit.addTwoNumbers(1, 3));     
   }
}