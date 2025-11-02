
package org.coreyh.wordbcheat;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CheatWindow extends JPanel implements ActionListener {
public JFrame win;
public JButton btn;
public JLabel lbl1,lblii,lbliii;
public JTextField t1,tii,tiii;
public CheatWindow() {
win = new JFrame("Wordb Cheat Window");
win.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
GridLayout gl =
  new GridLayout(7,1);
setLayout(gl);
btn = new JButton("Submit");
btn.addActionListener(this);
t1 = new JTextField();
tii = new JTextField();
tiii = new JTextField();
add(new JLabel("idea0:"));
add(t1);
add(new JLabel("ideai:"));
add(tii);
add(new JLabel("ideaii:"));
add(tiii);
add(btn);
setSize(new Dimension(500,500));
win.setContentPane(this);
win.pack();
win.setVisible(true);
}
public static void out(String _s) {
System.out.println(_s);
}
public void actionPerformed(ActionEvent _e) {
out("perl data-add " +
t1.getText() + 
" " +
tii.getText() +
" " +
tiii.getText());
}
public static void main(String[] args) {
CheatWindow trans = new CheatWindow();
}
}
