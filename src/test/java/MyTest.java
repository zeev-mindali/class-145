import junit.framework.TestCase;

public class MyTest extends TestCase {
    //we will create a class that will emulate Math.pow(x,y)
    public void testVer1(){
        //the result is the same
        assertEquals(243, MyCalculator.powerVer1(3,5));
        //my condition to check if the number is equal....
        if (MyCalculator.powerVer1(3,5)%2==1){
            fail("the number is not even");
        }
        System.out.println("Test 1 passed");
    }

    public void testVer2(){
        assertEquals(243, MyCalculator.powerVer2(3,5));
        System.out.println("test 2 passed");
    }

    public void testMathPow(){
        assertEquals(243.0,Math.pow(3,5));
        System.out.println("check test passed");
    }

    public void testCoffee(){
        assertFalse(MyCalculator.needCoffee());
        System.out.println("test coffee");
    }

    public void zeev(){
        assertEquals(243,243);
        System.out.println("All green go a head");
    }

    public static void main1(String[] args) {
        junit.textui.TestRunner.run(MyTest.class);
    }
}
