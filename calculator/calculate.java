package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;

public class calculate {

	private JFrame frame;
	private JTextField textField;
	private double total;
	public double num;
	public int calculation = 0;
	private String jLabel;

	/**
	 * Launch the application.
	 */
	
	public String getjLabel() {
		return jLabel;
	}

	public void setjLabel(String jLabel) {
		this.jLabel = jLabel;
	}
	
	
	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculate window = new calculate();
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
	public calculate() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void operation() {
		
		switch(calculation){
			case 1:
				total = num + Double.parseDouble(textField.getText());
				textField.setText(Double.toString(total));
				break;
				
			case 2:
				total = num - Double.parseDouble(textField.getText());
				textField.setText(Double.toString(total));
				break;
				
			case 3:
				total = num * Double.parseDouble(textField.getText());
				textField.setText(Double.toString(total));
				break;
				
			case 4:
				total = num / (Double.parseDouble(textField.getText()));
				textField.setText(Double.toString(total));
				break;
				
		}
	}
	
	private void initialize() {
		
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(255, 255, 255));
		frame.setBounds(200, 200, 400, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 50));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(15, 16, 348, 74);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton button_16 = new JButton("=");
		
		
		JButton btnNewButton = new JButton("AC");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("");
			}
		});
		btnNewButton.setBounds(15, 122, 77, 68);
		frame.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("+/-");
		button.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button.setBackground(new Color(192, 192, 192));
		button.setForeground(new Color(0, 0, 0));
		button.setBounds(105, 122, 77, 68);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("%");
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button_1.setBackground(new Color(192, 192, 192));
		button_1.setForeground(new Color(0, 0, 0));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num = (Double.parseDouble(textField.getText())) / 100;
				textField.setText(Double.toString(num));
				setjLabel(Double.toString(num));
			}
		});
		button_1.setBounds(195, 122, 77, 68);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("/");
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		button_2.setBackground(new Color(244, 164, 96));
		button_2.setForeground(new Color(255, 255, 255));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num = Double.parseDouble(textField.getText());
				calculation = 4;
				textField.setText("");
				setjLabel(num + "/");
			}
		});
		button_2.setBounds(286, 122, 77, 68);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("7");
		button_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button_3.setBackground(new Color(105, 105, 105));
		button_3.setForeground(new Color(255, 255, 255));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + "7");
			}
		});
		button_3.setBounds(15, 209, 77, 68);
		frame.getContentPane().add(button_3);
		
		
		JButton button_4 = new JButton("8");
		button_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button_4.setBackground(new Color(105, 105, 105));
		button_4.setForeground(new Color(255, 255, 255));
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + "8");
			}
		});
		button_4.setBounds(105, 209, 77, 68);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("9");
		button_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button_5.setBackground(new Color(105, 105, 105));
		button_5.setForeground(new Color(255, 255, 255));
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + "9");
			}
		});
		button_5.setBounds(195, 209, 77, 68);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("x");
		button_6.setFont(new Font("Tahoma", Font.PLAIN, 30));
		button_6.setBackground(new Color(244, 164, 96));
		button_6.setForeground(new Color(255, 255, 255));
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num = Double.parseDouble(textField.getText());
				calculation = 3;
				textField.setText("");
				setjLabel(num + "*");
			}
		});
		button_6.setBounds(286, 209, 77, 68);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("4");
		button_7.setForeground(Color.WHITE);
		button_7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button_7.setBackground(SystemColor.controlDkShadow);
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + "4");
			}
		});
		button_7.setBounds(15, 293, 77, 68);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("5");
		button_8.setForeground(Color.WHITE);
		button_8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button_8.setBackground(SystemColor.controlDkShadow);
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + "5");
			}
		});
		button_8.setBounds(105, 293, 77, 68);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("6");
		button_9.setForeground(Color.WHITE);
		button_9.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button_9.setBackground(SystemColor.controlDkShadow);
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + "6");
			}
		});
		button_9.setBounds(195, 293, 77, 68);
		frame.getContentPane().add(button_9);
		
		JButton button_10 = new JButton("-");
		button_10.setForeground(Color.WHITE);
		button_10.setFont(new Font("Tahoma", Font.PLAIN, 45));
		button_10.setBackground(new Color(244, 164, 96));
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num = Double.parseDouble(textField.getText());
				calculation = 2;
				textField.setText("");
				setjLabel(num + "-");
			}
		});
		button_10.setBounds(286, 293, 77, 68);
		frame.getContentPane().add(button_10);
		
		JButton button_11 = new JButton("1");
		button_11.setForeground(Color.WHITE);
		button_11.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button_11.setBackground(SystemColor.controlDkShadow);
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + "1");
			}
		});
		button_11.setBounds(15, 377, 77, 68);
		frame.getContentPane().add(button_11);
		
		JButton button_12 = new JButton("+");
		button_12.setForeground(Color.WHITE);
		button_12.setFont(new Font("Tahoma", Font.PLAIN, 30));
		button_12.setBackground(new Color(244, 164, 96));
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num = Double.parseDouble(textField.getText());
				calculation = 1;
				textField.setText("");
				setjLabel(num + "+");
			}
		});
		button_12.setBounds(286, 377, 77, 68);
		frame.getContentPane().add(button_12);
		
		JButton button_13 = new JButton("3");
		button_13.setForeground(Color.WHITE);
		button_13.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button_13.setBackground(SystemColor.controlDkShadow);
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + "3");
			}
		});
		button_13.setBounds(195, 377, 77, 68);
		frame.getContentPane().add(button_13);
		
		JButton button_14 = new JButton("2");
		button_14.setForeground(Color.WHITE);
		button_14.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button_14.setBackground(SystemColor.controlDkShadow);
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + "2");
			}
		});
		button_14.setBounds(105, 377, 77, 68);
		frame.getContentPane().add(button_14);
		
		JButton button_15 = new JButton("0");
		button_15.setForeground(Color.WHITE);
		button_15.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button_15.setBackground(SystemColor.controlDkShadow);
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + "0");
			}
		});
		button_15.setBounds(15, 461, 167, 68);
		frame.getContentPane().add(button_15);
		
		/* Equals to */
		button_16.setForeground(Color.WHITE);
		button_16.setFont(new Font("Tahoma", Font.PLAIN, 30));
		button_16.setBackground(new Color(244, 164, 96));
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				operation();
				setjLabel("");
			}
		});
		button_16.setBounds(286, 461, 77, 68);
		frame.getContentPane().add(button_16);
		
		JButton button_17 = new JButton(".");
		button_17.setForeground(Color.WHITE);
		button_17.setFont(new Font("Tahoma", Font.PLAIN, 35));
		button_17.setBackground(SystemColor.controlDkShadow);
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + ".");
			}
		});
		button_17.setBounds(195, 461, 77, 68);
		frame.getContentPane().add(button_17);
	}
}
