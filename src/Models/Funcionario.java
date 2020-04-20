package Models;

/*
 * Nessa classe vai mapear 2 atributos que � nome e matricula
 * */
public class Funcionario {

	private String nome;
	private int matricula;
	
	public Funcionario(String nome, int matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}
	
/*
 * Essa � uma regra de captura dos dados, sempre que chamar essa fun��o getMatricula
 * vai sempre retornar a matricula como String
 * */
	
	public String getMatricula() {
		return String.valueOf(this.matricula);
	}

	public String getNome() {
		return this.nome;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + "\nMatricula: " + matricula;
	}	
}

