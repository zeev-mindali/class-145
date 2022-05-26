package demo1;

import demo2.Narko;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflecationTest {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> myClass = Narko.class;
        Constructor<?> ctor = null;
        Method method = null;
        Object object = null;



        ctor = myClass.getDeclaredConstructor();
        object = ctor.newInstance();
        System.out.println(object);

        ctor = myClass.getDeclaredConstructor(String.class,float.class);
        object = ctor.newInstance("Tomer, same shit",55f);
        System.out.println(object);

        ctor = myClass.getDeclaredConstructor(int.class,String.class,float.class);
        object = ctor.newInstance(5,"Yuri",45f);
        System.out.println(object);

        /*     METHODS !!!!! */
        method = myClass.getDeclaredMethod("getName");
        System.out.println("get name :"+method.invoke(object));

        method = myClass.getDeclaredMethod("setName", String.class);
        method.invoke(object,"Roee/Roy/Roie/Roe/Roei/same shit");

        method = myClass.getDeclaredMethod("getName");
        System.out.println("get name :"+method.invoke(object));


    }
}
