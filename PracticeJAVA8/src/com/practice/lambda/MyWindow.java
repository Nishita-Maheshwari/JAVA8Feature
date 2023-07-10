package com.practice.lambda;

import java.awt.FlowLayout;

import javax.swing.*;

public class MyWindow {

	public static void main(String[] args) {
		
		//Window :Object JFrame
		String tittle;
		JFrame frame =new JFrame("MyWindow");
		frame.setSize(400,400);
		frame.setLayout(new FlowLayout());
		
		
		
		
		
		//Create Button and add Jframe
		JButton button=new JButton("Click Me !!");
		
		
//		button.addActionListener(new ActionListener());{		
//		JOptionPane.showMessageDialog(parentComponent:null,message:"Hey");	
//		});
		
		button.addActionListener(e->{
			System.out.println("Buttion Click");
		    JOptionPane.showMessageDialog(null,"Hey");
		});
		

		
		
		
		frame.add(button);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		

	}

}
