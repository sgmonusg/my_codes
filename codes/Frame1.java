import java.awt.*;
import java.awt.event.*;
class Frame1 extends Frame implements ActionListener{
Button b1,b2;
Label l1,l2,l3;
TextField t1,t2,t3;
Frame1()
{
//do not set any layout
this.setLayout(new FlowLayout());
l1=new Label("Employee id");
t1=new TextField();
l2=new Label("Employee name");
t2=new TextField();
l3=new Label("Employee sal");
t3=new TextField();

//create push buttons
b1=new Button("Submit ");
b2=new Button("close");

//add the buttons to the frame
this.add(l1);
this.add(t1);
this.add(l2);
this.add(t2);
this.add(l3);
this.add(t3);
this.add(b1);
this.add(b2);
//add ActionListener to the buttons
b1.addActionListener(this);
b2.addActionListener(this);
}
//this button is called when a button is clicked
public void actionPerformed(ActionEvent ae)
{

//to know the button clicked by user
if(ae.getSource()==b1) {
EmpFrame f2=new EmpFrame(Integer.parseInt(t1.getText()),t2.getText(),Integer.parseInt(t3.getText()));
f2.setSize(400,400);
f2.setVisible(true);
}
else{
System.exit(0);
}
}
public static void main(String ...args){
//create a frame
Frame1 f1=new Frame1();
//set the size of the frame
f1.setSize(300,250);
f1.setTitle("My First Frame");
//display the frame
f1.setVisible(true);
}
}