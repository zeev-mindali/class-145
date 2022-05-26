package demo1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> clazz = Singleton.class;
        Singleton s1 = Singleton.getInstance();
        Class myClass = s1.getClass();
        Object object = null;
        Constructor<?> ctor = clazz.getDeclaredConstructor(null);
        ctor.setAccessible(true);
        object = ctor.newInstance(null);
        object = ctor.newInstance(null);
        System.out.println(clazz.getName());
        System.out.println(myClass.getName());
        System.out.println("----------------");

        if (myClass.isInterface()) {
            System.out.println("we have an interface");
        } else {
            System.out.println("we have a class");
        }

    }
}
