package com.panel.dash;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

import com.vms.dao.SelectOperation;

import java.awt.Color;
import java.awt.Label;
import java.awt.Font;
import java.awt.TextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class PanelView extends JPanel {
	private JTextField aadharNo;

	/**
	 * Create the panel.
	 */
	public PanelView() {
		setBorder(new LineBorder(new Color(0, 0, 0), 3));
		setFont(new Font("Tahoma", Font.BOLD, 20));
		setBackground(new Color(0, 255, 255));
		setBounds(0, 0, 825, 700);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Vaccine Name :");
		lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 27));
		lblNewLabel.setBounds(182, 215, 224, 46);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Adhar No :");
		lblNewLabel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 27));
		lblNewLabel_1.setBounds(254, 135, 152, 38);
		add(lblNewLabel_1);
		
		aadharNo = new JTextField();
		aadharNo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		aadharNo.setBorder(new LineBorder(new Color(171, 173, 179), 3));
		aadharNo.setColumns(10);
		aadharNo.setBounds(472, 135, 250, 43);
		add(aadharNo);
		
		JLabel lblVaccinationCenter = new JLabel("Vaccination Center :");
		lblVaccinationCenter.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblVaccinationCenter.setFont(new Font("Tahoma", Font.BOLD, 27));
		lblVaccinationCenter.setBounds(117, 298, 289, 46);
		add(lblVaccinationCenter);
		
		JLabel lblNewLabel_1_1 = new JLabel("Date :");
		lblNewLabel_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 27));
		lblNewLabel_1_1.setBounds(306, 393, 100, 46);
		add(lblNewLabel_1_1);
		
		JLabel lblViewAppointment = new JLabel("View appointment");
		lblViewAppointment.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		lblViewAppointment.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblViewAppointment.setBounds(278, 28, 298, 46);
		add(lblViewAppointment);
		
		JLabel vac_name = new JLabel("");
		vac_name.setFont(new Font("Tahoma", Font.PLAIN, 20));
		vac_name.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		vac_name.setBounds(472, 222, 250, 46);
		add(vac_name);
		
		JLabel vac_center = new JLabel("");
		vac_center.setFont(new Font("Tahoma", Font.PLAIN, 20));
		vac_center.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		vac_center.setBounds(472, 298, 250, 46);
		add(vac_center);
		
		JLabel date = new JLabel("");
		date.setFont(new Font("Tahoma", Font.PLAIN, 20));
		date.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		date.setBounds(472, 393, 250, 46);
		add(date);
		
		JButton btnNewButton = new JButton("Go");
		btnNewButton.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SelectOperation so = new SelectOperation();
				ArrayList<String> al = new ArrayList<String>(); 
				System.out.println(aadharNo.getText());
				al = so.select_appointment_details(aadharNo.getText());
//				System.out.println(so.select_appointment_details(aadharNo.getText()));
				date.setText(al.get(0));
				vac_name.setText(al.get(1));
				vac_center.setText(al.get(2));
				System.out.println(al);
			}
		});
			
		
		btnNewButton.setBounds(373, 494, 141, 46);
		add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Shubham\\Downloads\\IMG_20220820_191435.jpg"));
		lblNewLabel_2.setBounds(0, 0, 825, 700);
		add(lblNewLabel_2);

	}
}
