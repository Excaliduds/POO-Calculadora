package calculadora;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Calculadora {

	private JFrame frmEduardoPinheiroDa;
	private JTextField JTFResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
					window.frmEduardoPinheiroDa.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculadora() {
		initialize();
	}
	
	private double valor1, valor2, valor3, valor4, valor5, valor6, valor7, valor8, valor9;
	private double resultadoCalculado = 0;
	private String op;
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEduardoPinheiroDa = new JFrame();
		frmEduardoPinheiroDa.getContentPane().setBackground(new Color(108, 103, 200));
		frmEduardoPinheiroDa.setBackground(new Color(0, 0, 0));
		frmEduardoPinheiroDa.setForeground(new Color(255, 255, 255));
		frmEduardoPinheiroDa.setFont(new Font("Arial Black", Font.BOLD, 16));
		frmEduardoPinheiroDa.setTitle("Eduardo Pinheiro da Luz | RA: 0025085");
		frmEduardoPinheiroDa.setBounds(100, 100, 406, 587);
		frmEduardoPinheiroDa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEduardoPinheiroDa.getContentPane().setLayout(null);
		
		JButton btnSoma = new JButton("+");
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				valor1 = Double.parseDouble(JTFResultado.getText());
				resultadoCalculado = valor1;
				JTFResultado.setText("");
				op = "soma";
			}
		});
		btnSoma.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSoma.setBounds(319, 463, 61, 63);
		frmEduardoPinheiroDa.getContentPane().add(btnSoma);
		
		JButton btnSubtracao = new JButton("-");
		btnSubtracao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				valor1 = Double.parseDouble(JTFResultado.getText());
				resultadoCalculado = Double.parseDouble(JTFResultado.getText());
				JTFResultado.setText("");
				op = "Subtracao";
			
			}
		});
		btnSubtracao.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSubtracao.setBounds(248, 463, 61, 63);
		frmEduardoPinheiroDa.getContentPane().add(btnSubtracao);
		
		JButton btnMultiplicacao = new JButton("*");
		btnMultiplicacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				valor1 = Double.parseDouble(JTFResultado.getText());
				resultadoCalculado = Double.parseDouble(JTFResultado.getText());
				JTFResultado.setText("");
				op = "Multiplicacao";
			
			}
		});
		btnMultiplicacao.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMultiplicacao.setBounds(319, 389, 61, 63);
		frmEduardoPinheiroDa.getContentPane().add(btnMultiplicacao);
		
		JButton btnDivisao = new JButton("/");
		btnDivisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				valor1 = Double.parseDouble(JTFResultado.getText());
				resultadoCalculado = Double.parseDouble(JTFResultado.getText());
				JTFResultado.setText("");
				op = "Divisao";
			
			}
		});
		btnDivisao.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDivisao.setBounds(248, 389, 61, 63);
		frmEduardoPinheiroDa.getContentPane().add(btnDivisao);
		
		JButton btnPotenciacao = new JButton("^");
		btnPotenciacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				valor1 = Double.parseDouble(JTFResultado.getText());
				resultadoCalculado = Double.parseDouble(JTFResultado.getText());
				JTFResultado.setText("");
				op = "Potenciacao";
			
			}
		});
		btnPotenciacao.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPotenciacao.setBounds(319, 315, 61, 63);
		frmEduardoPinheiroDa.getContentPane().add(btnPotenciacao);
		
		JButton btnApagar = new JButton("C");
		btnApagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				valor1 = Double.parseDouble(JTFResultado.getText());
				resultadoCalculado = Double.parseDouble(JTFResultado.getText());
				JTFResultado.setText("");
				op = "Apagar";
			
			}
		});
		btnApagar.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnApagar.setBounds(248, 315, 61, 63);
		frmEduardoPinheiroDa.getContentPane().add(btnApagar);
		
		JButton btnIgual = new JButton("=");
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if(!JTFResultado.getText().isEmpty()) {
					
					valor1 = Double.parseDouble(JTFResultado.getText());
					valor2 = Double.parseDouble(JTFResultado.getText());
					valor3 = Double.parseDouble(JTFResultado.getText());
					valor4 = Double.parseDouble(JTFResultado.getText());
					valor5 = Double.parseDouble(JTFResultado.getText());
					valor6 = Double.parseDouble(JTFResultado.getText());
					valor7 = Double.parseDouble(JTFResultado.getText());
					valor8 = Double.parseDouble(JTFResultado.getText());
					valor9 = Double.parseDouble(JTFResultado.getText());
	
					if ("soma".equals(op)) {
					    resultadoCalculado += valor2;
					    JTFResultado.setText(String.valueOf(resultadoCalculado));			
					}
					if ("Subtracao".equals(op)) {
					    resultadoCalculado -= valor2;
					    JTFResultado.setText(String.valueOf(resultadoCalculado));
					}
					if ("Multiplicacao".equals(op)) {
					    resultadoCalculado *= valor2;
					    JTFResultado.setText(String.valueOf(resultadoCalculado));
					}
					if ("Divisao".equals(op)) {
					    resultadoCalculado /= valor2;
					    JTFResultado.setText(String.valueOf(resultadoCalculado));
					}
					if("Potenciacao".equals(op)) {
					    resultadoCalculado = Math.pow(resultadoCalculado, valor2);
					    JTFResultado.setText(String.valueOf(resultadoCalculado));
					}
				}
			}
		});
		btnIgual.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnIgual.setBounds(248, 241, 132, 63);
		frmEduardoPinheiroDa.getContentPane().add(btnIgual);
		
		JButton btnPonto = new JButton(".");
		btnPonto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTFResultado.setText(".");

			}
		});
		btnPonto.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPonto.setBounds(10, 463, 61, 63);
		frmEduardoPinheiroDa.getContentPane().add(btnPonto);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTFResultado.setText("0");
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn0.setBounds(81, 463, 61, 63);
		frmEduardoPinheiroDa.getContentPane().add(btn0);
		
		JButton btnVirgula = new JButton(",");
		btnVirgula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTFResultado.setText(",");

			}
		});
		btnVirgula.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnVirgula.setBounds(152, 463, 61, 63);
		frmEduardoPinheiroDa.getContentPane().add(btnVirgula);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTFResultado.setText("1");

			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn1.setBounds(10, 389, 61, 63);
		frmEduardoPinheiroDa.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTFResultado.setText("2");

			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn2.setBounds(81, 389, 61, 63);
		frmEduardoPinheiroDa.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTFResultado.setText("3");
			
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn3.setBounds(152, 389, 61, 63);
		frmEduardoPinheiroDa.getContentPane().add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTFResultado.setText("4");

			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn4.setBounds(10, 315, 61, 63);
		frmEduardoPinheiroDa.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTFResultado.setText("5");

			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn5.setBounds(81, 315, 61, 63);
		frmEduardoPinheiroDa.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTFResultado.setText("6");

			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn6.setBounds(152, 315, 61, 63);
		frmEduardoPinheiroDa.getContentPane().add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTFResultado.setText("7");

			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBounds(10, 241, 61, 63);
		frmEduardoPinheiroDa.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTFResultado.setText("8");

			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.setBounds(81, 241, 61, 63);
		frmEduardoPinheiroDa.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTFResultado.setText("9");

			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.setBounds(152, 241, 61, 63);
		frmEduardoPinheiroDa.getContentPane().add(btn9);
		
		JTFResultado = new JTextField();
		JTFResultado.setHorizontalAlignment(SwingConstants.CENTER);
		JTFResultado.setFont(new Font("Tahoma", Font.BOLD, 20));
		JTFResultado.setBounds(10, 60, 370, 91);
		frmEduardoPinheiroDa.getContentPane().add(JTFResultado);
		JTFResultado.setColumns(10);
	}
}
