package org.Beans_Test;
import  org.springframework.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import beans.*;
public class Main {
    public static void main(String[] args) {
        ApplicationContext container  = new ClassPathXmlApplicationContext("beans.xml");
        performer p = (performer) container.getBean("poetic_juggler");
        p.perform();

        System.out.println("Performer 2 : ");
        performer p2 = (performer) container.getBean("musician");
        p2.perform();

        System.out.println("Performer 3 : ");

//        ############USES PRIVATE OBJECT OR BEAN TO PERFORM (INNER BEAN) ######################
        performer p3 = (performer) container.getBean("musician_with_private_instrument");
        p3.perform();
    }
}