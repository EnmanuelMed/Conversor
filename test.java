import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JDesktopPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class test extends JFrame {

	double valor;
	int divisa1;
    int divisa2;
	int divisa3;
	private JPanel contentPane;
	private JTextField textodivisa;
	private JTextField resultado;
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				 
				
				try {
					test frame = new test();
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
	public test() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 476, 376);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.WHITE);
		contentPane.add(desktopPane, BorderLayout.CENTER);
		
		JComboBox combo1 = new JComboBox();
		combo1.setModel(new DefaultComboBoxModel(new String[] {"USD", "EUR", "YEN"}));
		combo1.setBounds(130, 120, 155, 27);
		desktopPane.add(combo1);
		
		JComboBox combo2 = new JComboBox();
		combo2.setModel(new DefaultComboBoxModel(new String[] {"USD", "EUR", "YEN"}));
		combo2.setBounds(130, 183, 155, 27);
		desktopPane.add(combo2);
		
		textodivisa = new JTextField();
		textodivisa.setBounds(130, 35, 155, 27);
		desktopPane.add(textodivisa);
		textodivisa.setColumns(10);
		
		JButton btnenviar = new JButton("Enviar");
		btnenviar.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				

			
							
				
               }
	     
	        	
			
		});
		btnenviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
			
				 if(textodivisa.getText().isEmpty() ) {
					 JOptionPane.showMessageDialog(null, "Escribe la conversion, el campo esta vacio");
				 }
				
					
				 
				
				 else
					 {
						 valor = Double.parseDouble(textodivisa.getText());
							divisa1 = combo1.getSelectedIndex();
							divisa2 = combo2.getSelectedIndex();
							divisa3 = combo2.getSelectedIndex();
							
							 
							 
							 Conversor puente = new Conversor();
							
							 puente.setValor(valor);
							 puente.setDivisa1(divisa1);
							 puente.setDivisa2(divisa2);
							 puente.setDivisa2(divisa3);
							 
							 
							 puente.convertir();	 
							 resultado.setText(""+puente.convertir());	
							 
							
							
					 }
				
					 
				{
				
				 
				
				}
				
				
				
				
				
			}
		});
		btnenviar.setBounds(81, 233, 89, 23);
		desktopPane.add(btnenviar);
		
		JButton btnborrar = new JButton("Borrar");
		btnborrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				resultado.setText("  ");
			}
		});
		btnborrar.setBounds(232, 233, 89, 23);
		desktopPane.add(btnborrar);
		
		JLabel lblNewLabel = new JLabel("RESULTADO");
		lblNewLabel.setBounds(188, 267, 89, 18);
		desktopPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("          CANTIDAD:");
		lblNewLabel_1.setBounds(148, 0, 114, 27);
		desktopPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("DE:");
		lblNewLabel_2.setBounds(132, 95, 46, 14);
		desktopPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("PARA:");
		lblNewLabel_3.setBounds(132, 158, 46, 14);
		desktopPane.add(lblNewLabel_3);
		
		resultado = new JTextField();
		resultado.setBounds(99, 296, 240, 20);
		desktopPane.add(resultado);
		resultado.setColumns(10);
	}
}
