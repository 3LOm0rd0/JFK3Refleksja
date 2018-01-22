package org.jarexplorer;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

public class ClassLister {


    public static ArrayList<?> listFromJar(String args) throws Exception {
        String jarPath = args;
        System.out.println(jarPath);
        String className = "";
        File jarIoFile = new File(jarPath);
        ArrayList<Class<?>> classes = new ArrayList();

        if (!jarIoFile.exists())
            return null;

        JarFile jarFile = null;
        try {
            jarFile = new JarFile(jarPath);
            System.out.println(jarPath);
            Enumeration<JarEntry> entries = jarFile.entries();
            System.out.println(jarPath);
            URL[] urls = {new URL("jar:file:" + jarPath + "!/")};
            URLClassLoader cl = URLClassLoader.newInstance(urls);


            while (entries.hasMoreElements()) {
                JarEntry je = entries.nextElement();
                if (je.isDirectory() || !je.getName().endsWith(".class")) {
                    continue;
                }

                className = je.getName().substring(0, je.getName().length() - 6);
                className = className.replace('/', '.');
                try {
                    Class<?> c = cl.loadClass(className);
                    if (!c.isAnnotationPresent(jfk.prism.Description.class))
                        continue;
                    if (!jfk.prism.ICallable.class.isAssignableFrom(c))
                        continue;

                    classes.add(c);

                } catch (ClassNotFoundException exp) {
                    continue;
                }

            }
        } catch (IOException exp) {
            System.out.println("Złapany");
        } finally {
            if (null != jarFile)
                jarFile.close();
        }
        return classes;
    }
}
