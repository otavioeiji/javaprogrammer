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



import br.com.impacta.classes.Empresa;
import br.com.impacta.classes.Funcionario;
import br.com.impacta.enumeracoes.Sexos;



import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;



import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;



import java.awt.Font;
import java.awt.Color;

public class CadastroFuncionario extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtIdade;
	private JTextField txtCargo;
	private JTextField txtSalario;
	private JTextArea txtFuncionario;

	JComboBox<Empresa> cmbEmpresa;
	Empresa[] empresas = new Empresa[2];
	JLabel lblHora;
	Thread t;
	
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
		lblNome.setBounds(10, 123, 89, 21);
		contentPane.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(109, 124, 175, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Idade:");
		lblNewLabel.setBounds(10, 150, 89, 21);
		contentPane.add(lblNewLabel);
		
		txtIdade = new JTextField();
		txtIdade.setBounds(109, 151, 86, 20);
		contentPane.add(txtIdade);
		txtIdade.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Sexo:");
		lblNewLabel_1.setBounds(10, 177, 89, 21);
		contentPane.add(lblNewLabel_1);
		
		JComboBox<Sexos> cmbSexo = new JComboBox<Sexos>();
		cmbSexo.setBounds(109, 177, 175, 22);
		cmbSexo.addItem(Sexos.MASCULINO);
		cmbSexo.addItem(Sexos.FEMININO);
		contentPane.add(cmbSexo);
		
		JLabel lblNewLabel_2 = new JLabel("Cargo:");
		lblNewLabel_2.setBounds(10, 204, 86, 21);
		contentPane.add(lblNewLabel_2);
		
		txtCargo = new JTextField();
		txtCargo.setBounds(109, 205, 111, 20);
		contentPane.add(txtCargo);
		txtCargo.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Sal\u00E1rio:");
		lblNewLabel_3.setBounds(10, 231, 89, 21);
		contentPane.add(lblNewLabel_3);
		
		txtSalario = new JTextField();
		txtSalario.setBounds(109, 232, 86, 20);
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
					
					//Empresa empresa = empresas[cmbEmpresa.getSelectedIndex()];
					Empresa empresa = (Empresa)cmbEmpresa.getSelectedItem();
					
					empresa.getFuncionarios().add(f);
					
					
					
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(CadastroFuncionario.this, 
							                      e.getMessage(),
							                      TITULO,
							                      JOptionPane.ERROR_MESSAGE);
				}
				
				
			}
		});
		btnOk.setBounds(104, 263, 91, 23);
		contentPane.add(btnOk);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 306, 282, 202);
		contentPane.add(scrollPane);
		
		txtFuncionario = new JTextArea();
		scrollPane.setViewportView(txtFuncionario);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Cadastro de Empresas", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(20, 10, 356, 107);
		contentPane.add(panel);
		panel.setLayout(null);
		
		cmbEmpresa = new JComboBox<Empresa>();
		cmbEmpresa.setBounds(77, 22, 158, 22);
		
		empresas[0] = new Empresa("00254152000182", "Oracle");
		empresas[1] = new Empresa("33854900000199", "Microsoft");
		cmbEmpresa.addItem(empresas[0]);
		cmbEmpresa.addItem(empresas[1]);
		panel.add(cmbEmpresa);
		
		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//obtendo a lista de funcionários da empresa selecionada
				List<Funcionario> funcionarios = 
					empresas[cmbEmpresa.getSelectedIndex()].getFuncionarios();
				
				String lista = "";
				for (Funcionario funcionario : funcionarios) {
					lista += funcionario.getNome() + "\r\n";
				}
				
				txtFuncionario.setText(lista);
			}
		});
		btnMostrar.setBounds(237, 22, 91, 23);
		panel.add(btnMostrar);
		
		JLabel lblEmpresa = new JLabel("Empresa:");
		lblEmpresa.setBounds(10, 26, 46, 14);
		panel.add(lblEmpresa);
		
		lblHora = new JLabel("New label");
		lblHora.setForeground(Color.BLUE);
		lblHora.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblHora.setBounds(406, 25, 111, 14);
		contentPane.add(lblHora);
		
		JButton btnIniciar = new JButton("Iniciar");
		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				t = new Thread(() -> {
					DateFormat df = new SimpleDateFormat("HH:mm:ss");
					while(true){
						String data = df.format(new Date());
						lblHora.setText(data);
						
						try {
							Thread.sleep(1000);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				});
				
				t.start();				
			}
		});
		btnIniciar.setBounds(404, 58, 91, 23);
		contentPane.add(btnIniciar);
		
		JButton btnTerminar = new JButton("Terminar");
		btnTerminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				t.stop();
			}
		});
		btnTerminar.setBounds(406, 92, 91, 23);
		contentPane.add(btnTerminar);
	}
}
