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
       
        return ClassLister.listFromJar(jarName);


}
}
