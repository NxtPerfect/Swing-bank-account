import java.awt.Frame;
import javax.swing.*;
import java.awt.BorderLayout;

public class Ui extends JFrame {
  public static void main(String[] args) {
    Ui u = new Ui();
  }

  public Ui() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(800, 600);
    setVisible(true);
    setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

    String balance = "100,000$";

    JPanel panel = new JPanel();

    JLabel welcome = new JLabel("Welcome to Bank Management System.", JLabel.CENTER);
    welcome.setAlignmentX(JLabel.CENTER_ALIGNMENT);
    JLabel yourBalance = new JLabel("Your bank balance is", JLabel.CENTER);
    yourBalance.setAlignmentX(JLabel.CENTER_ALIGNMENT);
    JLabel balanceLabel = new JLabel(balance, JLabel.CENTER);
    balanceLabel.setAlignmentX(JLabel.CENTER_ALIGNMENT);

    panel.add(Box.createVerticalGlue());
    panel.add(welcome);
    panel.add(Box.createVerticalGlue());
    panel.add(yourBalance);
    panel.add(Box.createVerticalGlue());
    panel.add(balanceLabel);
    panel.add(Box.createVerticalGlue());
    panel.setAlignmentX(JPanel.CENTER_ALIGNMENT);
    panel.setSize(700, 550);
    getContentPane().add(panel, JPanel.CENTER_ALIGNMENT);
    pack();
  }
}
