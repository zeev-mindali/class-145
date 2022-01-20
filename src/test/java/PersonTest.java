import junit.framework.TestCase;

import java.util.Locale;

import static org.junit.Assert.assertNotEquals;

public class PersonTest extends TestCase {
    private Person person1, person2, person3, person4;
    /*
    public PersonTest() {
        super("Person tests");
        System.out.println("inside constructor");
    }
    */

    @Override
    protected void setUp() throws Exception {
        System.out.println("\ninside setup method");
        person1 = new Person("ZeEv", "Mindali");
        person2 = new Person("Amital", "Mindali");
        person3 = person1;
        person4 = new Person("Zeevik", "Mindali");
    }

    @Override
    protected void runTest() throws Throwable {
        System.out.println("My Test is running now");
    }

    public void testPersonEqual() {
        System.out.println(person1.getfName()+" "+person1.getlName());
        assertEquals(person1, person1);
    }

    public void testPersonEqualVer2(){
        assertEquals(person1,person2);
    }

    public void testPersonEqualVer3(){
        assertEquals(person1,person3);
    }

    public void testPersonSame(){ //refernce
        assertSame(person1,person4);
    }

    public void testPersonEqualVer4(){ //equlas - but we must override equals!!!!
        assertNotEquals(person1,person4);
    }

    public void testLowerCase(){
        assertEquals(person1.getfName().toLowerCase(),person1.getfName());
    }

    public void testRestDayVer1(){
        //check for invalid number
        try {
            person1.restDay(-2);
            fail("exception needed to be thrown !!!!");
        } catch (Exception e) {
            assertTrue(true);
            System.out.println(e.getMessage());
        }
    }
    public void testRestDayVer2(){
        try {
            person1.restDay(2);
            fail("exception was expected here !!");
        } catch (Exception e) {
            assertTrue(true);
            System.out.println(e.getMessage());
        }
    }
    public void testRestDayVer3(){
        try {
            person1.restDay(6);
        } catch (Exception e) {
            fail("we don't need the exception here");
            System.out.println(e.getMessage());
        }
    }

    @Override
    protected void tearDown() throws Exception {
        System.out.println("Finished test\n");
    }
}
