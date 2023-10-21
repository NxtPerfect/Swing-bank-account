import java.awt.Frame;
import javax.swing.*;

public class Ui extends JFrame {
  public static void main(String[] args) {
    Ui u = new Ui();
  }

  public Ui() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(800, 600);
    setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

    String balance = "100,000$";

    JLabel welcome = new JLabel("Welcome to Bank Management System.");
    JLabel yourBalance = new JLabel("Your bank balance is");
    JLabel balanceLabel = new JLabel(balance);

    add(welcome);
    add(yourBalance);
    add(balanceLabel);
    pack();
    setVisible(true);
  }
}
