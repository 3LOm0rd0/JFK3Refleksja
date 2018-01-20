package org.jarexplorer;

import java.util.*;

/**
 * Brute force index of jar file entries.
 */
public class EntryIndex
{

    private HashMap<String, ClassInformation> indexMap = new HashMap<String, ClassInformation>();


    /**
     * Get all the classes in a given jar alphabetically sorted.
     *
     * @param jarName The Jar for which to return all the classes.
     * @return  List of {@link ClassInformation} instances.
     */
    public ArrayList<?> getClassesInJar ( String jarName ) throws Exception {
        ClassLister.listFromJar(jarName);
        //Prism prism=new Prism();
        //prism.prism(jarName);
        return ClassLister.listFromJar(jarName);


        /*
        Iterator<ClassInformation> values = indexMap.values().iterator();
        ArrayList<ClassHolder> results  = new ArrayList<ClassHolder>();

        while (values.hasNext())
        {
            ClassInformation classInfo = (ClassInformation)values.next();
            if ( classInfo.getJarFileName().equals(jarName) ) {

                results.add(classInfo);
            }
        }
        Collections.sort(results, new Comparator<Object>()
        {
            public int compare(Object o1, Object o2)
            {
                return o1.toString().compareTo(o2.toString());
            }
        });*/
}
}
