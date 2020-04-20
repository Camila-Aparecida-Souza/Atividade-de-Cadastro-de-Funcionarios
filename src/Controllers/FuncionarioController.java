package Controllers;

import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JTextField;
import Models.Funcionario;
/*
 * Classe gerenciadora de eventos
 * captura os eventos que acontecem na view.
 * O controller trata os eventos e os diferencia, qual elemento que disparou aquele evento
 * */
public class FuncionarioController implements ActionListener{

	private JTextField textNome;
	private JTextField textMatricula;
	private ArrayList <Funcionario> listaFuncionario = new ArrayList();
	
	Random aleatorio = new Random();
	
	public FuncionarioController(JTextField textNome, JTextField textMatricula)  //Construtor da classe Funcionario
	{
		this.textNome = textNome;
		this.textMatricula = textMatricula;
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		
		switch(event.getActionCommand()) {
		case "Cadastrar": this.cadastrarFuncionario();
			break;
			
		case "Limpar": this.limparFormulario();
			break;
			
		case "Exibir": this.exibirFuncionario();
			break;
			
		case "Sorteio": this.sorteioFuncionario();
			break;
			
		default:System.out.println("\nUma mensagem qualquer");
		}	
	}
	
	private void cadastrarFuncionario() {
		
		listaFuncionario.add(new Funcionario (textNome.getText(), Integer.parseInt(textMatricula.getText())));
		JOptionPane.showMessageDialog(null, "Funcionario Cadastrado!");
		
	}
	
	private void limparFormulario() {
		System.out.println("Limpar Formulario");
		textNome.setText("");
		textMatricula.setText("");
	}
	
	private void exibirFuncionario() {
		System.out.println("Exibir Funcionario");
		
		if(listaFuncionario.isEmpty()) 
		{
			JOptionPane.showMessageDialog(null, "Erro: Não tem funcionario cadastrado");
		}
		else 
		{
			JOptionPane.showMessageDialog(null, "Dados do ultimo funcionario cadastrado " + listaFuncionario.get(listaFuncionario.size() -1).toString());
		}
		
	}
	
	private void sorteioFuncionario() {
		
		if (listaFuncionario.size() <= 2) {
			JOptionPane.showMessageDialog(null, "Erro: Precisa de 3 funcionarios para o sorteio");
		}
		else {
			JOptionPane.showMessageDialog(null, listaFuncionario.get(aleatorio.nextInt(listaFuncionario.size())).toString());
		}	
	}
}
	

