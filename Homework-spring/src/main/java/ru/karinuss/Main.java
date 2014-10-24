package ru.karinuss;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by karina on 12.10.14.
 */
public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring.cfg.xml"});

        View view = context.getBean(View.class);
        DAO dao = view.businessLogic.getDao();
        dao.read("eee");
        dao.write("rewt");


    }
}
