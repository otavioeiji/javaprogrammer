package br.com.impacta.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.UIManager;

import br.com.impacta.classes.Funcionario;
import br.com.impacta.enumeracoes.Sexos;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class CadastroFuncionario extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtIdade;
	private JTextField txtCargo;
	private JTextField txtSalario;
	private JTextArea txtFuncionario;

	/**
	 * Launch the application.
	 */
	
	private static final String TITULO = "Cadastro de Funcionários";
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					CadastroFuncionario frame = new CadastroFuncionario();
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
	public CadastroFuncionario() {
		setTitle(TITULO);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 561, 546);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 10, 89, 21);
		contentPane.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(109, 10, 175, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Idade:");
		lblNewLabel.setBounds(10, 37, 89, 21);
		contentPane.add(lblNewLabel);
		
		txtIdade = new JTextField();
		txtIdade.setBounds(109, 37, 86, 20);
		contentPane.add(txtIdade);
		txtIdade.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Sexo:");
		lblNewLabel_1.setBounds(10, 64, 89, 21);
		contentPane.add(lblNewLabel_1);
		
		JComboBox<Sexos> cmbSexo = new JComboBox<Sexos>();
		cmbSexo.setBounds(109, 63, 175, 22);
		cmbSexo.addItem(Sexos.MASCULINO);
		cmbSexo.addItem(Sexos.FEMININO);
		contentPane.add(cmbSexo);
		
		JLabel lblNewLabel_2 = new JLabel("Cargo:");
		lblNewLabel_2.setBounds(10, 91, 86, 21);
		contentPane.add(lblNewLabel_2);
		
		txtCargo = new JTextField();
		txtCargo.setBounds(109, 91, 111, 20);
		contentPane.add(txtCargo);
		txtCargo.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Sal\u00E1rio:");
		lblNewLabel_3.setBounds(10, 118, 89, 21);
		contentPane.add(lblNewLabel_3);
		
		txtSalario = new JTextField();
		txtSalario.setBounds(109, 118, 86, 20);
		contentPane.add(txtSalario);
		txtSalario.setColumns(10);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					//obtendo os valores da interface
					String nome = txtNome.getText();
					int idade = Integer.parseInt(txtIdade.getText());
					Sexos sexo = (Sexos)cmbSexo.getSelectedItem();
					String cargo = txtCargo.getText();
					double salario = Double.parseDouble(txtSalario.getText());
					
					//Com estes dados, instanciar a classe Funcionario
					Funcionario f = new Funcionario(nome, sexo, idade, cargo, salario);
					JOptionPane.showMessageDialog(CadastroFuncionario.this, 
							                                       f.getDados());
					
					txtFuncionario.setText(f.getDados());
					
					
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(CadastroFuncionario.this, 
							                      e.getMessage(),
							                      TITULO,
							                      JOptionPane.ERROR_MESSAGE);
				}
				
				
			}
		});
		btnOk.setBounds(104, 149, 91, 23);
		contentPane.add(btnOk);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 192, 282, 202);
		contentPane.add(scrollPane);
		
		txtFuncionario = new JTextArea();
		scrollPane.setViewportView(txtFuncionario);
	}
}
