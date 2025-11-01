
package org.coreyh.wordbcheat;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CheatWindow extends JPanel implements ActionListener {
public JFrame win;
public JButton btn;
public CheatWindow() {
win = new JFrame("Wordb Cheat Window");
win.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
btn = new JButton("Add words! Add words to HHH static generator! Use HHH static generator! Add words to dynamic web! Use dynamic web!");
btn.addActionListener(this);
add(btn);
win.setContentPane(this);
win.pack();
win.setVisible(true);
}
public static void out(String _s) {
System.out.println(_s);
}
public void actionPerformed(ActionEvent _e) {
out("(1)");
out("ADD WORDS BY EDITING \"DATA\" ALONG STRING EDITOR");
out("Run \"ayncert-data--hhh\" to add \"daata\" to HHH static generator");
out("Use HHH static generator by running \"hhh-gen-html,php\"");
out("or:");
out("Run \"ayncet-data--html\" to add \"data\" to dynamic web out");
out("Double-click \"html-dyanimic-web,html\" to see your words");
}
public static void main(String[] args) {
CheatWindow trans = new CheatWindow();
}
}
