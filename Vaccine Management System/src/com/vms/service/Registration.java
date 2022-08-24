package com.vms.service;
import com.vms.dao.DatabaseOperation;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import com.toedter.calendar.JDateChooser;
import javax.swing.ButtonGroup;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.border.MatteBorder;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;

public class Registration extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField firstName;
	private JTextField middleName;
	private JTextField lastName;
	private JTextField phoneNo;
	private JTextField emailID;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	@SuppressWarnings("unused")
	private final Action action = new SwingAction();
	private JTextField password;
	private JTextField cpassword_t;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration frame = new Registration();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Registration() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600, 600, 1241, 696);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new MatteBorder(4, 4, 4, 4, (Color) Color.CYAN));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.BLACK, 3));
		panel.setBackground(Color.YELLOW);
		panel.setBounds(208, 11, 496, 59);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Register Yourself");
		lblNewLabel.setForeground(SystemColor.inactiveCaptionText);
		lblNewLabel.setFont(new Font("Book Antiqua", Font.BOLD, 30));
		lblNewLabel.setBounds(140, 0, 262, 60);
		panel.add(lblNewLabel);
		
		firstName = new JTextField();
		firstName.setBorder(new LineBorder(Color.BLACK, 2));
		firstName.setFont(new Font("Tahoma", Font.BOLD, 16));
		firstName.setBounds(115, 185, 156, 30);
		contentPane.add(firstName);
		firstName.setColumns(10);
		
		middleName = new JTextField();
		middleName.setBorder(new LineBorder(Color.BLACK, 2));
		middleName.setFont(new Font("Tahoma", Font.BOLD, 16));
		middleName.setColumns(10);
		middleName.setBounds(406, 186, 156, 28);
		contentPane.add(middleName);
		
		lastName = new JTextField();
		lastName.setBorder(new LineBorder(Color.BLACK, 2));
		lastName.setFont(new Font("Tahoma", Font.BOLD, 16));
		lastName.setBackground(new Color(255, 255, 255));
		lastName.setColumns(10);
		lastName.setBounds(703, 185, 156, 30);
		contentPane.add(lastName);
		
		phoneNo = new JTextField();
		phoneNo.setBorder(new LineBorder(Color.BLACK, 2));
		phoneNo.setFont(new Font("Tahoma", Font.BOLD, 16));
		phoneNo.setColumns(10);
		phoneNo.setBounds(406, 331, 156, 30);
		contentPane.add(phoneNo);
		
		emailID = new JTextField();
		emailID.setBorder(new LineBorder(Color.BLACK, 2));
		emailID.setFont(new Font("Tahoma", Font.BOLD, 16));
		emailID.setColumns(10);
		emailID.setBounds(115, 462, 156, 32);
		contentPane.add(emailID);
		
		password = new JTextField();
		password.setBorder(new LineBorder(Color.BLACK, 2));
		password.setFont(new Font("Tahoma", Font.BOLD, 16));
		password.setBounds(406, 463, 156, 30);
		contentPane.add(password);
		password.setColumns(10);
		
		
		cpassword_t = new JTextField();
		cpassword_t.setBorder(new LineBorder(Color.BLACK, 2));
		cpassword_t.setFont(new Font("Tahoma", Font.BOLD, 16));
		cpassword_t.setBounds(703, 463, 156, 30);
		contentPane.add(cpassword_t);
		cpassword_t.setColumns(10);
		
		JLabel password_l = new JLabel("Password :");
		password_l.setBorder(new LineBorder(Color.BLACK, 3));
		password_l.setHorizontalAlignment(SwingConstants.CENTER);
		password_l.setForeground(SystemColor.inactiveCaptionText);
		password_l.setFont(new Font("Calisto MT", Font.BOLD, 20));
		password_l.setBounds(301, 414, 127, 38);
		contentPane.add(password_l);
		
		JLabel cPassword_l = new JLabel("confrim Password :");
		cPassword_l.setBorder(new LineBorder(Color.BLACK, 3));
		cPassword_l.setHorizontalAlignment(SwingConstants.CENTER);
		cPassword_l.setForeground(SystemColor.inactiveCaptionText);
		cPassword_l.setFont(new Font("Calisto MT", Font.BOLD, 20));
		cPassword_l.setBounds(612, 414, 189, 38);
		contentPane.add(cPassword_l);
		
		JLabel lblNewLabel_1 = new JLabel("First Name :");
		lblNewLabel_1.setBorder(new LineBorder(Color.BLACK, 3));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(SystemColor.menuText);
		lblNewLabel_1.setFont(new Font("Calisto MT", Font.BOLD, 20));
		lblNewLabel_1.setBounds(30, 128, 141, 37);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Middle Name:\r\n");
		lblNewLabel_2.setBorder(new LineBorder(Color.BLACK, 3));
		lblNewLabel_2.setForeground(SystemColor.windowText);
		lblNewLabel_2.setFont(new Font("Calisto MT", Font.BOLD, 20));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(287, 127, 141, 38);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Last Name :");
		lblNewLabel_2_1.setBorder(new LineBorder(Color.BLACK, 3));
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setForeground(SystemColor.windowText);
		lblNewLabel_2_1.setFont(new Font("Calisto MT", Font.BOLD, 20));
		lblNewLabel_2_1.setBounds(581, 127, 141, 38);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Phone No :");
		lblNewLabel_2_2.setBorder(new LineBorder(Color.BLACK, 3));
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2.setForeground(SystemColor.inactiveCaptionText);
		lblNewLabel_2_2.setFont(new Font("Calisto MT", Font.BOLD, 20));
		lblNewLabel_2_2.setBounds(301, 263, 127, 40);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("E-mail ID :");
		lblNewLabel_2_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_3.setBorder(new LineBorder(Color.BLACK, 3));
		lblNewLabel_2_3.setForeground(Color.BLACK);
		lblNewLabel_2_3.setFont(new Font("Calisto MT", Font.BOLD, 20));
		lblNewLabel_2_3.setBounds(30, 413, 141, 38);
		contentPane.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("DOB :");
		lblNewLabel_2_4.setBorder(new LineBorder(Color.BLACK, 3));
		lblNewLabel_2_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_4.setForeground(SystemColor.inactiveCaptionText);
		lblNewLabel_2_4.setFont(new Font("Calisto MT", Font.BOLD, 20));
		lblNewLabel_2_4.setBounds(30, 265, 66, 37);
		contentPane.add(lblNewLabel_2_4);
		
		
		
		JLabel lblNewLabel_3 = new JLabel("Gender :");
		lblNewLabel_3.setBorder(new LineBorder(Color.BLACK, 3));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(SystemColor.inactiveCaptionText);
		lblNewLabel_3.setFont(new Font("Calisto MT", Font.BOLD, 20));
		lblNewLabel_3.setBounds(607, 264, 117, 38);
		contentPane.add(lblNewLabel_3);
	
		
		
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBorder(new LineBorder(Color.BLACK, 2));
		dateChooser.setDateFormatString("yyyy-mm-dd");
		dateChooser.setBounds(115, 331, 156, 30);
		contentPane.add(dateChooser);
		
		JRadioButton female = new JRadioButton("female");
		female.setFont(new Font("Calisto MT", Font.BOLD, 20));
		buttonGroup.add(female);
		female.setBounds(703, 354, 156, 31);
		contentPane.add(female);
		
		JRadioButton male = new JRadioButton("male");
		male.setBorder(new LineBorder(Color.BLACK, 2));
		male.setFont(new Font("Calisto MT", Font.BOLD, 20));
		buttonGroup.add(male);
		male.setBounds(703, 319, 156, 28);
		contentPane.add(male);
		
		JLabel lblNewLabel_4 = new JLabel("incorrect ph no");
		lblNewLabel_4.setBounds(328, 314, 100, 20);
		contentPane.add(lblNewLabel_4);
		lblNewLabel_4.setText("");
		lblNewLabel_4.setVisible(false);
		
		JLabel lblNewLabel_5 = new JLabel("incorrect email");
		lblNewLabel_5.setBounds(171, 420, 78, 20);
		contentPane.add(lblNewLabel_5);
		lblNewLabel_5.setText("");
		lblNewLabel_5.setVisible(false);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.setBorder(new LineBorder(Color.BLACK, 3, true));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setForeground(SystemColor.inactiveCaptionText);
		btnNewButton.setBackground(Color.YELLOW);
		btnNewButton.setFont(new Font("Calisto MT", Font.BOLD, 25));
		btnNewButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				boolean f1,f2;
				Pattern ptr=Pattern.compile("(0/91)?[7-9][0-9]{9}");
				Matcher match=ptr.matcher(phoneNo.getText());
				if(!(match.find()&& match.group().equals(phoneNo.getText()))){
					lblNewLabel_4.setText("incorrect ph no");
					lblNewLabel_4.setVisible(true);
					f1=false;
				}else {
					f1=true;
				}
				ptr=Pattern.compile("[a-zA-Z0-9]{3,20}@[A-Za-z]{3,10}.(com|in)");
				match=ptr.matcher(emailID.getText());
				if(!(match.find()&& match.group().equals(emailID.getText()))){
					lblNewLabel_5.setText("incorrect email");
					lblNewLabel_5.setVisible(true);
					f2=false;
				}else {
					f2=true;
				}
				if(f1&&f2) {
					
					
					LogIn Ip=new LogIn();
					Ip.setVisible(true);
					setVisible(false);
					String f_name=firstName.getText();
					String m_name=middleName.getText();
					String l_name=lastName.getText();
					//String d_o_b=dateChooser.getDateFormatString();
					String mobile_no = phoneNo.getText();
					String e_mail = emailID.getText();
					String DOB=dateChooser.getDate().toString();
					String gender;
					if(male.isSelected()) {
						gender = "Male";
					} else
						gender = "Female";
					String password=cpassword_t.getText();
					DatabaseOperation db=new DatabaseOperation();
					db.Jdbc(f_name, m_name, l_name,mobile_no,e_mail,DOB,gender,password);
					
 					
				}
				
				
			}
		});
		btnNewButton.setBounds(339, 536, 223, 53);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 0)));
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\Shubham\\Downloads\\4.jpg"));
		lblNewLabel_6.setBounds(0, 1, 895, 658);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 0)));
		lblNewLabel_8.setIcon(new ImageIcon("C:\\Users\\Shubham\\Pictures\\17100050-3d-people-man-person-with-clipboard-and-checklist-.jpg"));
		lblNewLabel_8.setBounds(891, 0, 336, 658);
		contentPane.add(lblNewLabel_8);
		
		
	
		
	
		
	}
	private class SwingAction extends AbstractAction {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
