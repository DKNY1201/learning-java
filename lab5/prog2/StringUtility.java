package lab5.prog2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class StringUtility extends JFrame {
  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  JPanel leftPanel;
  JPanel rightPanel;
  
  JPanel inputPanel;
  JPanel outputPanel;
  
  JTextField inputTextField;
  JTextField outputTextField;
  
  JButton countBtn;
  JButton reverseBtn;
  JButton removeDupBtn;
  
  StringUtility() {
    initializeWindow();
    JPanel mainPanel = new JPanel();
    mainPanel.setLayout(new BorderLayout());
    
    createLeftPanel();
    createRightPanel();
    
    mainPanel.add(leftPanel, BorderLayout.WEST);
    mainPanel.add(rightPanel, BorderLayout.EAST);
    
    getContentPane().add(mainPanel);
    pack();
    
    countBtn.addActionListener(new ButtonListener());
    reverseBtn.addActionListener(new ButtonListener());
    removeDupBtn.addActionListener(new ButtonListener());
  }
  
  private void createLeftPanel() {
    leftPanel = new JPanel();
    leftPanel.setLayout(new BorderLayout());

    countBtn = new JButton("Count Letters");
    reverseBtn = new JButton("Reverse Letters");
    removeDupBtn = new JButton("Remove Duplicate");
    leftPanel.add(countBtn, BorderLayout.NORTH);
    leftPanel.add(reverseBtn, BorderLayout.CENTER);
    leftPanel.add(removeDupBtn, BorderLayout.SOUTH);
  }
  
  private void createRightPanel() {
    rightPanel = new JPanel();
    rightPanel.setLayout(new BorderLayout());
    
    createInputPanel();
    createOutputPanel();
    
    rightPanel.add(inputPanel, BorderLayout.NORTH);
    rightPanel.add(outputPanel, BorderLayout.SOUTH);
  }
  
  private void createInputPanel() {
    inputPanel = new JPanel();
    inputPanel.setLayout(new BorderLayout());
    
    inputTextField = new JTextField(10);
    JLabel jlabel = new JLabel("Input");
    
    inputPanel.add(inputTextField, BorderLayout.NORTH);
    inputPanel.add(jlabel, BorderLayout.CENTER);
  }
  
  private void createOutputPanel() {
    outputPanel = new JPanel();
    outputPanel.setLayout(new BorderLayout());
    
    outputTextField = new JTextField(10);
    JLabel jlabel = new JLabel("Output");
    
    outputPanel.add(outputTextField, BorderLayout.NORTH);
    outputPanel.add(jlabel, BorderLayout.CENTER);
  }
  
  public void initializeWindow() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("String Utility");
//    setSize(620, 440);
    Utils.centerFrameOnDesktop(this);
  }
  
  public static void main(String[] args) {
    StringUtility addForm = new StringUtility();
    addForm.setVisible(true);
  }
  
  class ButtonListener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
      String input = inputTextField.getText();
      if (e.getActionCommand().equals("Count Letters")) {
        outputTextField.setText(Integer.toString(input.length()));
      } 
      
      if (e.getActionCommand().equals("Reverse Letters")) {
        StringBuilder sb = new StringBuilder(input);
        outputTextField.setText(sb.reverse().toString());
      }
      
      if (e.getActionCommand().equals("Remove Duplicate")) {
        outputTextField.setText(Utils.removeDuplicateString(input));
      }
    }
    
  }
}
