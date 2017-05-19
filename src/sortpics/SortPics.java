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

        File sourcePath = null;
        sourcePath = new File("/Users/equilibrium/Desktop/8033772864888");

        //A list of all the files in our source path
        File listRoot[] = sourcePath.listFiles();
       
        int count = 0;
        //looping over all the files in our source path
        while (count < listRoot.length && listRoot[count].exists()) {
            
            //if a file IS a directory or its extension is .jpg do, else return
            if (listRoot[count].isDirectory() || listRoot[count].getName().substring(listRoot[count].getName().lastIndexOf(".")).equals(".jpg")) {

                //if the previous folder name is equal to the next file name without its extension MOVE, else return
                if (stripExtension(listRoot[count - 1].getName()).equals(stripExtension(listRoot[count].getName()))) {
                    System.out.println("ok");

                    try {

                        if (listRoot[count].renameTo(new File(listRoot[count - 1] + "/" + listRoot[count].getName()))) {
                            System.out.println("File is moved successfully!");
                        } else {
                            System.out.println("an error has occured");
                            return;
                        }

                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                } else {
                    System.out.println("not equal!");
                    return;
                }

            }
            count = count + 2;
        }
    }

    static String stripExtension(String str) {
        
        // Handle null case specially.
        if (str == null) {
            return null;
        }

        // Get position of last '.'.
        int pos = str.lastIndexOf(".");

        // If there wasn't any '.' just return the string as is.
        if (pos == -1) {
            return str;
        }

        // Otherwise return the string, up to the dot.
        return str.substring(0, pos);
    }

}
