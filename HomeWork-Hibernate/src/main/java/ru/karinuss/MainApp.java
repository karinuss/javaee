package ru.karinuss;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Iterator;
import java.util.List;


/**
 * Created by karina on 03.10.14.
 */

//todo add hibernate config
public class MainApp {

    static private SessionFactory sessionFactory;

    private void setUpConnection() {
        sessionFactory = new Configuration().configure().buildSessionFactory();
    }

    public static void main(String[] args) {

        MainApp app = new MainApp();
        app.setUpConnection();

        app.add("Kolkata, Gurgaon 48");
        app.add("Chennai, Chepokkam 1");

        app.show();
    }

    public void add(String address) {

        // open transaction
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();

        BusinessCenter bc = new BusinessCenter(address);
        //session.save(bc);

        VendingMachine vm1 = new VendingMachine("chai");
        vm1.setBusinessCenter(bc);

        VendingMachine vm2 = new VendingMachine("puri");
        vm2.setBusinessCenter(bc);

        session.save(vm1);
        session.save(vm2);

        // close transaction
        session.getTransaction().commit();
    }

    //todo
    /*
    public void remove(BusinessCenter bc) {

        // open transaction
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();

       // close transaction
        session.getTransaction().commit();
    }
*/
    public void show() {

        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();

        Criteria criteria = session.createCriteria(BusinessCenter.class);

        List<BusinessCenter> listBC = criteria.list();

        for (BusinessCenter bc : listBC) {
            System.out.println(bc);
            List<VendingMachine> listVM = bc.getListMachines();

            for (VendingMachine aListVM : listVM) {
                System.out.println(aListVM);
            }
        }

        session.getTransaction().commit();
    }
}
