package com.srivastava.basics;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
					Login frame = new Login();
					frame.setVisible(true);
				
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		textField = new JTextField();
		textField.setBounds(158, 19, 208, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(156, 75, 210, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Userid");
		lblNewLabel.setBounds(32, 24, 61, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(32, 85, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				callHelper();
			}
		});
		btnLogin.setBounds(36, 157, 117, 29);
		contentPane.add(btnLogin);
		
		JButton btnNewButton = new JButton("Clear");
		btnNewButton.setBounds(178, 157, 117, 29);
		contentPane.add(btnNewButton);
	}
	private void callHelper(){
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Helper helper = (Helper)context.getBean("helper");
		LoginDTO loginDTO = (LoginDTO)context.getBean("login");
		loginDTO.setUserid(textField.getText());
		loginDTO.setPassword(textField_1.getText());
		MessageDTO messageDTO = helper.login(loginDTO);
		JOptionPane.showMessageDialog(this, messageDTO.getMessage()+" "+messageDTO.getStatus());
	}
}
