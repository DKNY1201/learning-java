package lab5.prog1;

import java.awt.*;
import javax.swing.*;

public class MyClass extends JFrame {
  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  
  JTextField text;
  JLabel label;
  
  MyClass() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    setTitle("Hello World");
    setSize(320,240);
//    setResizable(false);
    
    JPanel mainPanel = new JPanel();
    mainPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
//    mainPanel.setLayout(new BorderLayout());
    text = new JTextField(20);
    label = new JLabel("My Text");
    JButton button = new JButton("My Button");
    mainPanel.add(text, BorderLayout.SOUTH);
    mainPanel.add(label); 
    mainPanel.add(button);
    getContentPane().add(mainPanel);
    
//    pack();
    centerFrameOnDesktop(this);
  }
  
  public static void centerFrameOnDesktop(Component f) {
    Toolkit toolkit = Toolkit.getDefaultToolkit(); 
    int height = toolkit.getScreenSize().height; 
    int width = toolkit.getScreenSize().width; 
    int frameHeight = f.getSize().height;
    int frameWidth = f.getSize().width; 
    f.setLocation(((width-frameWidth)/2), (height-frameHeight)/3);
  }
  
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {

      @Override
      public void run() {
        // TODO Auto-generated method stub
        MyClass mc = new MyClass();
        mc.setVisible(true);
      }
      
    });
  }
}
