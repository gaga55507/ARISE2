package com.arise2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.management.ThreadInfo;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.chrono.IsoChronology;
import java.time.temporal.IsoFields;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

import org.apache.pdfbox.multipdf.PDFMergerUtility;



import org.apache.pdfbox.multipdf.Splitter;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.ini4j.Ini;
import org.ini4j.IniPreferences;
import org.w3c.dom.css.RGBColor;

import science.aist.imaging.api.domain.color.Color;

import javax.imageio.ImageIO;
import javax.print.attribute.standard.PageRanges;
import javax.swing.filechooser.*;
import java.util.Arrays;
import java.util.Collections;


import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.*;
import java.util.Iterator;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.*;

class filechooser2 extends JFrame implements ActionListener, ItemListener{
    static JLabel l;
    static JComboBox combobox;
    static JComboBox combobox2;
    static JTextArea textArea;
    static JLabel l1, l2,l3; 
    
    public static Object itemStateChanged;
    ImageIcon imageIcon;
    String J12;	
    String J13;	
    String J14;
    String J20;
    String J21;
    static String J24;
    String JE20;
    String JE24;
    String JE36,J54,J55;
    String Type1;
    String E1201E1221,E1204E1224,J3;
    String [][] TAB;
    Map<String, String> TEST;
    JButton button1;
    Path currentDir = Paths.get("");
    static String newLine = System.getProperty("line.separator");
    filechooser2()
	{
	}
    public static void main (String args[])

	{

        App1.main();
        SimpleTesting.INITIALISATION();
		// frame to contains GUI elements
		JFrame f = new JFrame("E1201-E1204");

      
		// set the size of the frame
		f.setSize(530, 400);
               
		// set the frame's visibility
		f.setVisible(true);
        
        ImageIcon img = new ImageIcon("src/main/java/com/arise/Mutualite sociale agricole logo.png");
        f.setIconImage(img.getImage());

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String s1[] = { "M07GBLA", "M07JCHA", "M07GVAC","M07LVAL" }; 
       
        combobox = new JComboBox(s1);
        
        
		// button to open save dialog
		JButton button1 = new JButton("Génération PDF");
		button1.setPreferredSize(new Dimension(250,50));
        JButton button2 = new JButton("Génération PDF 2");
		button2.setPreferredSize(new Dimension(250,50));
		// button to open open dialog
	
		// make an object of the class filechooser
		filechooser2 f1 = new filechooser2();
       
        JButton button8 = new JButton("PDF SIGNE");
        button8.setPreferredSize(new Dimension(250,50));
        JButton button7 = new JButton("SUPPRIMER");
        button7.setPreferredSize(new Dimension(250,50));
       
		// add action listener to the button to capture user
		// response on buttons
		button1.addActionListener(f1);
        button2.addActionListener(f1);
        button7.addActionListener(f1);
        button8.addActionListener(f1);
        combobox.addItemListener(f1);
      
       
		// make a panel to add the buttons and labels
		JPanel p = new JPanel() ;
       
      
        l2 = new JLabel("[M07GBLA]");
        l3 = new JLabel("RIEN");
		// add buttons to the frame
        
    
        
         
          p.add(button1);
          p.add(button2);
          p.add(button7);
          p.add(button8);

          p.add(combobox);
          p.add(l2);
          p.add(l3);

          l = new JLabel("");

          // add panel to the frame
          p.add(l);
       
        
         
          f.add(p);
          f.setVisible(true);

         
        //   
		// set the label to its initial value

        // SimpleTesting.createDirectoryIfNeeded(pathsss);


	}
    public void itemStateChanged(ItemEvent e) 
    { 
        // si l'état du combobox est modifiée 
        if (e.getSource() == combobox) { 
  
            l2.setText(" ["+combobox.getSelectedItem()+"]"); 
            String NomAgent = combobox.getSelectedItem().toString();
            System.out.println(NomAgent);


        } 

         
}
    @Override
    public void actionPerformed(ActionEvent e) {
        String com = e.getActionCommand();
		if (com.equals("Génération PDF")) {
try {
    E1204.main(null);
    
} catch (IOException e1) {
    
    e1.printStackTrace();
}
        
        
    }

    if (com.equals("Génération PDF 2")) {
        try {
            
            E1224.main(null);
        } catch (IOException e1) {
            
            e1.printStackTrace();
        }
                
                
            }
    if (com.equals("PDF SIGNE")) {

        pdfss.main(combobox);
     
                
            }

            if (com.equals("SUPPRIMER")) {

          SimpleTesting.main();
             
                        
                    }
                
        
    }
   
    

    
 
    
}
    


 

    



