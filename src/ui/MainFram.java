/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import com.sun.org.apache.xpath.internal.axes.OneStepIterator;
import java.awt.Color;
import java.awt.Toolkit;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.plaf.IconUIResource;

/**
 *
 * @author Amit
 */
public class MainFram extends javax.swing.JFrame {

    /**
     * Creates new form MainFram
     */
    public MainFram() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        five = new javax.swing.JPanel();
        two = new javax.swing.JPanel();
        four = new javax.swing.JPanel();
        one = new javax.swing.JPanel();
        three = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dining Philosopher");
        setBackground(new java.awt.Color(0, 153, 153));
        getContentPane().setLayout(null);

        five.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout fiveLayout = new javax.swing.GroupLayout(five);
        five.setLayout(fiveLayout);
        fiveLayout.setHorizontalGroup(
            fiveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );
        fiveLayout.setVerticalGroup(
            fiveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
        );

        getContentPane().add(five);
        five.setBounds(410, 200, 160, 33);

        two.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout twoLayout = new javax.swing.GroupLayout(two);
        two.setLayout(twoLayout);
        twoLayout.setHorizontalGroup(
            twoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );
        twoLayout.setVerticalGroup(
            twoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        getContentPane().add(two);
        two.setBounds(1310, 220, 160, 26);

        four.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout fourLayout = new javax.swing.GroupLayout(four);
        four.setLayout(fourLayout);
        fourLayout.setHorizontalGroup(
            fourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );
        fourLayout.setVerticalGroup(
            fourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        getContentPane().add(four);
        four.setBounds(300, 490, 160, 24);

        one.setBackground(new java.awt.Color(255, 255, 255));
        one.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout oneLayout = new javax.swing.GroupLayout(one);
        one.setLayout(oneLayout);
        oneLayout.setHorizontalGroup(
            oneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );
        oneLayout.setVerticalGroup(
            oneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        getContentPane().add(one);
        one.setBounds(950, 150, 160, 26);

        three.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout threeLayout = new javax.swing.GroupLayout(three);
        three.setLayout(threeLayout);
        threeLayout.setHorizontalGroup(
            threeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 164, Short.MAX_VALUE)
        );
        threeLayout.setVerticalGroup(
            threeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        getContentPane().add(three);
        three.setBounds(960, 660, 164, 25);

        jPanel1.setBackground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 11, 21, 18);

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 40, 21, 18);

        jPanel3.setBackground(java.awt.Color.green);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(10, 64, 21, 18);

        jLabel2.setText("Intentando hacernos salvar.");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 10, 250, 14);

        jLabel3.setText("Acercandose la fecha de resultados en gestion.");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(49, 40, 300, 14);

        jLabel4.setText("Arranco a calificar");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 70, 220, 14);

        jLabel5.setText("Amarillo -> Comiendo, Rojo -> Hambriento, Verde -> Pensando");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 1000, 310, 40);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/mesa.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 1610, 910);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    /**
     * @param args the command line arguments
     */
   
    
    private final int THINKING=0;
    private final int HUNGRY=1;
    private final int EATING=2;
    void setPosition(int pos,int status)
    {
        if(pos==0)
        {
            if(status==HUNGRY)
            {
                one.setBackground(Color.red);
               
            }
            else if(status==EATING)
            {
                one.setBackground(Color.yellow);
              
            }
            else
            {
                one.setBackground(Color.green);
               
            }
        }
        
        else if(pos==1)
        {
            if(status==HUNGRY)
            {
                two.setBackground(Color.red);
               
            }
            else if(status==EATING)
            {
                two.setBackground(Color.yellow);
              
            }
            else
            {
                two.setBackground(Color.green);
              
            }
        }
        else if(pos==2)
        {
            if(status==HUNGRY)
            {
                three.setBackground(Color.red);
               
            }
            else if(status==EATING)
            {
                three.setBackground(Color.yellow);
               
            }
            else
            {
                three.setBackground(Color.green);
                
            }
        }
        else if(pos==3)
        {
            if(status==HUNGRY)
            {
                four.setBackground(Color.red);
               
            }
            else if(status==EATING)
            {
                four.setBackground(Color.yellow);
               
            }
            else
            {
                four.setBackground(Color.green);
                
            }
        }
        else
        {
            if(status==HUNGRY)
            {
                
                five.setBackground(Color.red);
                
                
                
                
            }
            else if(status==EATING)
            {
                five.setBackground(Color.yellow);
               
            }
            else
            {
                five.setBackground(Color.green);
               
            }
            
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel five;
    private javax.swing.JPanel four;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel one;
    private javax.swing.JPanel three;
    private javax.swing.JPanel two;
    // End of variables declaration//GEN-END:variables
}