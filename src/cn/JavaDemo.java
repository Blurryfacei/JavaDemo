package cn;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * @author huang
 */
public  abstract  class JavaDemo {
    public static int getValue() {
        ArrayList list=new ArrayList();
        LinkedList list1=new LinkedList();
        list.add(10);
        int i = 1;
        try {
            i = 4;
        } finally {
            i=i++;//（把戏的重点：这样才是4
            return i;
        }

    }

    public static void main(String[] args) {
        System.out.println(JavaDemo.getValue());

    }
}
