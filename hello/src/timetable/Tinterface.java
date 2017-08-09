package timetable;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.List;
import javax.swing.BoxLayout;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JList;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class Tinterface {

	private JFrame frame;
	String selectLevel;
     ArrayList<String> list = new ArrayList();
    
    String[] cString  = { "please select level"};
     JComboBox cBoxCourse = new JComboBox(cString);
     private JTextField textField;
     private JTextField textField_1;
     private JTextField textField_2;
     private JTextField textField_3;
     private JTextField textField_4;
     private JTextField textField_10;
     private JTextField textField_11;
     private JTextField textField_12;
     private JTextField textField_5;
     private JTextField textField_6;
     private JTextField textField_7;
     private JTextField textField_8;
     private JTextField textField_9;
     private JTextField textField_13;
     private JTextField textField_14;
     private JTextField textField_15;
     private JTextField textField_16;
     private JTextField textField_17;
     private JTextField textField_18;
     private JLabel lblWednesday;
     private JTextField textField_19;
     private JTextField textField_20;
     private JTextField textField_21;
     private JTextField textField_22;
     private JTextField textField_23;
     private JTextField textField_24;
     private JTextField textField_25;
     private JTextField textField_26;
     private JTextField textField_27;
     private JLabel lblThu;
     private JTextField textField_28;
     private JTextField textField_29;
     private JTextField textField_30;
     private JTextField textField_31;
     private JTextField textField_32;
     private JTextField textField_33;
     private JTextField textField_34;
     private JTextField textField_35;
     private JTextField textField_36;
     private JLabel lblFri;
     private JTextField textField_37;
     private JTextField textField_38;
     private JTextField textField_39;
     private JTextField textField_40;
     private JTextField textField_41;
     private JTextField textField_42;
     private JTextField textField_43;
     private JTextField textField_44;
     private JLabel label_1;
     private JLabel label_2;
     private JLabel label_3;
     private JLabel label_4;
     private JLabel label_5;
     private JLabel label_6;
     private JLabel label_7;
     private JLabel label_8;
 	 
 	
	public void course() {
		cBoxCourse.setToolTipText("123");
		cBoxCourse.setBounds(236, 7, 120, 24);
		frame.getContentPane().add(cBoxCourse);
		
		textField = new JTextField();
		textField.setBounds(58, 172, 86, 39);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(143, 172, 86, 39);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(227, 172, 86, 39);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(311, 172, 86, 39);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(396, 172, 86, 39);
		frame.getContentPane().add(textField_4);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(481, 172, 86, 39);
		frame.getContentPane().add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(566, 172, 86, 39);
		frame.getContentPane().add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(651, 172, 86, 39);
		frame.getContentPane().add(textField_12);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(736, 172, 86, 39);
		frame.getContentPane().add(textField_5);
		
		JLabel lblMonday = new JLabel("Mon");
		lblMonday.setHorizontalAlignment(SwingConstants.CENTER);
		lblMonday.setBounds(12, 184, 46, 14);
		frame.getContentPane().add(lblMonday);
		
		JLabel label = new JLabel("8:00-9:00");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(59, 147, 86, 14);
		frame.getContentPane().add(label);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(58, 209, 86, 39);
		frame.getContentPane().add(textField_6);
		
		JLabel lblTuesday = new JLabel("Tue");
		lblTuesday.setHorizontalAlignment(SwingConstants.CENTER);
		lblTuesday.setBounds(12, 221, 46, 14);
		frame.getContentPane().add(lblTuesday);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(143, 209, 86, 39);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(227, 209, 86, 39);
		frame.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(311, 209, 86, 39);
		frame.getContentPane().add(textField_9);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(396, 209, 86, 39);
		frame.getContentPane().add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(481, 209, 86, 39);
		frame.getContentPane().add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(566, 209, 86, 39);
		frame.getContentPane().add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(651, 209, 86, 39);
		frame.getContentPane().add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(736, 209, 86, 39);
		frame.getContentPane().add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(58, 246, 86, 39);
		frame.getContentPane().add(textField_18);
		
		lblWednesday = new JLabel("Wed");
		lblWednesday.setHorizontalAlignment(SwingConstants.CENTER);
		lblWednesday.setBounds(12, 258, 46, 14);
		frame.getContentPane().add(lblWednesday);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(143, 246, 86, 39);
		frame.getContentPane().add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(227, 246, 86, 39);
		frame.getContentPane().add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(311, 246, 86, 39);
		frame.getContentPane().add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(396, 246, 86, 39);
		frame.getContentPane().add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(481, 246, 86, 39);
		frame.getContentPane().add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(566, 246, 86, 39);
		frame.getContentPane().add(textField_24);
		
		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBounds(651, 246, 86, 39);
		frame.getContentPane().add(textField_25);
		
		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBounds(736, 246, 86, 39);
		frame.getContentPane().add(textField_26);
		
		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBounds(58, 283, 86, 39);
		frame.getContentPane().add(textField_27);
		
		lblThu = new JLabel("Thu");
		lblThu.setHorizontalAlignment(SwingConstants.CENTER);
		lblThu.setBounds(12, 295, 46, 14);
		frame.getContentPane().add(lblThu);
		
		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBounds(143, 283, 86, 39);
		frame.getContentPane().add(textField_28);
		
		textField_29 = new JTextField();
		textField_29.setColumns(10);
		textField_29.setBounds(227, 283, 86, 39);
		frame.getContentPane().add(textField_29);
		
		textField_30 = new JTextField();
		textField_30.setColumns(10);
		textField_30.setBounds(311, 283, 86, 39);
		frame.getContentPane().add(textField_30);
		
		textField_31 = new JTextField();
		textField_31.setColumns(10);
		textField_31.setBounds(396, 283, 86, 39);
		frame.getContentPane().add(textField_31);
		
		textField_32 = new JTextField();
		textField_32.setColumns(10);
		textField_32.setBounds(481, 283, 86, 39);
		frame.getContentPane().add(textField_32);
		
		textField_33 = new JTextField();
		textField_33.setColumns(10);
		textField_33.setBounds(566, 283, 86, 39);
		frame.getContentPane().add(textField_33);
		
		textField_34 = new JTextField();
		textField_34.setColumns(10);
		textField_34.setBounds(651, 283, 86, 39);
		frame.getContentPane().add(textField_34);
		
		textField_35 = new JTextField();
		textField_35.setColumns(10);
		textField_35.setBounds(736, 283, 86, 39);
		frame.getContentPane().add(textField_35);
		
		textField_36 = new JTextField();
		textField_36.setColumns(10);
		textField_36.setBounds(58, 320, 86, 39);
		frame.getContentPane().add(textField_36);
		
		lblFri = new JLabel("Fri");
		lblFri.setHorizontalAlignment(SwingConstants.CENTER);
		lblFri.setBounds(12, 332, 46, 14);
		frame.getContentPane().add(lblFri);
		
		textField_37 = new JTextField();
		textField_37.setColumns(10);
		textField_37.setBounds(143, 320, 86, 39);
		frame.getContentPane().add(textField_37);
		
		textField_38 = new JTextField();
		textField_38.setColumns(10);
		textField_38.setBounds(227, 320, 86, 39);
		frame.getContentPane().add(textField_38);
		
		textField_39 = new JTextField();
		textField_39.setColumns(10);
		textField_39.setBounds(311, 320, 86, 39);
		frame.getContentPane().add(textField_39);
		
		textField_40 = new JTextField();
		textField_40.setColumns(10);
		textField_40.setBounds(396, 320, 86, 39);
		frame.getContentPane().add(textField_40);
		
		textField_41 = new JTextField();
		textField_41.setColumns(10);
		textField_41.setBounds(481, 320, 86, 39);
		frame.getContentPane().add(textField_41);
		
		textField_42 = new JTextField();
		textField_42.setColumns(10);
		textField_42.setBounds(566, 320, 86, 39);
		frame.getContentPane().add(textField_42);
		
		textField_43 = new JTextField();
		textField_43.setColumns(10);
		textField_43.setBounds(651, 320, 86, 39);
		frame.getContentPane().add(textField_43);
		
		textField_44 = new JTextField();
		textField_44.setColumns(10);
		textField_44.setBounds(736, 320, 86, 39);
		frame.getContentPane().add(textField_44);
		
		label_1 = new JLabel("9:00-10:00");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(143, 147, 86, 14);
		frame.getContentPane().add(label_1);
		
		label_2 = new JLabel("10:00-11:00");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(227, 147, 86, 14);
		frame.getContentPane().add(label_2);
		
		label_3 = new JLabel("11:00-12:00");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBounds(311, 147, 86, 14);
		frame.getContentPane().add(label_3);
		
		label_4 = new JLabel("12:00-13:00");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setBounds(396, 147, 86, 14);
		frame.getContentPane().add(label_4);
		
		label_5 = new JLabel("13:00-14:00");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setBounds(481, 147, 86, 14);
		frame.getContentPane().add(label_5);
		
		label_6 = new JLabel("14:00-15:00");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setBounds(566, 147, 86, 14);
		frame.getContentPane().add(label_6);
		
		label_7 = new JLabel("15:00-16:00");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setBounds(651, 147, 86, 14);
		frame.getContentPane().add(label_7);
		
		label_8 = new JLabel("16:00-17:00");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setBounds(736, 147, 86, 14);
		frame.getContentPane().add(label_8);
    
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
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 1057, 582);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel levelLable = new JLabel("Level");
		levelLable.setBounds(12, 12, 60, 15);
		levelLable.setVerticalAlignment(SwingConstants.TOP);
		frame.getContentPane().add(levelLable);
		
		JLabel lblCourse = new JLabel("Course");
		lblCourse.setBounds(182, 12, 60, 15);
		frame.getContentPane().add(lblCourse);
		
		
		String[] levelNum = {"5", "6", "7"};
		JComboBox cBoxLevel = new JComboBox(levelNum);
		cBoxLevel.addItemListener(new ItemListener() {
		 
			public void itemStateChanged(ItemEvent e) {
				 if(e.getStateChange() == ItemEvent.SELECTED) {
			 
				SelectCourse SC = new SelectCourse();
			    selectLevel = (String) cBoxLevel.getSelectedItem();
			    list.clear();
			    list.addAll(SC.matchLevel(selectLevel));

			    course();
			    cBoxCourse.removeAllItems();
			    for (String s:list){			    
			    cBoxCourse.addItem(s);
			    }
//			    System.out.println(list);
			}
		}
	});
	

		
		cBoxLevel.setBounds(59, 7, 94, 24);
		frame.getContentPane().add(cBoxLevel);
		
		
	//JComboBox cBoxCourse = new JComboBox();
		/*cBoxCourse.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED)
				cBoxCourse.addItem(list);
				//System.out.print(list);
			}
			
		});*/
	/*	cBoxCourse.setToolTipText("");
		cBoxCourse.setBounds(236, 7, 94, 24);
		frame.getContentPane().add(cBoxCourse);
		cBoxCourse.addItem("please select level");*/
		
		JLabel lblStream = new JLabel("Stream");
		lblStream.setBounds(400, 12, 60, 15);
		frame.getContentPane().add(lblStream);
				
		JComboBox cBoxStream = new JComboBox();
		cBoxStream.setBounds(453, 7, 91, 24);
		frame.getContentPane().add(cBoxStream);
	}
}
