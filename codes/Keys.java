//catching which key is pressed
import java.awt.*;
import java.awt.event.*;
class Keys extends Frame implements KeyListener
{
//vars
TextArea ta;
String msg="";

Keys()
{
//set flow layout manager
this.setLayout(new FlowLayout());
//create textarea
ta=new TextArea(5,25);

//add the text area to the frame
add(ta);


//add Key listener to the text area
ta.addKeyListener(this);
}//end of constructor

 
public void keyPressed(KeyEvent ke)
{
int keycode=ke.getKeyCode();
 msg+="\nKey Code:"+keycode;
String keyname=ke.getKeyText(keycode);
 msg+="\nKey pressed:"+keyname;
  ta.setText(msg);
  msg="";
}
public void keyTyped(KeyEvent ke)
{

}
public void keyReleased(KeyEvent ke)
{
int keycode=ke.getKeyCode();
 msg+="\nKey Code:"+keycode;
String keyname=ke.getKeyText(keycode);
 msg+="\nKey pressed:"+keyname;
  ta.setText(msg);
  msg="";
}


public static void main(String args[])
{
//create the frame
Keys k=new Keys();
k.setSize(400,400);
k.setTitle("Catch the key");
k.setVisible(true);

//set flow layout manager
k.setLayout(new FlowLayout());



//close the frame
k.addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent we)
{
System.exit(0);
}
});
}
}

