import  javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame implements ActionListener {
    double a=0,b=0,ans=0;
    boolean num1=false,num2=false;
    char operator;
    ImageIcon ic;
    JFrame frame;
    JTextField text;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18;
    JPanel panel2;
    public MyFrame(){
        //ICON
        ic=new ImageIcon("logo.png");

        //FRAME
        frame=new JFrame();
        frame.setVisible(true);
        frame.setSize(600,600);
        frame.setIconImage(ic.getImage());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.darkGray);
        frame.setTitle("Calculator");

        //TEXT FIELD
        text=new JTextField();
        text.setVisible(true);
        text.setBounds(40,50,500,80);
        text.setBackground(Color.BLACK);
        text.setFont(new Font("ARIAL",Font.BOLD,14));
        text.setForeground(Color.green);
        text.setEditable(false);

        //BUTTONS
        b1=new JButton();
        b1.setText("1");
        b1.setFocusable(false);
        b1.setFont(new Font("INK FREE",Font.BOLD,14));
        b1.addActionListener(this);

        b2=new JButton();
        b2.setText("2");
        b2.setFocusable(false);
        b2.setFont(new Font("INK FREE",Font.BOLD,14));
        b2.addActionListener(this);

        b3=new JButton();
        b3.setText("3");
        b3.setFocusable(false);
        b3.setFont(new Font("INK FREE",Font.BOLD,14));
        b3.addActionListener(this);

        b4=new JButton();
        b4.setText("4");
        b4.setFocusable(false);
        b4.setFont(new Font("INK FREE",Font.BOLD,14));
        b4.addActionListener(this);

        b5=new JButton();
        b5.setText("5");
        b5.setFocusable(false);
        b5.setFont(new Font("INK FREE",Font.BOLD,14));
        b5.addActionListener(this);

        b6=new JButton();
        b6.setText("6");
        b6.setFocusable(false);
        b6.setFont(new Font("INK FREE",Font.BOLD,14));
        b6.addActionListener(this);

        b7=new JButton();
        b7.setText("7");
        b7.setFocusable(false);
        b7.setFont(new Font("INK FREE",Font.BOLD,14));
        b7.addActionListener(this);

        b8=new JButton();
        b8.setText("8");
        b8.setFocusable(false);
        b8.setFont(new Font("INK FREE",Font.BOLD,14));
        b8.addActionListener(this);

        b9=new JButton();
        b9.setText("9");
        b9.setFocusable(false);
        b9.setFont(new Font("INK FREE",Font.BOLD,14));
        b9.addActionListener(this);

        b10=new JButton();
        b10.setText("+");
        b10.setBackground(new Color(0xB9E1A2));
        b10.setFocusable(false);
        b10.setFont(new Font("INK FREE",Font.BOLD,14));
        b10.addActionListener(this);

        b11=new JButton();
        b11.setText("-");
        b11.setBackground(new Color(0xB9E1A2));
        b11.setFocusable(false);
        b11.setFont(new Font("INK FREE",Font.BOLD,14));
        b11.addActionListener(this);

        b12=new JButton();
        b12.setText("x");
        b12.setBackground(new Color(0xB9E1A2));
        b12.setFocusable(false);
        b12.setFont(new Font("INK FREE",Font.BOLD,14));
        b12.addActionListener(this);

        b13=new JButton();
        b13.setText("/");
        b13.setBackground(new Color(0xB9E1A2));
        b13.setFocusable(false);
        b13.setFont(new Font("INK FREE",Font.BOLD,14));
        b13.addActionListener(this);

        b14=new JButton();
        b14.setText("=");
        b14.setBackground(Color.LIGHT_GRAY);
        b14.setPreferredSize(new Dimension(100,100));
        b14.setFocusable(false);
        b14.setFont(new Font("ARIAL",Font.BOLD,18));
        b14.addActionListener(this);

        b15=new JButton();
        b15.setText("DEL");
        b15.setBackground(Color.cyan);
        b15.setFocusable(false);
        b15.setFont(new Font("ARIAL",Font.BOLD,14));
        b15.addActionListener(this);

        b16=new JButton();
        b16.setText("CLR");
        b16.setBackground(Color.cyan);
        b16.setFocusable(false);
        b16.setFont(new Font("ARIAL",Font.BOLD,14));
        b16.addActionListener(this);

        b17=new JButton();
        b17.setText("NEG(-)");
        b17.setBackground(new Color(0x8484DC));
        b17.setFocusable(false);
        b17.setFont(new Font("ARIAL",Font.BOLD,14));
        b17.addActionListener(this);

        b18=new JButton();
        b18.setText(".");
        b18.setBackground(new Color(0xB9E1A2));
        b18.setFocusable(false);
        b18.setFont(new Font("INK FREE",Font.BOLD,14));
        b18.addActionListener(this);

        panel2=new JPanel();
        panel2.setBackground(Color.darkGray);
        panel2.setBounds(40,160,500,370);
        panel2.setLayout(new GridLayout(5,3,10,10));
        panel2.add(b1);
        panel2.add(b2);
        panel2.add(b3);
        panel2.add(b4);
        panel2.add(b5);
        panel2.add(b6);
        panel2.add(b7);
        panel2.add(b8);
        panel2.add(b9);
        panel2.add(b10);
        panel2.add(b11);
        panel2.add(b12);
        panel2.add(b13);
        panel2.add(b14);
        panel2.add(b15);
        panel2.add(b16);
        panel2.add(b17);
        panel2.add(b18);

        frame.add(panel2);

        //add the text field
        frame.add(text);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        //number buttons
        if(e.getSource()==b1){
            text.setText(text.getText()+"1");
        }
        if(e.getSource()==b2){
            text.setText(text.getText()+"2");
        }
        if(e.getSource()==b3){
            text.setText(text.getText()+"3");
        }
        if(e.getSource()==b4){
            text.setText(text.getText()+"4");
        }
        if(e.getSource()==b5){
            text.setText(text.getText()+"5");
        }
        if(e.getSource()==b6){
            text.setText(text.getText()+"6");
        }
        if(e.getSource()==b7){
            text.setText(text.getText()+"7");
        }
        if(e.getSource()==b8){
            text.setText(text.getText()+"8");
        }
        if(e.getSource()==b9){
            text.setText(text.getText()+"9");
        }



        //delete button
        if(e.getSource()==b15){
            String s=text.getText();
            text.setText("");
            for(int i=0;i<s.length()-1;i++){
                text.setText(text.getText()+s.charAt(i));
            }
        }
        //clear button
        if(e.getSource()==b16){
            num1=num2=false;
            text.setText("");
            a=b=ans=0;
            b1.setEnabled(true);
            b2.setEnabled(true);
            b3.setEnabled(true);
            b4.setEnabled(true);
            b5.setEnabled(true);
            b6.setEnabled(true);
            b7.setEnabled(true);
            b8.setEnabled(true);
            b9.setEnabled(true);
            b10.setEnabled(true);
            b11.setEnabled(true);
            b12.setEnabled(true);
            b13.setEnabled(true);
            b14.setEnabled(true);
            b15.setEnabled(true);
            b17.setEnabled(true);
            b18.setEnabled(true);
        }

        //decimal(.) button
        if(e.getSource()==b18){

            boolean dec=false;
            String s=text.getText();
            if(s.length()==0){
                text.setText("0"+".");
            }
            else{
                for(int i=0;i<s.length();i++){
                    if(s.charAt(i)=='.'){
                        dec=true;
                        break;
                    }
                }
                if(!dec) {
                    text.setText(text.getText() + ".");
                }
            }
        }

        //'+'  operator
        if(e.getSource()==b10){
            if(text.getText().isEmpty()){
                text.setText("Invalid! Press Clr to to reset");
                b1.setEnabled(false);
                b2.setEnabled(false);
                b3.setEnabled(false);
                b4.setEnabled(false);
                b5.setEnabled(false);
                b6.setEnabled(false);
                b7.setEnabled(false);
                b8.setEnabled(false);
                b9.setEnabled(false);
                b10.setEnabled(false);
                b11.setEnabled(false);
                b12.setEnabled(false);
                b13.setEnabled(false);
                b14.setEnabled(false);
                b15.setEnabled(false);
                b17.setEnabled(false);
                b18.setEnabled(false);
            }
            else{
                a=Double.parseDouble(text.getText()); //0.526
                num1=true;
                num2=false;
                operator='+';
                text.setText("");
            }
        }
        //'-'  operator
        if(e.getSource()==b11){
            if(text.getText().isEmpty()){
                text.setText("Invalid! Press Clr to to reset");
                b1.setEnabled(false);
                b2.setEnabled(false);
                b3.setEnabled(false);
                b4.setEnabled(false);
                b5.setEnabled(false);
                b6.setEnabled(false);
                b7.setEnabled(false);
                b8.setEnabled(false);
                b9.setEnabled(false);
                b10.setEnabled(false);
                b11.setEnabled(false);
                b12.setEnabled(false);
                b13.setEnabled(false);
                b14.setEnabled(false);
                b15.setEnabled(false);
                b17.setEnabled(false);
                b18.setEnabled(false);
            }
            else{
                a=Double.parseDouble(text.getText()); //0.526
                num1=true;
                num2=false;
                operator='-';
                text.setText("");
            }
        }
        //'*'  operator
        if(e.getSource()==b12){
            if(text.getText().isEmpty()){
                text.setText("Invalid! Press Clr to to reset");
                b1.setEnabled(false);
                b2.setEnabled(false);
                b3.setEnabled(false);
                b4.setEnabled(false);
                b5.setEnabled(false);
                b6.setEnabled(false);
                b7.setEnabled(false);
                b8.setEnabled(false);
                b9.setEnabled(false);
                b10.setEnabled(false);
                b11.setEnabled(false);
                b12.setEnabled(false);
                b13.setEnabled(false);
                b14.setEnabled(false);
                b15.setEnabled(false);
                b17.setEnabled(false);
                b18.setEnabled(false);
            }
            else{
                a=Double.parseDouble(text.getText()); //0.526
                num1=true;
                num2=false;
                operator='x';
                text.setText("");
            }
        }
        //'/'  operator
        if(e.getSource()==b13){
            if(text.getText().isEmpty()){
                text.setText("Invalid! Press Clr to to reset");
                b1.setEnabled(false);
                b2.setEnabled(false);
                b3.setEnabled(false);
                b4.setEnabled(false);
                b5.setEnabled(false);
                b6.setEnabled(false);
                b7.setEnabled(false);
                b8.setEnabled(false);
                b9.setEnabled(false);
                b10.setEnabled(false);
                b11.setEnabled(false);
                b12.setEnabled(false);
                b13.setEnabled(false);
                b14.setEnabled(false);
                b15.setEnabled(false);
                b17.setEnabled(false);
                b18.setEnabled(false);
            }
            else{
                a=Double.parseDouble(text.getText()); //0.526
                num1=true;
                num2=false;
                operator='/';
                text.setText("");
            }
        }

        //"=" operator
        if(e.getSource()==b14){
            if(num1==false && num2==false && text.getText().isEmpty()){
                text.setText("");
            }
            else if(num1==false && num2==false){
                text.setText(text.getText());
            }
            else if(num1==true && num2==false && text.getText().isEmpty()){
                text.setText("INVALID FORMAT! Press CLR To Reset.");
                b1.setEnabled(false);
                b2.setEnabled(false);
                b3.setEnabled(false);
                b4.setEnabled(false);
                b5.setEnabled(false);
                b6.setEnabled(false);
                b7.setEnabled(false);
                b8.setEnabled(false);
                b9.setEnabled(false);
                b10.setEnabled(false);
                b11.setEnabled(false);
                b12.setEnabled(false);
                b13.setEnabled(false);
                b14.setEnabled(false);
                b15.setEnabled(false);
                b17.setEnabled(false);
                b18.setEnabled(false);
                num1=num2=false;
            }
            else{
                b=Double.parseDouble(text.getText());
                if(operator=='+') ans= a+b;
                if(operator=='-') ans= a-b;
                if(operator=='/') ans= a/b;
                if(operator=='x') ans= a*b;

                text.setText(String.valueOf(ans));
                num1=false;
                num2=false;
            }

        }
        //Negative button
        if(e.getSource()==b17){
            String s= text.getText();
            if(s.isEmpty()){
                text.setText("");
            }
            else{
                if(s.charAt(0)=='-'){
                    String temp="";
                    for(int i=1;i<s.length();i++){
                        temp+=s.charAt(i);
                    }
                    text.setText(temp);
                }
                else{
                    s="-"+s;
                    text.setText(s);
                }
            }
        }
    }
}
