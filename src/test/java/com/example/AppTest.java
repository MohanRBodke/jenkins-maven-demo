package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testGreet() {
        assertEquals("Hello from Jenkins!", App.greet());
    }
}



// package com.example;

// import junit.framework.Test;
// import junit.framework.TestCase;
// import junit.framework.TestSuite;

// /**
//  * Unit test for simple App.
//  */
// public class AppTest 
//     extends TestCase
// {
//     /**
//      * Create the test case
//      *
//      * @param testName name of the test case
//      */
//     public AppTest( String testName )
//     {
//         super( testName );
//     }

//     /**
//      * @return the suite of tests being tested
//      */
//     public static Test suite()
//     {
//         return new TestSuite( AppTest.class );
//     }

//     /**
//      * Rigourous Test :-)
//      */
//     public void testApp()
//     {
//         assertTrue( true );
//     }
// }
