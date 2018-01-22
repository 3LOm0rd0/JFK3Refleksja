package org.jarexplorer;


import jfk.prism.*;
import org.jarexplorer.ClassHolder;

import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;
import java.util.jar.*;

public class Prism {
    private static String descript;
    private static ICallable call;

    public static ClassHolder prism(Class<?> c) throws Exception {


        jfk.prism.Description description = (jfk.prism.Description) c.getAnnotation(jfk.prism.Description.class);
        System.out.println(description.description());



        ICallable callable = (ICallable) c.newInstance();
        if (null == callable)
            return null;


        return new ClassHolder(callable, description, c.getName());



    }

}

