/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puzzlegame;

import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import static javafx.scene.paint.Color.color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Sarko
 */
public class PuzzleGame extends JFrame implements ActionListener{
    
   Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,Mix,FIX;
    PuzzleGame(){
        super("Välkommen till Puzzle Game");  
    b1=new Button("1");  
    b1.setBounds(50,100,40,40);  
    b2=new Button("2");  
    b2.setBounds(100,100,40,40);  
    b3=new Button("3");  
    b3.setBounds(150,100,40,40);  
    b4=new Button("4");  
    b4.setBounds(200,100,40,40);
    
    b5=new Button("5");  
    b5.setBounds(50,150,40,40);  
    b6=new Button("6");  
    b6.setBounds(100,150,40,40);  
    b7=new Button("7");  
    b7.setBounds(150,150,40,40);  
    b8=new Button("8");  
    b8.setBounds(200,150,40,40); 
    
    b9=new Button("9");  
    b9.setBounds(50,200,40,40); 
    b10=new Button("10");  
    b10.setBounds(100,200,40,40);  
    b11=new Button("11");  
    b11.setBounds(150,200,40,40);  
    b12=new Button("12");  
    b12.setBounds(200,200,40,40); 
    
    b13=new Button("13");  
    b13.setBounds(50,250,40,40);  
    b14=new Button("14");  
    b14.setBounds(100,250,40,40);  
    b15=new Button("15");  
    b15.setBounds(150,250,40,40);
    b16=new Button(" ");  
    b16.setBounds(200,250,40,40); 
    
    b1.setBackground(Color.orange);
    b2.setBackground(Color.orange);
    b3.setBackground(Color.orange);
    b4.setBackground(Color.orange);
    b5.setBackground(Color.orange);
    b6.setBackground(Color.orange);
    b7.setBackground(Color.orange);
    b8.setBackground(Color.orange);
    b9.setBackground(Color.orange);
    b10.setBackground(Color.orange);
    b11.setBackground(Color.orange);
    b12.setBackground(Color.orange);
    b13.setBackground(Color.orange);
    b14.setBackground(Color.orange);
    b15.setBackground(Color.orange);
    b16.setBackground(Color.orange);
    
    
    
    Mix=new Button("Mix");
    Mix.setBounds(40,40,40,40);
    FIX=new Button("FIX");
    FIX.setBounds(90,40,40,40);
    
    add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);add(b7);add(b8);add(b9);add(b10);
      add(b11);add(b12);add(b13);add(b14);add(b15);add(b16);add(Mix);add(FIX);
      
        b1.addActionListener(this);  
        b2.addActionListener(this);  
        b3.addActionListener(this);  
        b4.addActionListener(this);  
        b5.addActionListener(this);  
        b6.addActionListener(this);  
        b7.addActionListener(this);  
        b8.addActionListener(this);  
        b9.addActionListener(this); 
        
        b10.addActionListener(this);  
        b11.addActionListener(this);  
        b12.addActionListener(this);  
        b13.addActionListener(this);  
        b14.addActionListener(this);  
        b15.addActionListener(this);  
        b16.addActionListener(this);  
        
        Mix.addActionListener(this);
        FIX.addActionListener(this);
        
      
      Mix.setBackground(Color.red);
      Mix.setForeground(Color.orange);
      
      FIX.setBackground(Color.BLUE);
      FIX.setForeground(Color.orange);
//      b8.setForeground(Color.RED);
      
//      pack();
      setLayout(null);
      setSize(350,350);
      setVisible(true);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setLocation(800, 350);
      

//       b1.addMouseListener(mymouse); //color buttons

    }
    
    
   @Override
    public void actionPerformed(ActionEvent e){
         if(e.getSource()==Mix)  {
         String s = b4.getLabel();b4.setLabel(b9.getLabel());
         b9.setLabel(s);
         s=b1.getLabel();b1.setLabel(b5.getLabel());
         b5.setLabel(s);
         s=b2.getLabel();b2.setLabel(b7.getLabel());
         b7.setLabel(s);
         s=b6.getLabel();b6.setLabel(b15.getLabel());
         b15.setLabel(s);
         s=b11.getLabel();b11.setLabel(b8.getLabel());
         b8.setLabel(s);
         s=b13.getLabel();b13.setLabel(b1.getLabel());
         b1.setLabel(s);
         s=b3.getLabel();b3.setLabel(b12.getLabel());
         b12.setLabel(s);
         s=b2.getLabel();b2.setLabel(b14.getLabel());
         b14.setLabel(s);
         s=b8.getLabel();b8.setLabel(b9.getLabel());
         b9.setLabel(s);
         s=b7.getLabel();b7.setLabel(b16.getLabel());
         b16.setLabel(s);
         
         }
//         if(e.getSource()==FIX){
//             FIX = b1.getLabel().equals("1")&&b2.getLabel().equals("2")&&b3.getLabel().equals("3")
//                       &&b4.getLabel().equals("4")&&b5.getLabel().equals("5")&&b6.getLabel().equals("6")
//                          &&b7.getLabel().equals("7")&&b8.getLabel().equals("8")&&b9.getLabel().equals("9")
//                            &&b10.getLabel().equals("10")&&b11.getLabel().equals("11")&&b12.getLabel().equals("12")
//                          &&b13.getLabel().equals("13")&&b14.getLabel().equals("14")
//                        &&b15.getLabel().equals("15");
//         
//        JOptionPane.showMessageDialog(PuzzleGame.this,"Grattis Du vann");
//         }
         
         
        if (e.getSource() ==b1){
        String s= b1.getLabel();
        if (b2.getLabel().equals(" ")){b2.setLabel(s); b1.setLabel(" "); }
        else if (b5.getLabel().equals(" ")){b5.setLabel(s);b1.setLabel(" ");}
            System.out.println("Button1 " + b1.getLabel());
        }
            if (e.getSource() ==b2){
        String s= b2.getLabel();
        if (b1.getLabel().equals(" ")){b1.setLabel(s); b2.setLabel(" "); }
         else if (b3.getLabel().equals(" ")){b3.setLabel(s);b2.setLabel(" ");}
         else if (b6.getLabel().equals(" ")){b6.setLabel(s);b2.setLabel(" ");}
        System.out.println("Button2 " + b2.getLabel());
        }
            
            if (e.getSource() ==b3){
        String s= b3.getLabel();
        if (b2.getLabel().equals(" ")){b2.setLabel(s); b3.setLabel(" "); }
         else if (b4.getLabel().equals(" ")){b4.setLabel(s);b3.setLabel(" ");}
         else if (b7.getLabel().equals(" ")){b7.setLabel(s);b3.setLabel(" ");}
        System.out.println("Button3 " + b3.getLabel());
        }
           
               if (e.getSource() ==b4){
        String s= b4.getLabel();
        if (b3.getLabel().equals(" ")){b3.setLabel(s); b4.setLabel(" "); }
        else if (b8.getLabel().equals(" ")){b8.setLabel(s);b4.setLabel(" ");}
        System.out.println("Button4 " + b4.getLabel());
        }
            
            if (e.getSource() ==b5){
        String s= b5.getLabel();
        if (b1.getLabel().equals(" ")){b1.setLabel(s); b5.setLabel(" "); }       
         else if (b6.getLabel().equals(" ")){b6.setLabel(s);b5.setLabel(" ");}
         else if (b9.getLabel().equals(" ")){b9.setLabel(s);b5.setLabel(" ");}
        System.out.println("Button5 " + b5.getLabel());
        }
            
               if (e.getSource() ==b6){
        String s= b6.getLabel();
        if (b2.getLabel().equals(" ")){b2.setLabel(s); b6.setLabel(" "); }
         else if (b5.getLabel().equals(" ")){b5.setLabel(s);b6.setLabel(" ");}
         else if (b7.getLabel().equals(" ")){b7.setLabel(s);b6.setLabel(" ");}
         else if (b10.getLabel().equals(" ")){b10.setLabel(s);b6.setLabel(" ");}
        System.out.println("Button6 " + b6.getLabel());
        }
            
            if (e.getSource() ==b7){
        String s= b7.getLabel();
        if (b3.getLabel().equals(" ")){b3.setLabel(s); b7.setLabel(" "); }
         else if (b8.getLabel().equals(" ")){b8.setLabel(s);b7.setLabel(" ");}
         else if (b6.getLabel().equals(" ")){b6.setLabel(s);b7.setLabel(" ");}
         else if (b11.getLabel().equals(" ")){b11.setLabel(s);b7.setLabel(" ");}
        System.out.println("Button7 " + b7.getLabel());
        }
            
               if (e.getSource() ==b8){
        String s= b8.getLabel();
        if (b7.getLabel().equals(" ")){b7.setLabel(s); b8.setLabel(" "); }
        else if (b12.getLabel().equals(" ")){b12.setLabel(s);b8.setLabel(" ");}
        else if (b4.getLabel().equals(" ")){b4.setLabel(s);b8.setLabel(" ");}
         System.out.println("Button8 " + b8.getLabel());
        }
            
            if (e.getSource() ==b9){
        String s= b9.getLabel();
        if (b5.getLabel().equals(" ")){b5.setLabel(s); b9.setLabel(" "); }
         else if (b13.getLabel().equals(" ")){b13.setLabel(s);b9.setLabel(" ");}
         else if (b10.getLabel().equals(" ")){b10.setLabel(s);b9.setLabel(" ");}
        System.out.println("Button9 " + b9.getLabel());
        }
            
               if (e.getSource() ==b10){
        String s= b10.getLabel();
        if (b11.getLabel().equals(" ")){b11.setLabel(s); b10.setLabel(" "); }
         if (b14.getLabel().equals(" ")){b14.setLabel(s);b10.setLabel(" ");}
         else if (b6.getLabel().equals(" ")){b6.setLabel(s);b10.setLabel(" ");}
         else if (b9.getLabel().equals(" ")){b9.setLabel(s);b10.setLabel(" ");}
         System.out.println("button " + b10.getLabel());
        }
            
            if (e.getSource() ==b11){
        String s= b11.getLabel();
        if (b7.getLabel().equals(" ")){b7.setLabel(s); b11.setLabel(" "); }
         if (b10.getLabel().equals(" ")){b10.setLabel(s);b11.setLabel(" ");}
         if (b12.getLabel().equals(" ")){b12.setLabel(s);b11.setLabel(" ");}
         if (b15.getLabel().equals(" ")){b15.setLabel(s);b11.setLabel(" ");}
                System.out.println("button11 " + b11.getLabel());
        }
            
               if (e.getSource() ==b12){
        String s= b12.getLabel();
        if (b16.getLabel().equals(" ")){b16.setLabel(s); b12.setLabel(" "); }
         else if (b11.getLabel().equals(" ")){b11.setLabel(s);b12.setLabel(" ");}
         else if (b8.getLabel().equals(" ")){b8.setLabel(s);b12.setLabel(" ");}
        System.out.println("Button12 " + b12.getLabel());
        }
            
            if (e.getSource() ==b13){
        String s= b13.getLabel();
        if (b9.getLabel().equals(" ")){b9.setLabel(s); b13.setLabel(" "); }
         else if (b14.getLabel().equals(" ")){b14.setLabel(s);b13.setLabel(" ");}
        System.out.println("Button13 " + b13.getLabel());
        }
            
               if (e.getSource() ==b14){
        String s= b14.getLabel();
        if (b15.getLabel().equals(" ")){b15.setLabel(s); b14.setLabel(" "); }
         else if (b10.getLabel().equals(" ")){b10.setLabel(s);b14.setLabel(" ");}
         else if (b13.getLabel().equals(" ")){b13.setLabel(s);b14.setLabel(" ");}
        System.out.println("Button14 " + b14.getLabel());
        }
            
            if (e.getSource() ==b15){
        String s= b15.getLabel();
        if (b11.getLabel().equals(" ")){ b11.setLabel(s); b15.setLabel(" "); }
         else if (b14.getLabel().equals(" ")){ b14.setLabel(s);b15.setLabel(" ");}
         else if (b16.getLabel().equals(" ")){ b16.setLabel(s);b15.setLabel(" ");}
        System.out.println("Button15 " + b15.getLabel());
        }
            
         if (e.getSource() ==b16){
           String s= b16.getLabel();
        if (b15.getLabel().equals(" ")){b15.setLabel(s); b16.setLabel(" ");}
         else if (b12.getLabel().equals(" ")){b12.setLabel(s);b16.setLabel(" ");}
        System.out.println("Button16 " + b16.getLabel());
        
               
                if(b1.getLabel().equals("1")&&b2.getLabel().equals("2")&&b3.getLabel().equals("3")
                       &&b4.getLabel().equals("4")&&b5.getLabel().equals("5")&&b6.getLabel().equals("6")
                          &&b7.getLabel().equals("7")&&b8.getLabel().equals("8")&&b9.getLabel().equals("9")
                            &&b10.getLabel().equals("10")&&b11.getLabel().equals("11")&&b12.getLabel().equals("12")
                       &&b13.getLabel().equals("13")&&b14.getLabel().equals("14")&&b15.getLabel().equals("15")){
                    
                    JOptionPane.showMessageDialog(PuzzleGame.this,"Grattis Du lyckades");
                }
           }
    }
    
    
    
    
    
    
//    MouseAdapter mymouse = new MouseAdapter(){ color buttons
//        
//    @Override
//        public void mouseEntered(MouseEvent e) {
//         if(e.getComponent()== b1){
//        b1.setForeground(Color.red);
//         }else{
//         b1.setForeground(Color.black);
//         }
//       }
//    
//    };
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // TODO code application logic here
       PuzzleGame puzzleGame = new PuzzleGame();
    }
    
    }
