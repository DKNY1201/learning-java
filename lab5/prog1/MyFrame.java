package lab5.prog1;

import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame{
  /**
   * 
   */
  private static final long serialVersionUID = 6084117736655558772L;
  
  JPanel tPanel;
  JPanel topPanel;
  JPanel mPanel;
  JTextField textField;
  JButton btn;
  
  MyFrame() {
    initializeWindow();
 
    JPanel mainPanel = new JPanel();
    mainPanel.setLayout(new BorderLayout());
    
    createTopPanel();
    createMiddlePanel();
    
    JTextField tf = new JTextField();
    
    mainPanel.add(topPanel, BorderLayout.NORTH);
    mainPanel.add(mPanel, BorderLayout.CENTER);
//    mainPanel.add(tf, BorderLayout.NORTH);
    
    getContentPane().add(mainPanel);
    
    //Inside MyFrame, register your new
    //listener class when the button is defined
    //because our text field is stored as an instance variable
    //we can pass it in to the listener like this: 
    btn.addActionListener(new MyButtonListener(textField));
  }
  
  private void createTopPanel() {
    topPanel = new JPanel();
    topPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
    createTextPanel();
    topPanel.add(tPanel);
  }
  
  private void createTextPanel() {
    textField = new JTextField(10);
    JLabel label = new JLabel("Text");
//    label.setFont(makeSmallFont(label.getFont()));
    
    tPanel = new JPanel(new BorderLayout());
    tPanel.add(textField, BorderLayout.NORTH);
    tPanel.add(label, BorderLayout.CENTER);
  }
  
  private void createMiddlePanel() {
    mPanel = new JPanel();
    mPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
    
    btn = new JButton("My Button");
    mPanel.add(btn);
  }
  
  public static void main(String[] args) {
    MyFrame mf = new MyFrame();
    mf.setVisible(true);
  }
  
  public void initializeWindow() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Ahihi");
    setSize(320, 240);
    Utils.centerFrameOnDesktop(this);
    setResizable(false);
  }
}
