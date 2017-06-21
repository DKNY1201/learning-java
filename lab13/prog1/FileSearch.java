package lab13.prog1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.plaf.FileChooserUI;

/**
 * //PSEUDO-CODE boolean searchForFile(Object file, Object startDir) { Object[]
 * fileSystemObjects = startDir.getContents(); for(Object o: fileSystemObjects)
 * { //base case if(isFile(o) && isSameFile(o,f)) { return true; }
 * 
 * if(isDirectory(o)) { searchForFile(file, o); } } //file not found in startDir
 * return false; }
 */
public class FileSearch {
  static boolean found = false;
  // Store the text that is found in the
  // file that is found in this String variable
  static String discoveredText = "";

  public static boolean searchForFile(String filename, String startDir) {
    File dir = new File(startDir);
    File[] fileSystemObjects = dir.listFiles();

    for (File f : fileSystemObjects) {
      if (f.isFile() && f.getName().equals(filename)) {
        found = true;
        try {
          FileReader reader = new FileReader(f);
          BufferedReader bufreader = new BufferedReader(reader);
          String line = null;
          while ((line = bufreader.readLine()) != null) {
            discoveredText += line;
          }
          bufreader.close();
          reader.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
        break;
      }

      if (f.isDirectory()) {
        searchForFile(filename, f.getAbsolutePath());
      }
    }
    if (!found) {
      return false;
    } else {
      return true;
    }

  }

}
