package com.panel.dash;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import com.toedter.calendar.JDateChooser;
import com.utility.dao.email_notification;
import com.vms.dao.DatabaseOperation;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelShedule extends JPanel {
	private JTextField adharNo;
	private JTextField email;

	/**
	 * Create the panel.
	 */
	public PanelShedule() {
		setBackground(new Color(0, 255, 255));
		setBorder(new LineBorder(new Color(0, 0, 0), 4));
		setBounds(0, 0, 826, 693);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Adhar No :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 27));
		lblNewLabel.setBounds(402, 202, 152, 41);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Vaccine Name :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 27));
		lblNewLabel_1.setBounds(341, 279, 213, 41);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Vaccination Centre :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 27));
		lblNewLabel_2.setBounds(275, 365, 277, 41);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Date :");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 27));
		lblNewLabel_3.setBounds(459, 451, 93, 41);
		add(lblNewLabel_3);
		
		adharNo = new JTextField();
		adharNo.setBorder(new LineBorder(new Color(171, 173, 179), 2));
		adharNo.setFont(new Font("Tahoma", Font.BOLD, 15));
		adharNo.setBounds(578, 202, 238, 41);
		add(adharNo);
		adharNo.setColumns(10);
		
		JComboBox vac_name = new JComboBox();
		vac_name.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		vac_name.setFont(new Font("Tahoma", Font.PLAIN, 20));
		vac_name.setModel(new DefaultComboBoxModel(new String[] {"Covaxin Vaccine.", "Covishield Vaccine."}));
		vac_name.setBounds(578, 283, 238, 38);
		add(vac_name);
		
		JComboBox vac_center = new JComboBox();
		vac_center.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		vac_center.setFont(new Font("Tahoma", Font.PLAIN, 20));
		vac_center.setModel(new DefaultComboBoxModel(new String[] {"City Hospital, Solapur...", "Jehangir Hospital, Pune....", "Sahyadri Hospital, Pune....", "Government Hospital, Kurduvadi"}));
		vac_center.setBounds(578, 369, 238, 38);
		add(vac_center);
		
		JDateChooser Date = new JDateChooser();
		Date.setFont(new Font("Tahoma", Font.BOLD, 22));
		Date.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		Date.setBounds(578, 451, 238, 41);
		add(Date);
		
		JLabel lblNewLabel_4 = new JLabel("Book Vaccination");
		lblNewLabel_4.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		lblNewLabel_4.setForeground(new Color(0, 0, 0));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_4.setBounds(422, 11, 277, 41);
		add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("Book Vaccine");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Registered Successfully!");
				String adharno=adharNo.getText();
				String date = Date.getDate().toString();
				//String VaccineChoose=(buttonGroup.getSelection().getActionCommand());
				String vaccine = (String) vac_name.getSelectedItem();
				String center=(String) vac_center.getSelectedItem();
				DatabaseOperation db = new DatabaseOperation();
				db.appointment(adharno,date,vaccine,center) ;
				email_notification en = new email_notification();
				en.sendAppointmentBookedMail(email.getText());
				JOptionPane.showMessageDialog(null, "Slot Booked Successfully\nCheck your mail for confirmation", "Success",
						JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnNewButton.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton.setBounds(422, 548, 264, 48);
		add(btnNewButton);
		
		
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBounds(47, 545, 32, -38);
		add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\Shubham\\Pictures\\Covaxin1.jpg"));
		lblNewLabel_6.setBounds(0, 0, 264, 693);
		add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("email :");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 27));
		lblNewLabel_7.setBounds(453, 120, 101, 41);
		add(lblNewLabel_7);
		
		email = new JTextField();
		email.setFont(new Font("Tahoma", Font.PLAIN, 20));
		email.setColumns(10);
		email.setBorder(new LineBorder(new Color(171, 173, 179), 2));
		email.setBounds(588, 123, 238, 41);
		add(email);

	}
}
