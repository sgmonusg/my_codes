import javax.swing.*;
import java.awt.*;
class Frame7 extends JFrame
{
JButton b1;
Frame7()
{
Container c=this.getContentPane();
c.setLayout(new FlowLayout());
ImageIcon  i= new ImageIcon("images.gif");
b1=new JButton("Submit",i);
b1.setBackground(Color.yellow);
b1.setForeground(Color.red);
b1.setFont(new Font("Arial",Font.BOLD,20));
b1.setToolTipText("This is button");
b1.setMnemonic('s');
c.add(b1);

}
public static void main(String []args)
{
Frame7 jf= new Frame7();
jf.setTitle("Display text");
jf.setSize(500,400);
jf.setVisible(true);
// close the application  upon clicking on close button of  frame
jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}