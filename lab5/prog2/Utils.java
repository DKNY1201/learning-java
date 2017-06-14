package lab5.prog2;

import java.awt.*;
import javax.swing.*;

public class Utils {
  public static void centerFrameOnDesktop(Component f) {
    Toolkit toolkit = Toolkit.getDefaultToolkit();
    int height = toolkit.getScreenSize().height;
    int width = toolkit.getScreenSize().width;
    int frameHeight = f.getSize().height;
    int frameWidth = f.getSize().width;
    f.setLocation(((width - frameWidth) / 2), (height - frameHeight) / 3);
  }

  public static String removeDuplicateString(String input) {
    char[] charArr = input.toCharArray();
    int len = charArr.length;

    StringBuilder sb = new StringBuilder();
    sb.append(charArr[0]);
    for (int i = 1; i < len; i++) {
      boolean isDup = false;
      for (int j = 0; j < i; j++) {
        if (charArr[i] == charArr[j]) {
          isDup = true;
        }
      }
      if (!isDup) {
        sb.append(",").append(charArr[i]);
      }
    }

    String result = sb.toString();
    String[] resultArr = result.split(",");
    StringBuilder finalResult = new StringBuilder();

    for (String s : resultArr) {
      finalResult.append(s);
    }
    
    return finalResult.toString();
  }
}
