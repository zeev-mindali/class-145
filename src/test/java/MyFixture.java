import junit.framework.TestCase;

public class MyFixture extends TestCase {
    public void runMyTest(){
        System.out.println("Running a test.....");

    }

    public void runMyCar(){
        System.out.println("Running car engine.....");
    }

    /*
    @Override
    protected void runTest() throws Throwable {
        runMyTest();
        runMyCar();
    }

     */

    @Override
    protected void setUp() throws Exception {
        System.out.println("\nstart the test");
    }

    @Override
    protected void tearDown() throws Exception {
        System.out.println("Test finished\n");
    }

    public void testStart(){
        System.out.println("we got a test");
    }
}
