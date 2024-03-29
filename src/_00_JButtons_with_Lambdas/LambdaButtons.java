package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LambdaButtons {
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");
	
	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);
		
		//1. Call the addActionListener methods for each button. Use lambdas
		//   to define to functionality of the buttons.
		
		addNumbers.addActionListener((ActionEvent e)->{
		
		int x = Integer.parseInt(JOptionPane.showInputDialog("Number 1:"));
		int y = Integer.parseInt(JOptionPane.showInputDialog("Number 2:"));
		JOptionPane.showMessageDialog(null, x+y);
		});
		
		randNumber.addActionListener((ActionEvent e)->{
			
			Random randy = new Random();
			JOptionPane.showMessageDialog(null, randy.nextInt());
			});
		
		tellAJoke.addActionListener((ActionEvent e)->{
			
			JOptionPane.showMessageDialog(null,"Here\'s a joke:\nYou!");
			});

		window.setVisible(true);
		window.pack();
	}
	
	public static void main(String[] args) {
		new LambdaButtons();
	}
	
	
}
