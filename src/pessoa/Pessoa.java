package pessoa;

public abstract class Pessoa {
	
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void printNome() {
		System.out.println("Nome:" + nome);
	}
	
	public void printId(String id) {
		System.out.println("id: " + id);
	}

}
