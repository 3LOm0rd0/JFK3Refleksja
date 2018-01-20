package org.jarexplorer;

import org.jarexplorer.CenteredDialog;

import java.awt.*;
import java.io.IOException;


/**
 * Displays Image
 */
public class ImageDialog extends CenteredDialog
{
	private static final long serialVersionUID = -3946124923628216221L;

	/**
     * Creates a dialog, and reads a resource in the process.
     *
     * @param owner        - top level window
     * @param jarFileName  - name of jar file
     * @param resourceName - internal path to resource
     * @throws java.io.IOException - thrown in case there is a problem reading the resource.
     */
    public ImageDialog(Frame owner, String jarFileName, String resourceName) throws IOException
    {
        super(owner, jarFileName + ":" + resourceName, false);
    }
}
