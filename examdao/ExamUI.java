import javax.swing.*;
pubic class ExamUI extends JFrame
 {
   JFrame frame;
   JTextField field1,field2;
   JLabel label1,label2;    
 ExamUI() 
 { 
   frame=new JFrame() 
   field1=new JTextField(10);
   field2=new JTextField(10);
    label1=new JLabel("testcode");
    label2=new JLabel("batchcode");
   JButton btn=new JButton("submit");
   JPanel panel=new JPanel();
   frame.add(panel);
  panel.add(label1);
  panel.add(field1);
  panel.add(label2);
  panel.add(field2);
  frame.setSize(300,400);
  frame.setVisible(true);

 } 
   
    public static void main(String args[] ) 
 { 
    
 }   
 } 