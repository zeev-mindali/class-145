package demo1;

import demo2.Narko;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class TomerInvestigation {
    public static void main(String[] args) {
        Class<?> clazz = Narko.class;

        System.out.println("----------Basic meta data----------");
        System.out.println(clazz.getName());
        System.out.println(clazz.getPackageName());
        System.out.println(clazz.getSimpleName());
        System.out.println("-----------Access Modifiers for class level---------");
        int classModifiers = clazz.getModifiers();
        System.out.println("Clazz.getModifiers() "+classModifiers);
        System.out.println("is Public       : "+ Modifier.isPublic(classModifiers));
        System.out.println("is Final        : "+ Modifier.isFinal(classModifiers));
        System.out.println("is Static       : "+ Modifier.isStatic(classModifiers));
        System.out.println("is Private      : "+ Modifier.isPrivate(classModifiers));
        System.out.println("is Protected    : "+ Modifier.isProtected(classModifiers));
        System.out.println("is Synchronized : "+ Modifier.isSynchronized(classModifiers));
        System.out.println("is Abstract     : "+ Modifier.isAbstract(classModifiers));
        System.out.println("-----------Super class---------");
        System.out.println("super class     : "+clazz.getSuperclass());
        System.out.println("-----------Interfaces----------");
        Class[] interfaces = clazz.getInterfaces();
        Arrays.stream(interfaces).forEach(System.out::println);
        System.out.println("-----------CTOR----------------");
        Constructor[] constructors = clazz.getConstructors();
        Arrays.stream(constructors).forEach(System.out::println);
        System.out.println("-----------METHOD--------------");
        Method[] methods = clazz.getMethods();
        Arrays.stream(methods).forEach(System.out::println);
        System.out.println("-----------GETTERS-------------");
        Arrays.stream(methods).filter(method->method.getName().startsWith("get")).forEach(System.out::println);
        System.out.println("-----------SETTERS-------------");
        Arrays.stream(methods).filter(method->method.getName().startsWith("set")).forEach(System.out::println);
        System.out.println("-----------Fields-------------");
        Field[] fields = clazz.getDeclaredFields();
        Arrays.stream(fields).forEach(field-> System.out.println(field.getName()));
    }
}
