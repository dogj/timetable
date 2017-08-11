package TimeTable;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
//import java.awt.BorderLayout;
//import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;


//import java.awt.GridBagLayout;
//import java.awt.GridBagConstraints;
//import java.awt.Insets;
//import java.awt.List;

//import javax.swing.BoxLayout;
//import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

import javax.swing.JScrollPane;

public class Tinterface {

	private JFrame frame;
	//private DefaultTableModel dtm;
	
	 String selectLevel;
	 String selectCourse;
	 
     ArrayList<String> list = new ArrayList();
     ArrayList<String> listC = new ArrayList();
    
     //init levelBox
     String[] levelNum = {"5", "6", "7"};
     JComboBox cBoxLevel = new JComboBox(levelNum);
     
    
     JComboBox cBoxCourse = new JComboBox();
     JComboBox cBoxStream = new JComboBox();
     
     private JTable table;
    
     private JTextField textField_310;
     private JTextField textField_110;
     private JTextField textField_113;
     private JTextField textField_114;
     private JTextField textField_115;
     private JTextField textField_116;
     private JLabel lblWednesday;
     private JLabel lblThu;
     private JLabel lblFri;
     private JLabel label_1;
     private JLabel label_2;
     private JLabel label_3;
     private JLabel label_4;
     private JLabel label_5;
     private JLabel label_6;
     private JLabel label_7;
     private JLabel label_8;
     private JTextField textField_410;
     private JTextField textField_411;
     private JTextField textField_210;
     private JTextField textField_211;
     private JTextField textField_212;
     private JTextField textField_213;
     private JTextField textField_214;
     private JTextField textField_215;
     private JTextField textField_216;
     private JTextField textField_413;
     private JTextField textField_18;
     private JTextField textField_19;
     private JTextField textField_311;
     private JTextField textField_312;
     private JTextField textField_313;
     private JTextField textField_314;
     private JTextField textField_315;
     private JTextField textField_316;
     private JTextField textField_48;
     private JTextField textField_49;
     private JTextField textField_28;
     private JTextField textField_29;
     private JTextField textField_412;
     private JTextField textField_414;
     private JTextField textField_415;
     private JTextField textField_416;
     private JTextField textField_58;
     private JTextField textField_59;
     private JTextField textField_510;
     private JTextField textField_38;
     private JTextField textField_39;
     private JTextField textField_513;
     private JTextField textField_514;
     private JTextField textField_515;
     private JTextField textField_516;

	private JTextField textField_111;
	private JTextField textField_112;
	private JTextField textField_511;
	private JTextField textField_512;

     
     
     
     Object[] addCourse;
     Vector columnNames = new Vector();
 	 Vector selectedCourse = new Vector();
 	
 	 DefaultTableModel dtm ;
 	 
 	 
 	 //define the event when course is selected
	 public void course() {
	
		cBoxCourse.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				 if(e.getStateChange() == ItemEvent.SELECTED) {
				SelectStream SS = new SelectStream();
			    selectCourse = (String) cBoxCourse.getSelectedItem();
			    listC.clear();
			    listC.addAll(SS.matchLevel(selectCourse));
			   
			    cBoxStream.removeAllItems();
			    
			    for (String s: listC) {
			    cBoxStream.addItem(s);
			   
			     }
				 }	}
			
			
		});


		cBoxCourse.setToolTipText("123");
		cBoxCourse.setBounds(268, 7, 94, 24);
		frame.getContentPane().add(cBoxCourse);
    
	}
	 
	 //table interface
	 public void table() {
			
			JLabel lblMonday = new JLabel("Mon");
			lblMonday.setHorizontalAlignment(SwingConstants.CENTER);
			lblMonday.setBounds(12, 295, 46, 14);
			frame.getContentPane().add(lblMonday);
			
			JLabel label = new JLabel("8:00-9:00");
			label.setHorizontalAlignment(SwingConstants.CENTER);
			label.setBounds(59, 244, 86, 14);
			frame.getContentPane().add(label);
			
			JLabel lblTuesday = new JLabel("Tue");
			lblTuesday.setHorizontalAlignment(SwingConstants.CENTER);
			lblTuesday.setBounds(12, 332, 46, 14);
			frame.getContentPane().add(lblTuesday);
			
			lblWednesday = new JLabel("Wed");
			lblWednesday.setHorizontalAlignment(SwingConstants.CENTER);
			lblWednesday.setBounds(12, 369, 46, 14);
			frame.getContentPane().add(lblWednesday);
			
			lblThu = new JLabel("Thu");
			lblThu.setHorizontalAlignment(SwingConstants.CENTER);
			lblThu.setBounds(12, 406, 46, 14);
			frame.getContentPane().add(lblThu);
			
			lblFri = new JLabel("Fri");
			lblFri.setHorizontalAlignment(SwingConstants.CENTER);
			lblFri.setBounds(12, 443, 46, 14);
			frame.getContentPane().add(lblFri);
			
			label_1 = new JLabel("9:00-10:00");
			label_1.setHorizontalAlignment(SwingConstants.CENTER);
			label_1.setBounds(143, 244, 86, 14);
			frame.getContentPane().add(label_1);
			
			label_2 = new JLabel("10:00-11:00");
			label_2.setHorizontalAlignment(SwingConstants.CENTER);
			label_2.setBounds(227, 244, 86, 14);
			frame.getContentPane().add(label_2);
			
			label_3 = new JLabel("11:00-12:00");
			label_3.setHorizontalAlignment(SwingConstants.CENTER);
			label_3.setBounds(311, 244, 86, 14);
			frame.getContentPane().add(label_3);
			
			label_4 = new JLabel("12:00-13:00");
			label_4.setHorizontalAlignment(SwingConstants.CENTER);
			label_4.setBounds(398, 244, 86, 14);
			frame.getContentPane().add(label_4);
			
			label_5 = new JLabel("13:00-14:00");
			label_5.setHorizontalAlignment(SwingConstants.CENTER);
			label_5.setBounds(479, 244, 86, 14);
			frame.getContentPane().add(label_5);
			
			label_6 = new JLabel("14:00-15:00");
			label_6.setHorizontalAlignment(SwingConstants.CENTER);
			label_6.setBounds(563, 244, 86, 14);
			frame.getContentPane().add(label_6);
			
			label_7 = new JLabel("15:00-16:00");
			label_7.setHorizontalAlignment(SwingConstants.CENTER);
			label_7.setBounds(647, 244, 86, 14);
			frame.getContentPane().add(label_7);
			
			label_8 = new JLabel("16:00-17:00");
			label_8.setHorizontalAlignment(SwingConstants.CENTER);
			label_8.setBounds(731, 244, 86, 14);
			frame.getContentPane().add(label_8);
			
			textField_18 = new JTextField();
			textField_18.setBounds(59, 283, 86, 39);
			frame.getContentPane().add(textField_18);
			textField_18.setEditable(false);
			textField_18.setBackground(Color.WHITE);
			textField_18.setColumns(10);

			textField_19 = new JTextField();
			textField_19.setColumns(10);
			textField_19.setBounds(143, 283, 86, 39);
			textField_19.setEditable(false);
			textField_19.setBackground(Color.WHITE);
			frame.getContentPane().add(textField_19);

			textField_110 = new JTextField();
			textField_110.setColumns(10);
			textField_110.setBounds(227, 283, 86, 39);
			textField_110.setEditable(false);
			textField_110.setBackground(Color.WHITE);
			frame.getContentPane().add(textField_110);

			textField_111 = new JTextField();
			textField_111.setColumns(10);
			textField_111.setBounds(311, 283, 86, 39);
			textField_110.setEditable(false);
			textField_110.setBackground(Color.WHITE);
			frame.getContentPane().add(textField_111);

			textField_112 = new JTextField();
			textField_112.setColumns(10);
			textField_112.setBounds(395, 283, 86, 39);
			textField_112.setEditable(false);
			textField_112.setBackground(Color.WHITE);
			frame.getContentPane().add(textField_112);

			textField_113 = new JTextField();
			textField_113.setColumns(10);
			textField_113.setBounds(479, 283, 86, 39);
			textField_113.setEditable(false);
			textField_113.setBackground(Color.WHITE);
			frame.getContentPane().add(textField_113);

			textField_114 = new JTextField();
			textField_114.setColumns(10);
			textField_114.setBounds(563, 283, 86, 39);
			textField_114.setEditable(false);
			textField_114.setBackground(Color.WHITE);
			frame.getContentPane().add(textField_114);

			textField_115 = new JTextField();
			textField_115.setColumns(10);
			textField_115.setBounds(647, 283, 86, 39);
			textField_115.setEditable(false);
			textField_115.setBackground(Color.WHITE);
			frame.getContentPane().add(textField_115);

			textField_116 = new JTextField();
			textField_116.setColumns(10);
			textField_116.setBounds(731, 283, 86, 39);
			textField_116.setEditable(false);
			textField_116.setBackground(Color.WHITE);
			frame.getContentPane().add(textField_116);

			textField_28 = new JTextField();
			textField_28.setColumns(10);
			textField_28.setBounds(59, 320, 86, 39);
			textField_28.setEditable(false);
			textField_28.setBackground(Color.WHITE);
			frame.getContentPane().add(textField_28);

			textField_29 = new JTextField();
			textField_29.setColumns(10);
			textField_29.setBounds(143, 320, 86, 39);
			textField_29.setEditable(false);
			textField_29.setBackground(Color.WHITE);
			frame.getContentPane().add(textField_29);

			textField_210 = new JTextField();
			textField_210.setColumns(10);
			textField_210.setBounds(227, 320, 86, 39);
			textField_210.setEditable(false);
			textField_210.setBackground(Color.WHITE);
			frame.getContentPane().add(textField_210);

			textField_211 = new JTextField();
			textField_211.setColumns(10);
			textField_211.setBounds(311, 320, 86, 39);
			textField_211.setEditable(false);
			textField_211.setBackground(Color.WHITE);
			frame.getContentPane().add(textField_211);

			textField_212 = new JTextField();
			textField_212.setColumns(10);
			textField_212.setBounds(395, 320, 86, 39);
			textField_212.setEditable(false);
			textField_212.setBackground(Color.WHITE);
			frame.getContentPane().add(textField_212);

			textField_213 = new JTextField();
			textField_213.setColumns(10);
			textField_213.setBounds(479, 320, 86, 39);
			textField_213.setEditable(false);
			textField_213.setBackground(Color.WHITE);
			frame.getContentPane().add(textField_213);

			textField_214 = new JTextField();
			textField_214.setColumns(10);
			textField_214.setBounds(563, 320, 86, 39);
			textField_214.setEditable(false);
			textField_214.setBackground(Color.WHITE);
			frame.getContentPane().add(textField_214);

			textField_215 = new JTextField();
			textField_215.setColumns(10);
			textField_215.setBounds(647, 320, 86, 39);
			textField_215.setEditable(false);
			textField_215.setBackground(Color.WHITE);
			frame.getContentPane().add(textField_215);

			textField_216 = new JTextField();
			textField_216.setColumns(10);
			textField_216.setBounds(731, 320, 86, 39);
			textField_216.setEditable(false);
			textField_216.setBackground(Color.WHITE);
			frame.getContentPane().add(textField_216);

			textField_38 = new JTextField();
			textField_38.setColumns(10);
			textField_38.setBounds(59, 357, 86, 39);
			textField_38.setEditable(false);
			textField_38.setBackground(Color.WHITE);
			frame.getContentPane().add(textField_38);

			textField_39 = new JTextField();
			textField_39.setColumns(10);
			textField_39.setBounds(143, 357, 86, 39);
			textField_39.setEditable(false);
			textField_39.setBackground(Color.WHITE);
			frame.getContentPane().add(textField_39);

			textField_310 = new JTextField();
			textField_310.setColumns(10);
			textField_310.setBounds(227, 357, 86, 39);
			textField_310.setEditable(false);
			textField_310.setBackground(Color.WHITE);
			frame.getContentPane().add(textField_310);

			textField_311 = new JTextField();
			textField_311.setColumns(10);
			textField_311.setBounds(311, 357, 86, 39);
			textField_311.setEditable(false);
			textField_311.setBackground(Color.WHITE);
			frame.getContentPane().add(textField_311);

			textField_312 = new JTextField();
			textField_312.setColumns(10);
			textField_312.setBounds(395, 357, 86, 39);
			textField_312.setEditable(false);
			textField_312.setBackground(Color.WHITE);
			frame.getContentPane().add(textField_312);

			textField_313 = new JTextField();
			textField_313.setColumns(10);
			textField_313.setBounds(479, 357, 86, 39);
			textField_313.setEditable(false);
			textField_313.setBackground(Color.WHITE);
			frame.getContentPane().add(textField_313);

			textField_314 = new JTextField();
			textField_314.setColumns(10);
			textField_314.setBounds(563, 357, 86, 39);
			textField_314.setEditable(false);
			textField_314.setBackground(Color.WHITE);
			frame.getContentPane().add(textField_314);

			textField_315 = new JTextField();
			textField_315.setColumns(10);
			textField_315.setBounds(647, 357, 86, 39);
			textField_315.setEditable(false);
			textField_315.setBackground(Color.WHITE);
			frame.getContentPane().add(textField_315);

			textField_316 = new JTextField();
			textField_316.setColumns(10);
			textField_316.setBounds(731, 357, 86, 39);
			textField_316.setEditable(false);
			textField_316.setBackground(Color.WHITE);
			frame.getContentPane().add(textField_316);

			textField_48 = new JTextField();
			textField_48.setColumns(10);
			textField_48.setBounds(59, 394, 86, 39);
			textField_48.setEditable(false);
			textField_48.setBackground(Color.WHITE);
			frame.getContentPane().add(textField_48);

			textField_49 = new JTextField();
			textField_49.setColumns(10);
			textField_49.setBounds(143, 394, 86, 39);
			textField_49.setEditable(false);
			textField_49.setBackground(Color.WHITE);
			frame.getContentPane().add(textField_49);

			textField_410 = new JTextField();
			textField_410.setColumns(10);
			textField_410.setBounds(227, 394, 86, 39);
			textField_410.setEditable(false);
			textField_410.setBackground(Color.WHITE);
			frame.getContentPane().add(textField_410);

			textField_411 = new JTextField();
			textField_411.setColumns(10);
			textField_411.setBounds(311, 394, 86, 39);
			textField_411.setEditable(false);
			textField_411.setBackground(Color.WHITE);
			frame.getContentPane().add(textField_411);

			textField_412 = new JTextField();
			textField_412.setColumns(10);
			textField_412.setBounds(395, 394, 86, 39);
			textField_412.setEditable(false);
			textField_412.setBackground(Color.WHITE);
			frame.getContentPane().add(textField_412);

			textField_413 = new JTextField();
			textField_413.setColumns(10);
			textField_413.setBounds(479, 394, 86, 39);
			textField_413.setEditable(false);
			textField_413.setBackground(Color.WHITE);
			frame.getContentPane().add(textField_413);

			textField_414 = new JTextField();
			textField_414.setColumns(10);
			textField_414.setBounds(563, 394, 86, 39);
			textField_414.setEditable(false);
			textField_414.setBackground(Color.WHITE);
			frame.getContentPane().add(textField_414);

			textField_415 = new JTextField();
			textField_415.setColumns(10);
			textField_415.setBounds(647, 394, 86, 39);
			textField_415.setEditable(false);
			textField_415.setBackground(Color.WHITE);
			frame.getContentPane().add(textField_415);

			textField_416 = new JTextField();
			textField_416.setColumns(10);
			textField_416.setBounds(731, 394, 86, 39);
			textField_416.setEditable(false);
			textField_416.setBackground(Color.WHITE);
			frame.getContentPane().add(textField_416);

			textField_58 = new JTextField();
			textField_58.setColumns(10);
			textField_58.setBounds(59, 431, 86, 39);
			textField_58.setEditable(false);
			textField_58.setBackground(Color.WHITE);
			frame.getContentPane().add(textField_58);

			textField_59 = new JTextField();
			textField_59.setColumns(10);
			textField_59.setBounds(143, 431, 86, 39);
			textField_59.setEditable(false);
			textField_59.setBackground(Color.WHITE);
			frame.getContentPane().add(textField_59);

			textField_510 = new JTextField();
			textField_510.setColumns(10);
			textField_510.setBounds(227, 431, 86, 39);
			textField_510.setEditable(false);
			textField_510.setBackground(Color.WHITE);
			frame.getContentPane().add(textField_510);

			textField_511 = new JTextField();
			textField_511.setColumns(10);
			textField_511.setBounds(311, 431, 86, 39);
			textField_511.setEditable(false);
			textField_511.setBackground(Color.WHITE);
			frame.getContentPane().add(textField_511);

			textField_512 = new JTextField();
			textField_512.setColumns(10);
			textField_512.setBounds(395, 431, 86, 39);
			textField_512.setEditable(false);
			textField_512.setBackground(Color.WHITE);
			frame.getContentPane().add(textField_512);

			textField_513 = new JTextField();
			textField_513.setColumns(10);
			textField_513.setBounds(479, 431, 86, 39);
			textField_513.setEditable(false);
			textField_513.setBackground(Color.WHITE);
			frame.getContentPane().add(textField_513);

			textField_514 = new JTextField();
			textField_514.setColumns(10);
			textField_514.setBounds(563, 431, 86, 39);
			textField_514.setEditable(false);
			textField_514.setBackground(Color.WHITE);
			frame.getContentPane().add(textField_514);

			textField_515 = new JTextField();
			textField_515.setColumns(10);
			textField_515.setBounds(647, 431, 86, 39);
			textField_515.setEditable(false);
			textField_515.setBackground(Color.WHITE);
			frame.getContentPane().add(textField_515);

			textField_516 = new JTextField();
			textField_516.setHorizontalAlignment(SwingConstants.CENTER);
			textField_516.setColumns(10);
			textField_516.setBounds(731, 431, 86, 39);
			textField_516.setEditable(false);
			textField_516.setBackground(Color.WHITE);
			frame.getContentPane().add(textField_516);
			
			JButton btnTimeTable = new JButton("Get timetable");
			btnTimeTable.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {
					textField_18.setText("  ");
					textField_19.setText("  ");
					textField_110.setText("  ");
					textField_111.setText("  ");
					textField_112.setText("  ");
					textField_113.setText("  ");
					textField_114.setText("  ");
					textField_115.setText("  ");
					textField_116.setText("  ");
					textField_28.setText("  ");
					textField_29.setText("  ");
					textField_210.setText("  ");
					textField_211.setText("  ");
					textField_212.setText("  ");
					textField_213.setText("  ");
					textField_214.setText("  ");
					textField_215.setText("  ");
					textField_216.setText("  ");
					textField_38.setText("  ");
					textField_39.setText("  ");
					textField_310.setText("  ");
					textField_311.setText("  ");
					textField_312.setText("  ");
					textField_313.setText("  ");
					textField_314.setText(" ");
					textField_315.setText(" ");
					textField_316.setText(" ");
					textField_48.setText(" ");
					textField_49.setText(" ");
					textField_410.setText(" ");
					textField_411.setText(" ");
					textField_412.setText(" ");
					textField_413.setText(" ");
					textField_414.setText(" ");
					textField_415.setText(" ");
					textField_416.setText(" ");
					textField_58.setText(" ");
					textField_59.setText(" ");
					textField_510.setText(" ");
					textField_511.setText(" ");
					textField_512.setText(" ");
					textField_513.setText(" ");
					textField_514.setText(" ");
					textField_515.setText(" ");
					textField_516.setText(" ");
					String[][] test = null;
					Vector<String> v1 = new Vector<String> ();
					{
						v1.addElement("IT5134");
						v1.addElement("D1");
					}
					
					Vector<String> v2 = new Vector<String> ();
					{
						v2.addElement("IT5678");
						v2.addElement("SP3");
					}
					
					Vector<Vector<String>> selectedCourse=new Vector<Vector<String>>();
					{
						selectedCourse.addElement(v1);
						selectedCourse.addElement(v2);
					}
					ToTextFeild ttt = new ToTextFeild();

					try {
						test = ttt.toTextFeild(selectedCourse);
						for(int i=0; i<test.length;i++)
						{
							for(int j =0; j <test[i].length;j++)
							{
								System.out.println(test[i][j]);
							}
						}

					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					
					

					//test is a dummy data, should be sent from Bruce
					String a = null ;
					String b = null ;
					String c = null ;
					for(int i=0; i<test.length;i++)
					{
						for(int j =0; j <test[i].length;j++)
						{
							//System.out.println(test[i][j]);

									
							if(j==0)
							{
								a = test[i][j];
							System.out.println(a+" "+i+" "+j);
							}
							if(j==1)
								
							{
								b = test[i][j];
							System.out.println(b+" "+i+" "+j);
							}
							if(j==2)
							{
								c = test[i][j];
							System.out.println(c+" "+i+" "+j);
							}
						}
					

					switch (b){
						case "textField_18": textField_18.setText(a+"  "+c);
						break;
						case "textField_19": textField_19.setText(a+"  "+c);
						break;
						case "textField_110": textField_110.setText(a+"  "+c);
						break;
						case "textField_111": textField_111.setText(a+"  "+c);
						break;
						case "textField_112": textField_112.setText(a+"  "+c);
						break;
						case "textField_113": textField_113.setText(a+"  "+c);
						break;
						case "textField_114": textField_114.setText(a+"  "+c);
						break;
						case "textField_115": textField_115.setText(a+"  "+c);
						break;
						case "textField_116": textField_116.setText(a+"  "+c);
						break;
						case "textField_28": textField_28.setText(a+"  "+c);
						break;
						case "textField_29": textField_29.setText(a+"  "+c);
						break;
						case "textField_210": textField_210.setText(a+"  "+c);
						break;
						case "textField_211": textField_211.setText(a+"  "+c);
						break;
						case "textField_212": textField_212.setText(a+"  "+c);
						break;
						case "textField_213": textField_213.setText(a+"  "+c);
						break;
						case "textField_214": textField_214.setText(a+"  "+c);
						break;
						case "textField_215": textField_215.setText(a+"  "+c);
						break;
						case "textField_216": textField_216.setText(a+"  "+c);
						break;
						case "textField_38": textField_38.setText(a+"  "+c);
						break;
						case "textField_39": textField_39.setText(a+"  "+c);
						break;
						case "textField_310": textField_310.setText(a+"  "+c);
						break;
						case "textField_311": textField_311.setText(a+"  "+c);
						break;
						case "textField_312": textField_312.setText(a+"  "+c);
						break;
						case "textField_313": textField_313.setText(a+"  "+c);
						break;
						case "textField_314": textField_314.setText(a+"  "+c);
						break;
						case "textField_315": textField_315.setText(a+"  "+c);
						break;
						case "textField_316": textField_316.setText(a+"  "+c);
						break;
						case "textField_48": textField_48.setText(a+"  "+c);
						break;
						case "textField_49": textField_49.setText(a+"  "+c);
						break;
						case "textField_410": textField_410.setText(a+"  "+c);
						break;
						case "textField_411": textField_411.setText(a+"  "+c);
						break;
						case "textField_412": textField_412.setText(a+"  "+c);
						break;
						case "textField_413": textField_413.setText(a+"  "+c);
						break;
						case "textField_414": textField_414.setText(a+"  "+c);
						break;
						case "textField_415": textField_415.setText(a+"  "+c);
						break;
						case "textField_416": textField_416.setText(a+"  "+c);
						break;
						case "textField_58": textField_58.setText(a+"  "+c);
						break;
						case "textField_59": textField_59.setText(a+"  "+c);
						break;
						case "textField_510": textField_510.setText(a+"  "+c);
						break;
						case "textField_511": textField_511.setText(a+"  "+c);
						break;
						case "textField_512": textField_512.setText(a+"  "+c);
						break;
						case "textField_513": textField_513.setText(a+"  "+c);
						break;
						case "textField_514": textField_514.setText(a+"  "+c);
						break;
						case "textField_515": textField_515.setText(a+"  "+c);
						break;
						case "textField_516": textField_516.setText(a+"  "+c);
						break;
	        			}
					
					}
					
				}
			});

			btnTimeTable.setBounds(587, 99, 122, 24);
			frame.getContentPane().add(btnTimeTable);
			
		}
	 
	 
	
	
	public void stream() {
		
		cBoxStream.setBounds(474, 7, 91, 24);
		frame.getContentPane().add(cBoxStream);
		
	}
 	 
	
	//initial JTable
	public void initTable(){
		
		Object[] columnTitle = {"Course","Stream"};
	    JScrollPane scrollPane = new JScrollPane();
	    scrollPane.setBounds(59, 62, 472, 99);
	    frame.getContentPane().add(scrollPane);
	    
	    table = new JTable();
	    scrollPane.setViewportView(table);
	    
	   
	    dtm = (DefaultTableModel)table.getModel();
	    dtm.setColumnIdentifiers(columnTitle);
	   
	  
	}

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tinterface window = new Tinterface();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
		
	}

	/**
	 * Create the application.
	 */
	public Tinterface() {
		
		initialize();
		course();
		stream();
		initTable();
		table();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 862, 558);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel levelLable = new JLabel("Level");
		levelLable.setBounds(29, 12, 60, 15);
		levelLable.setVerticalAlignment(SwingConstants.TOP);
		frame.getContentPane().add(levelLable);
		
		JLabel lblCourse = new JLabel("Course");
		lblCourse.setBounds(198, 12, 60, 15);
		frame.getContentPane().add(lblCourse);
		
		
		
		//define event when level is selected
		cBoxLevel.addItemListener(new ItemListener() {
		 
			public void itemStateChanged(ItemEvent e) {
				 if(e.getStateChange() == ItemEvent.SELECTED) {
			 
				SelectCourse SC = new SelectCourse();
			    selectLevel = (String) cBoxLevel.getSelectedItem();
			    list.clear();
			    list.addAll(SC.matchLevel(selectLevel));

			  
			    int l = list.size();
			    cBoxCourse.removeAllItems();
			    
			    for (String s: list) {
			    	
			  
			    cBoxCourse.addItem(s);
			   
			     }

		

				 }
			}
		});
	

		
		cBoxLevel.setBounds(94, 7, 94, 24);
		frame.getContentPane().add(cBoxLevel);
		
		

		JLabel lblStream = new JLabel("Stream");
		lblStream.setBounds(404, 12, 60, 15);
		frame.getContentPane().add(lblStream);
		
		
		
		JButton btnAddToTimetable = new JButton("Add to TimeTable");
		//define event for button "add to time table"
		btnAddToTimetable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			    
				
			    Vector sc = new Vector();
			    
			    int s = selectedCourse.size();
				
				sc.add(cBoxCourse.getSelectedItem());
				sc.add(cBoxStream.getSelectedItem());
				
			    //can only selected 5 courses at most
				if(s<5) {
					if(selectedCourse.contains(sc)) {
						
						JOptionPane.showMessageDialog(null, "this course already exists in the timetable");
						
					}
				 else{
						dtm.addRow(sc);
						//System.out.print(sc);
						selectedCourse.add(sc); 
					
				  }
				}
			
				
				else {
					JOptionPane.showMessageDialog(null, "You can only selected 5 courses ");
				}
		
			}
		});
		
		btnAddToTimetable.setBounds(611, 7, 145, 25);
		frame.getContentPane().add(btnAddToTimetable);
		
		
		 JButton btnDelete = new JButton("Delete course");
		    btnDelete.addMouseListener(new MouseAdapter() {
		    	@Override
		    	
		    	//delete selected course
		    	public void mouseClicked(MouseEvent e) {
		    		
		    		int row = table.getSelectedRow() ;
		    		dtm.removeRow(row);
		    		selectedCourse.remove(row);
		  
		    		
		    	}
		    });
		    btnDelete.setBounds(587, 62, 122, 25);
		    frame.getContentPane().add(btnDelete);
		   


	}
}
