package com.example.maven.hibernate;

import org.hibernate.Session;

//main class
public class App
{
    public static void main( String[] args )
    {
        System.out.println("Maven + Hibernate + MySQL");
        Session session = HibernateUtil.getSessionFactory().openSession();
 
        session.beginTransaction();
        Stock stock = new Stock();

        stock.setStockCode("4718");
        stock.setStockName("GENl");

        session.save(stock);
        session.getTransaction().commit();
    }
}