import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
class CalculatorTest extends JFrame implements ActionListener{
        JTextField jtx;        
        int k=1,x=0,y=0,z=0;
        char ch;
        JButton
        one,two,three,four,five,six,seven,eight,nine,zero,clr,pow;
        JButton
        plus,min,div,mul,eq,b1,b2,d;
        ButtonGroup bg;
        Container cont;
        JPanel textPanel,syntpanel,buttonpanel;

        
        CalculatorTest()
        {
                cont=getContentPane();
                cont.setLayout(new BorderLayout());
                JPanel textpanel=new JPanel();
                Font font=new Font("Arial",Font.PLAIN,18);
                jtx=new JTextField(25);
                jtx.setFont(font);
                jtx.setHorizontalAlignment(SwingConstants.RIGHT);
                jtx.addKeyListener(new KeyAdapter()
                {
                 public void keyTyped(KeyEvent keyevent)
                 {
                 char c=keyevent.getKeyChar();
                 if(c>='0' && c<='9')
                 {
                 }
                 else
                 {
                 keyevent.consume();
                 }
                 }
                 });
                textpanel.add(jtx);
                buttonpanel=new JPanel();
                buttonpanel.setLayout(new GridLayout(5,4,2,2));
                boolean t=true;
                //syntpanel=new JPanel();
                //syntpanel.setLayout(new GridLayout(5,1));
                seven=new JButton("7");
                buttonpanel.add(seven);
                seven.addActionListener(this);
                eight=new JButton("8");
                buttonpanel.add(eight);
                eight.addActionListener(this);
                nine=new JButton("9");
                buttonpanel.add(nine);
                nine.addActionListener(this);
                clr=new JButton("AC");
                buttonpanel.add(clr);
                clr.addActionListener(this);
                four=new JButton("4");
                buttonpanel.add(four);
                four.addActionListener(this);
                five=new JButton("5");
                buttonpanel.add(five);
                five.addActionListener(this);
                six=new JButton("6");
                buttonpanel.add(six);
                six.addActionListener(this);
                mul=new JButton("*");
                buttonpanel.add(mul);
                mul.addActionListener(this);
                one=new JButton("1");
                buttonpanel.add(one);
                one.addActionListener(this);
                two=new JButton("2");
                buttonpanel.add(two);
                two.addActionListener(this);
                three=new JButton("3");
                buttonpanel.add(three);
                three.addActionListener(this);
                min=new JButton("-");
                buttonpanel.add(min);
                min.addActionListener(this);
                zero=new JButton("0");
                buttonpanel.add(zero);
                zero.addActionListener(this);
                plus=new JButton("+");
                buttonpanel.add(plus);
                plus.addActionListener(this);
                div=new JButton("/");
                div.addActionListener(this);
                buttonpanel.add(div);
                eq=new JButton("=");
                buttonpanel.add(eq);
                eq.addActionListener(this);
                pow=new JButton("^");
                buttonpanel.add(pow);
                pow.addActionListener(this);
                b1=new JButton("(");
                buttonpanel.add(b1);
                b1.addActionListener(this);
                b2=new JButton(")");
                buttonpanel.add(b2);
                b2.addActionListener(this);
                d=new JButton(".");
                buttonpanel.add(d);
                d.addActionListener(this);
                cont.add("Center",buttonpanel);
                cont.add("North",textpanel);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }

    public void actionPerformed(ActionEvent e)
   {
        String s=e.getActionCommand();
         if(s.equals("Exit"))
        {
                System.exit(0);
        }
        if(s.equals("1"))
        {
            jtx.setText(jtx.getText()+"1");
        }
        if(s.equals("2"))
        {
            jtx.setText(jtx.getText()+"2");
        }
        if(s.equals("3"))
        {
            jtx.setText(jtx.getText()+"3");
        }
        if(s.equals("4"))
        {
            jtx.setText(jtx.getText()+"4");
        }
        if(s.equals("5"))
        {
            jtx.setText(jtx.getText()+"5");
        }
        if(s.equals("6"))
        {
            jtx.setText(jtx.getText()+"6");
        }
        if(s.equals("7"))
        {
            jtx.setText(jtx.getText()+"7");
        }
        if(s.equals("8"))
        {
            jtx.setText(jtx.getText()+"8");
        }
        if(s.equals("9"))
        {
            jtx.setText(jtx.getText()+"9");
        }
        if(s.equals("0"))
        {
            jtx.setText(jtx.getText()+"0");
        }
        if(s.equals("+"))
        {
            jtx.setText(jtx.getText()+"+");
        }
        if(s.equals("-"))
        {
            jtx.setText(jtx.getText()+"-");
        }
        if(s.equals("*"))
        {
            jtx.setText(jtx.getText()+"*");
        }
        if(s.equals("/"))
        {
            jtx.setText(jtx.getText()+"/");
        }
        if(s.equals("^"))
        {
            jtx.setText(jtx.getText()+"^");
        }
        if(s.equals("("))
        {
            jtx.setText(jtx.getText()+"(");
        }
        if(s.equals(")"))
        {
            jtx.setText(jtx.getText()+")");
        }
        if(s.equals("."))
        {
            jtx.setText(jtx.getText()+".");
        }


        if(s.equals("AC"))
        {
        jtx.setText("");
        x=0;
        y=0;
        z=0;
        }
        if(s.equals("="))
       {
         if(jtx.getText().equals(""))
         {
              jtx.setText("");
         }
         else
         {
           Eval_calc ip= new Eval_calc();
           String []h=ip.fn(jtx.getText());
           String []postfix=ip.convert(h);
           double res=ip.eval(postfix);
           jtx.setText("");
           jtx.setText(jtx.getText() + res);
          }
        
        }
 
}       
} 

//MAIN CLASS............
public class Calculator_test
{    public static void main(String[] args) {
         CalculatorTest n=new CalculatorTest();
         n.setTitle("CALCULATOR");
         n.setSize(370,250);
         n.setResizable(false);
         n.setVisible(true);
                 

    }
}


