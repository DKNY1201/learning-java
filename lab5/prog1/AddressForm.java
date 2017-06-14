package lab5.prog1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class AddressForm extends JFrame {
  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  JPanel topPanel;
  JPanel midPanel;
  JPanel botPanel;
  
  JPanel namePanel;
  JPanel streetPanel;
  JPanel cityPanel;
  JPanel statePanel;
  JPanel zipPanel;
  
  JTextField nameTextField;
  JTextField streetTextField;
  JTextField cityTextField;
  JTextField stateTextField;
  JTextField zipTextField;
  
  JButton btn;
  
  AddressForm() {
    initializeWindow();
    JPanel mainPanel = new JPanel();
    mainPanel.setLayout(new BorderLayout());
    
    createTopPanel();
    createMidPanel();
    createBotPanel();
    
    mainPanel.add(topPanel, BorderLayout.NORTH);
    mainPanel.add(midPanel, BorderLayout.CENTER);
    mainPanel.add(botPanel, BorderLayout.SOUTH);
    
    getContentPane().add(mainPanel);
    pack();
    
    btn.addActionListener(new SubmitButtonListener());
  }
  
  private void createTopPanel() {
    topPanel = new JPanel();
    topPanel.setLayout(new FlowLayout());
    
    createNamePanel();
    createStreetPanel();
    createCityPanel();
    
    topPanel.add(namePanel);
    topPanel.add(streetPanel);
    topPanel.add(cityPanel);
  }
  
  private void createMidPanel() {
    midPanel = new JPanel();
    midPanel.setLayout(new FlowLayout());
    
    createStatePanel();
    createZipPanel();
    
    midPanel.add(statePanel);
    midPanel.add(zipPanel);
  }
  
  private void createBotPanel() {
    botPanel = new JPanel();
    botPanel.setLayout(new FlowLayout());
    
    btn = new JButton("Submit");
    
    botPanel.add(btn);
  }
  
  // General function for Create new panel
  // @input: label
//  private JPanel createPanel(String label) {
//    JPanel textPanel = new JPanel();
//    textPanel.setLayout(new BorderLayout());
//    
//    JTextField jTextField = new JTextField(10);
//    JLabel jlabel = new JLabel(label);
//    
//    textPanel.add(jTextField, BorderLayout.NORTH);
//    textPanel.add(jlabel, BorderLayout.CENTER);
//    
//    return textPanel; 
//  }
  
  private void createNamePanel() {
    namePanel = new JPanel();
    namePanel.setLayout(new BorderLayout());
    
    nameTextField = new JTextField(10);
    JLabel jlabel = new JLabel("Name");
    
    namePanel.add(nameTextField, BorderLayout.NORTH);
    namePanel.add(jlabel, BorderLayout.CENTER);
  }
  
  private void createStreetPanel() {
    streetPanel = new JPanel();
    streetPanel.setLayout(new BorderLayout());
    
    streetTextField = new JTextField(10);
    JLabel jlabel = new JLabel("Street");
    
    streetPanel.add(streetTextField, BorderLayout.NORTH);
    streetPanel.add(jlabel, BorderLayout.CENTER);
  }
  
  private void createCityPanel() {
    cityPanel = new JPanel();
    cityPanel.setLayout(new BorderLayout());
    
    cityTextField = new JTextField(10);
    JLabel jlabel = new JLabel("City");
    
    cityPanel.add(cityTextField, BorderLayout.NORTH);
    cityPanel.add(jlabel, BorderLayout.CENTER);
  }
  
  private void createStatePanel() {
    statePanel = new JPanel();
    statePanel.setLayout(new BorderLayout());
    
    stateTextField = new JTextField(10);
    JLabel jlabel = new JLabel("State");
    
    statePanel.add(stateTextField, BorderLayout.NORTH);
    statePanel.add(jlabel, BorderLayout.CENTER);
  }
  
  private void createZipPanel() {
    zipPanel = new JPanel();
    zipPanel.setLayout(new BorderLayout());
    
    zipTextField = new JTextField(10);
    JLabel jlabel = new JLabel("Zip");
    
    zipPanel.add(zipTextField, BorderLayout.NORTH);
    zipPanel.add(jlabel, BorderLayout.CENTER);
  }
  
  public void initializeWindow() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Address From");
//    setSize(620, 440);
    Utils.centerFrameOnDesktop(this);
  }
  
  public static void main(String[] args) {
    AddressForm addForm = new AddressForm();
    addForm.setVisible(true);
  }
  
  class SubmitButtonListener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
      // TODO Auto-generated method stub
      String lineSeparator = System.lineSeparator();
      StringBuilder sb = new StringBuilder();
      sb.append(nameTextField.getText()).append(lineSeparator);
      sb.append(streetTextField.getText()).append(lineSeparator);
      sb.append(cityTextField.getText()).append(", ").append(stateTextField.getText()).append(" ").append(zipTextField.getText());
      System.out.println(sb.toString());
    }
    
  }
}
