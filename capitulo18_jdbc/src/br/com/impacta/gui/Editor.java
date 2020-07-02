package br.com.impacta.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.UIManager;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Formatter;

public class Editor extends JFrame {

	private JPanel contentPane;
	private JTextArea txtArquivo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(
							UIManager.getSystemLookAndFeelClassName());
					
					Editor frame = new Editor();
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
	public Editor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 727, 458);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 92, 699, 328);
		contentPane.add(scrollPane);
		
		txtArquivo = new JTextArea();
		scrollPane.setViewportView(txtArquivo);
		
		JButton btnAbrirArquivo = new JButton("Abrir Arquivo");		
		btnAbrirArquivo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser chooser = new JFileChooser();
				try {
					int opcao = chooser.showOpenDialog(Editor.this);
					if(opcao == JFileChooser.APPROVE_OPTION){
						FileReader arquivo = new FileReader(
								chooser.getSelectedFile());
						BufferedReader buffer = 
								new BufferedReader(arquivo);
						
						String texto = "";
						StringBuilder sb = new StringBuilder();
						while(true){
							String linha = buffer.readLine();
							if(linha == null){
								break;
							}
							sb.append(linha);
							sb.append("\n");
						}
						texto = sb.toString();
						txtArquivo.setText(texto);
					}
				} catch (Exception e) {
					JOptionPane.showMessageDialog(
							Editor.this,
							e.getMessage(),
							"Erro",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
//		btnAbrirArquivo.addActionListener( 
//				s -> System.out.println("teste")
//				);
		
		
		btnAbrirArquivo.setBounds(10, 11, 184, 23);
		contentPane.add(btnAbrirArquivo);
		
		JButton btnSalvarArquivo = new JButton("Salvar Arquivo");
		btnSalvarArquivo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser chooser = new JFileChooser();
				
				try {
					int opcao = chooser.showSaveDialog(Editor.this);
					if(opcao == JFileChooser.APPROVE_OPTION){
						
						File file = new File(chooser.getSelectedFile().getAbsolutePath());
						
						if(file.exists()){
							opcao = JOptionPane.showConfirmDialog(
									       Editor.this, 
									       "Este arquivo já existe. Deseja sobrescrevê-lo?",
									       "Confirmação",
									       JOptionPane.YES_NO_OPTION);
							if(opcao == JOptionPane.NO_OPTION){
								return;
							}
						}
						
						FileWriter arquivo = new FileWriter(
								chooser.getSelectedFile());
						arquivo.write(txtArquivo.getText());
						arquivo.close();
						
						JOptionPane.showMessageDialog(
								Editor.this, 
								"Arquivo salvo com sucesso");
						
					}
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(
							Editor.this,
							e.getMessage(),
							"Erro",
							JOptionPane.ERROR_MESSAGE);					
				}				
			}
		});
		
		btnSalvarArquivo.setBounds(204, 11, 184, 23);
		contentPane.add(btnSalvarArquivo);
		
		JButton btnListarArquivos = new JButton("Listar Arquivos");
		btnListarArquivos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					File file = new File("C:/Windows");
					String[] arquivos = file.list();
					StringBuilder sb = new StringBuilder();
					
					for(String arquivo: arquivos){
						File f = new File("C:/Windows/"+arquivo);
						Formatter fmt = new Formatter();
						String linha="";
						
						//sb.append(arquivo);
						if(f.isDirectory()){
							linha = fmt.format("%-50s %12s%n", arquivo,"[Diretório]").toString();
							sb.append(linha);
							//sb.append(" [Diretório]");
						}
						else{
							linha = fmt.format("%-50s %12s%n", arquivo,"[Arquivo]").toString();
							sb.append(linha);
							//sb.append(" [Arquivo]");
						}
						
						//sb.append("\n");
					}
					txtArquivo.setText(sb.toString());
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(
							Editor.this,
							e.getMessage(),
							"Erro",
							JOptionPane.ERROR_MESSAGE);										
				}
				
				
				
				
			}
		});
		btnListarArquivos.setBounds(397, 11, 184, 23);
		contentPane.add(btnListarArquivos);
	}
}
