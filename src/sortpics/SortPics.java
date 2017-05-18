/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortpics;

import java.io.File;

/**
 *
 * @author equilibrium
 */
public class SortPics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        File sourcepath = null;
        sourcepath = new File("/Users/equilibrium/Desktop/8033772864888");

        //System.out.println(sourcepath);

        File listRoot[] = sourcepath.listFiles();

        //System.out.println(listRoot);
        int count = 0;
        while (count < listRoot.length && listRoot[count].exists()) {
            
            

            if (listRoot[count].isDirectory() || listRoot[count].getName().substring(listRoot[count].getName().lastIndexOf(".")).equals(".jpg")) {
                
                
                //if(listRoot[count].getName().equals(listRoot[count+1].getName().)
                
                System.out.println(listRoot[count]);
                
                
                System.out.println(stripExtension(listRoot[count].getName()));
                
                
                //System.out.println(listRoot[2].getName().substring(listRoot[2].getName().lastIndexOf(".")));
                
            }
            count = count + 2;
        }
    }
        
        static String stripExtension (String str) {
        // Handle null case specially.

        if (str == null) return null;

        // Get position of last '.'.

        int pos = str.lastIndexOf(".");

        // If there wasn't any '.' just return the string as is.

        if (pos == -1) return str;

        // Otherwise return the string, up to the dot.

        return str.substring(0, pos);
    }

    

}
