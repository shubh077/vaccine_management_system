package com.vms.service;
import com.vms.dao.DatabaseOperation;
import com.vms.dao.Logindb;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.JPasswordField;
public class LogIn extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField username;
	private JPasswordField pwField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogIn frame = new LogIn();
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
	public LogIn() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setToolTipText("username");
		contentPane.setBackground(Color.MAGENTA);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		username = new JTextField();
		username.setFont(new Font("Tahoma", Font.BOLD, 16));
		username.setToolTipText("username");
		username.setBounds(214, 70, 172, 28);
		contentPane.add(username);
		username.setColumns(10);
		
		JLabel L_Username = new JLabel("UserName :");
		L_Username.setForeground(SystemColor.inactiveCaptionText);
		L_Username.setFont(new Font("Tahoma", Font.BOLD, 18));
		L_Username.setBounds(47, 65, 106, 33);
		contentPane.add(L_Username);
		
		pwField = new JPasswordField();
		pwField.setBounds(214, 124, 172, 27);
		contentPane.add(pwField);
		
		JLabel L_Password = new JLabel("Password :");
		L_Password.setForeground(SystemColor.inactiveCaptionText);
		L_Password.setFont(new Font("Tahoma", Font.BOLD, 18));
		L_Password.setBounds(47, 124, 125, 29);
		contentPane.add(L_Password);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GREEN);
		panel.setBounds(10, 11, 414, 33);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Log In");
		lblNewLabel.setForeground(SystemColor.inactiveCaptionText);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(171, 0, 119, 33);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("LOG IN");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean valusern,valusern2,valpass,valpass2,boolean1;
				String uname = username.getText();
				String pass = new String( pwField.getPassword());
				Logindb lb1=new Logindb();
				boolean1=lb1.SelectStatement(uname, pass);
				valpass = pwField.getPassword().equals("");
				valusern = username.getText().equals("");
				if(boolean1==true)
				{
					Dashboard db = new Dashboard();
					db.setVisible(true);
					setVisible(false);
					//JOptionPane.showMessageDialog(null, "Log In Succesfull");
				}
				else 
				{
					JOptionPane.showMessageDialog(null,"Invalid email or password!");
				}
			}
		});
		btnNewButton.setBounds(170, 206, 117, 33);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Shubham\\Pictures\\shub.png"));
		lblNewLabel_1.setBounds(0, 0, 436, 263);
		contentPane.add(lblNewLabel_1);
		
		
			}
	}

		
