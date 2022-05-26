import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MySystemOutPrintln {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        System.out.println("Hello Class 145 !!! and goodbye :) Whoo ooooo");

        //System.out.println

        //System
        Class<?> systemClass = java.lang.Class.forName("java.lang.System");
        //out
        Field outField = systemClass.getDeclaredField("out");
        Class<?> printStreamClass = outField.getType();
        //go for method
        Method printMethod = printStreamClass.getDeclaredMethod("println",String.class);

        //where is the object?????
        Object object = outField.get(null);

        //let run the command (invoke that beach)
        printMethod.invoke(object,"And now we using reflection to print");


    }
}
