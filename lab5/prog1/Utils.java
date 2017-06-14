package lab5.prog1;

import java.awt.*;
import javax.swing.*;

public class Utils {
  public static void centerFrameOnDesktop(Component f) {
    Toolkit toolkit = Toolkit.getDefaultToolkit(); 
    int height = toolkit.getScreenSize().height; 
    int width = toolkit.getScreenSize().width; 
    int frameHeight = f.getSize().height;
    int frameWidth = f.getSize().width; 
    f.setLocation(((width-frameWidth)/2), (height-frameHeight)/3);
  }
}
