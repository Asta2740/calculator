package gui;


import java.awt.event.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.*;


public class GUI implements ActionListener{
    JFrame frame;
    JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bplus,bminus
            ,btimes,bdivided,bbackspace,bequal;
    JLabel label;
    JTextField text;
    JPanel panel1;
    JPanel panel2;
    JPanel panel3;
    JPanel panel4;
    JPanel panel5;
    JPanel panelAll;
    double result;
    int G;
    int j=0; // turn counter
    int k =0;
    int i = 0;
    int y;
    int a;
    int t; // so we dont use operttors at first
    int r; // so we dont use 2 opartors after another that cant be used
    boolean Q=true; // for the first negtaive sign in the whole equation only
    boolean T=false;// so we can use multiple pluses or minuses
    boolean S = false; // to be able to recalculate without any trouble from the result
    boolean M= false; // so no problem happen if - then equal without number

    ArrayList<Double> numbers = new ArrayList<Double>();
    ArrayList<Integer> turns = new ArrayList<Integer>();
    
    GUI(){
        frame = new JFrame();
        text = new JTextField();
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        panel4 = new JPanel();
        panel5 = new JPanel();
        panelAll= new JPanel();
        text.setColumns(15);
        panel1.add(text,BorderLayout.NORTH);
        
        
        
        b1 = new JButton("1");
        
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b0 = new JButton("0");
        bplus = new JButton("+");
        bminus = new JButton("-");
        btimes = new JButton("*");
        bdivided = new JButton("/");
        bbackspace = new JButton("C");
        bequal = new JButton("=");
        panel2.add(b7);
        panel2.add(b8);
        panel2.add(b9);
        panel2.add(btimes);
        panel2.setLayout(new FlowLayout(FlowLayout.RIGHT));
        
        panel3.add(b4);
        panel3.add(b5);
        panel3.add(b6);
        panel3.add(bplus);
        panel3.setLayout(new FlowLayout(FlowLayout.RIGHT));
        
        panel4.add(b1);
        panel4.add(b2);
        panel4.add(b3);
        panel4.add(bminus);
        panel4.setLayout(new FlowLayout(FlowLayout.RIGHT));
        
        
        panel5.add(b0);
        panel5.add(bbackspace);
        panel5.add(bequal);
        panel5.add(bdivided);
        panel5.setLayout(new FlowLayout(FlowLayout.RIGHT));
        panelAll.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        panelAll.setLayout(new GridLayout(5,5));
        panelAll.add(panel1);
        panelAll.add(panel2);
        panelAll.add(panel3);
        panelAll.add(panel4);
        panelAll.add(panel5);
     
        // buttons action listener
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        btimes.addActionListener(this);
        bplus.addActionListener(this);
        bminus.addActionListener(this);
        bdivided.addActionListener(this);
        bbackspace.addActionListener(this);
        bequal.addActionListener(this);
        panel1.setBackground(Color.BLACK);
        panel2.setBackground(Color.BLACK);
        panel3.setBackground(Color.BLACK);
        panel4.setBackground(Color.BLACK);
        panel5.setBackground(Color.BLACK);
        
        panelAll.setBackground(Color.BLACK);
        frame.setTitle("Calculator");
        frame.add(panelAll,BorderLayout.WEST);
        frame.setVisible(true);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    public void actionPerformed(ActionEvent e){
        if ( e.getSource()== b1){
            if (S==true){
                text.setText("");
                S=false;
            }
            text.setText(text.getText()+"1");
            k =0;
            G=0;
            t=1;
            r=0;
            Q=false;
            T=true;
            a=0;
            M=false;
        }
           if ( e.getSource()== b2){
                 if (S==true){
                text.setText("");
                S=false;
            }
            text.setText(text.getText()+"2");
            k =0;
            G=0;
            t=1;
            r=0;
            Q=false;
            T=true;
            a=0;
            M=false;
        }
              if ( e.getSource()== b3){
                    if (S==true){
                text.setText("");
                S=false;
            }
            text.setText(text.getText()+"3");
             k =0;
             G=0;
             t=1;
             r=0;
             Q=false;
             T=true;
             a=0;
             M=false;
        }
                 if ( e.getSource()== b4){
                       if (S==true){
                text.setText("");
                S=false;
            }
            text.setText(text.getText()+"4");
             k =0;
             G=0;
             t=1;
             r=0;
             Q=false;
             T=true;
             a=0;
             M=false;
        }
                    if ( e.getSource()== b5){
                          if (S==true){
                text.setText("");
                S=false;
            }
            text.setText(text.getText()+"5");
             k =0;
             G=0;
             t=1;
             r=0;
             Q=false;
             T=true;
             a=0;
             M=false;
        }
                       if ( e.getSource()== b6){
                             if (S==true){
                text.setText("");
                S=false;
            }
            text.setText(text.getText()+"6");
            k =0;
            G=0;
            t=1;
            r=0;
            Q=false;
            T=true;
            a=0;
            M=false;
        }
                          if ( e.getSource()== b7){
                                if (S==true){
                text.setText("");
                S=false;
            }
            text.setText(text.getText()+"7");
             k =0;
             G=0;
             t=1;
             r=0;
             Q=false;
             T=true;
             a=0;
             M=false;
        }
                             if ( e.getSource()== b8){
                                   if (S==true){
                text.setText("");
                S=false;
            }
            text.setText(text.getText()+"8");
            k =0;
            G=0;
            t=1;
            r=0;
            Q=false;
            T=true;
            a=0;
            M=false;
        }
                                if ( e.getSource()== b9){
                                      if (S==true){
                text.setText("");
                S=false;
            }
            text.setText(text.getText()+"9");
             k =0;
             G=0;
             t=1;
             r=0;
             Q=false;
             T=true;
             a=0;
             M=false;
        }
                                   if ( e.getSource()== b0){
                                         if (S==true){
                text.setText("");
                S=false;
                
            }
            text.setText(text.getText()+"0");
            k =0;
            G=0;
            t=1;
            r=0;
            Q=false;
            T=true;
            a=0;
            M=false;
        }
          //___________________________________________________________________                         
if (    !"".equals(text.getText())&&r!=1&&t==1&&a!=1&& e.getSource()== bplus
        &&T==true){
                if(G!=1){
                    if(S==true){
                        double x = Double.parseDouble(text.getText());  
               numbers.add(x);
            text.setText("");
            k =1;
            j=1;
            a=1;
            r=1;
            turns.add(j);
            T=false;
            M=true;
                        
                    }else{
               double x = Double.parseDouble(text.getText());  
               numbers.add(x);
            text.setText("");
            k =1;
            j=1;
            a=1;
            r=1;
            turns.add(j);
            T=false;
            M=true;
                    }
           
        }
           }
// negative signs for non positive numbers
           if(t==0&&k==1&&e.getSource()==bminus){
               text.setText(text.getText()+"-");
               k=0;
               G=1;
           }
           if(Q==true&&e.getSource()==bminus){
               text.setText(text.getText()+"-");
               Q=false;
               

           }
           
if (    !"".equals(text.getText())&&r!=1&&t==1&&a!=2&&  e.getSource()== btimes
        &&T==true){
                  if(G!=1){
                      if(S==true){
                          double x = Double.parseDouble(text.getText());  
               numbers.add(x);
            text.setText("");
               j=3;
               a=2;
               k =1;
               r=1;
              turns.add(j);
              T=false;
              M=true;
                          
                      }else{
               double x = Double.parseDouble(text.getText());  
               numbers.add(x);
            text.setText("");
               j=3;
               a=2;
               k =1;
               r=1;
              turns.add(j);
              T=false;
              M=true;
                      }
        }
              }
if (    !"".equals(text.getText())&&r!=1&&t==1&&a!=3&&  e.getSource()== bdivided
        &&T==true){
                      if(G!=1){
                           if(S==true){
                                double x = Double.parseDouble(text.getText());    
               numbers.add(x);
            text.setText("");
              j=4;
              a=3;
              k =1;
              r=1;
              turns.add(j);
              T=false;
              M=true;
                               
                           }else{
                          
               double x = Double.parseDouble(text.getText());    
               numbers.add(x);
            text.setText("");
              j=4;
              a=3;
              k =1;
              r=1;
              turns.add(j);
              T=false;
              M=true;
                           }

        }
                 }
 if (   !"".equals(text.getText())&&r!=1&&t==1&&a!=4&& k==0 && e.getSource()== bminus
         &&T==true){
                         if(G!=1){
                             if(S==true){
                                  double x = Double.parseDouble(text.getText());   
               numbers.add(x);
            text.setText("");
              j=2;
              a=4;
              k =1;
              r=1;
             turns.add(j);
             T=false;
             M=true;
                             }else{
                             
               double x = Double.parseDouble(text.getText());   
               numbers.add(x);
            text.setText("");
              j=2;
              a=4;
              k =1;
              r=1;
             turns.add(j);
             T=false;
             M=true;

        }
                         }
                    }
                       if ( e.getSource()== bbackspace){
            text.setText("");
            M=true;
        }
                       
       if (t==1&&M==false&& e.getSource()== bequal){
           double x = Double.parseDouble(text.getText());  
           numbers.add(x);
           while(i<turns.size()){
           switch(turns.get(i)){
               case 1:
                   numbers.set(i+1,numbers.get(i)+numbers.get(i+1));
                   break;
               case 2:
                   numbers.set(i+1,numbers.get(i)-numbers.get(i+1));
                   break;
               case 3:
                   numbers.set(i+1,numbers.get(i)*numbers.get(i+1));
                   break;
               case 4:
                   numbers.set(i+1,numbers.get(i)/numbers.get(i+1));
                   break;
           }
           i++;
           }
           
           result=numbers.get(i);
           String s=Double. toString(result);
           text.setText(s);
              numbers.clear();
              turns.clear();
              i=0;
              S=true;
        }

        

    }
    public static void main(String[]args){
        new GUI();
    }
}
// @author YH