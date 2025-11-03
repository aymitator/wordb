
package org.coreyh.wordbcheat;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CheatWindow extends JPanel implements ActionListener {
public JFrame win;
public JButton btn,btnii;
public JLabel lbl1,lblii,lbliii;
public JTextField t1,tii,tiii;

public CheatWindow() {
win = new JFrame("word adder");
win.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
GridLayout gl =
  new GridLayout(4,2);
setLayout(gl);
btn = new JButton("Submit");
btn.addActionListener(this);
btnii =
  new JButton("Clear");
btnii.addActionListener(this);
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
add(btnii);
win.setContentPane(this);
win.pack();
win.setSize(new
  Dimension(
    680, 380));
win.setVisible(true);
}
public static void out(String _s) {
System.out.println(_s);
}
public void actionPerformed(ActionEvent _e) {
if(((JButton)_e.getSource()).equals(btnii)) {
t1.setText("");
tii.setText("");
tiii.setText("");
}
else {
out("perl data-add " +
t1.getText() + 
" " +
tii.getText() +
" " +
tiii.getText());
}
}
public static void main(String[] args) {
try{
  for(UIManager.LookAndFeelInfo i : 
    UIManager.getInstalledLookAndFeels()) {
if("Nimbus".equals(i.getName())){
UIManager.setLookAndFeel(i.getClassName());break;
}
  }
}catch (Exception _ez){}

CheatWindow trans = new CheatWindow();
}
}
