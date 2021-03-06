package com.ixeet.idonyte.persistance.factory;


import java.util.logging.Level;
import java.util.logging.Logger;


//Local running setup
public class AppDaoFactory{

    
    public static Object getDAO(Class daoImplClassName)
            throws Exception {

        Object obj = null;

        String implClassName = "com.scolere.idonyte.persistance.dao.impl." + daoImplClassName.getSimpleName() + "Impl";

        // obj=Class.forName(implClassName).newInstance();

        Class clazz = Class.forName(implClassName);
        System.out.println(">>>>>" + clazz);

        return (Object) clazz.newInstance();
    }

    
    //test
    public static void main(String[] arg) {
        try {


        } catch (Exception ex) {
            Logger.getLogger(AppDaoFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}