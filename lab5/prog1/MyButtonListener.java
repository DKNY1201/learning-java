package lab5.prog1;

import java.awt.event.*;
import javax.swing.*;

//define the listener class
public class MyButtonListener implements ActionListener {
  // the text field we are listening to private 
  JTextField text;
  public MyButtonListener(JTextField text) {
    this.text = text;
  }

  public void actionPerformed(ActionEvent evt) {
    String textVal = text.getText();
    final String prompt = "Type a string";
    final String youWrote = "You wrote: ";
    if (textVal.equals("") || textVal.equals(prompt) || textVal.startsWith(youWrote)) {
      text.setText(prompt);
    } else {
      text.setText(youWrote + "\"" + textVal + "\".");
    }
  }
}
