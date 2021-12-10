package com.sys.test;

import java.lang.reflect.Field;

public class StudentTest {
    public static void main(String[] args) {
        try {
            Class<?> class1=Class.forName("com.sys.stu.Student");
            Object obj=class1.newInstance();
            System.out.println(obj.toString());
            Field[] f=class1.getDeclaredFields();
            for (Field f1:
                 f) {
                f1.setAccessible(true);
                //f1.set
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
