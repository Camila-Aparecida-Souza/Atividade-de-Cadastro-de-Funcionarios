package Views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controllers.FuncionarioController;
import Models.Funcionario;

import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class FuncionarioFrame extends JFrame {

	private JPanel contentPane;
	private JTextField nameTextField;
	private JTextField matriculaTextField;
	ArrayList <Funcionario> listaFuncionario = new ArrayList<Funcionario>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FuncionarioFrame frame = new FuncionarioFrame();
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
	public FuncionarioFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		nameTextField = new JTextField();
		nameTextField.setBounds(122, 33, 128, 19);
		contentPane.add(nameTextField);
		nameTextField.setColumns(10);
		
		matriculaTextField = new JTextField();
		matriculaTextField.setBounds(122, 75, 128, 19);
		contentPane.add(matriculaTextField);
		matriculaTextField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel.setBounds(39, 32, 73, 19);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Matr\u00EDcula:");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(39, 75, 73, 16);
		contentPane.add(lblNewLabel_1);
		
		JButton btnExibir = new JButton("Exibir");
		btnExibir.setFont(new Font("Arial", Font.PLAIN, 14));
		btnExibir.setBounds(191, 136, 85, 21);
		contentPane.add(btnExibir);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnLimpar.setBounds(314, 136, 85, 21);
		contentPane.add(btnLimpar);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnCadastrar.setBounds(39, 136, 112, 21);
		contentPane.add(btnCadastrar);
		
		JButton btnSorteio = new JButton("Sorteio");
		btnSorteio.setFont(new Font("Engravers MT", Font.BOLD, 14));
		btnSorteio.setBounds(39, 205, 362, 27);
		contentPane.add(btnSorteio);
								
		FuncionarioController handler = new FuncionarioController(nameTextField, matriculaTextField);
		
		btnCadastrar.addActionListener(handler);
		btnExibir.addActionListener(handler);
		btnLimpar.addActionListener(handler);
		btnSorteio.addActionListener(handler);
	}
}
