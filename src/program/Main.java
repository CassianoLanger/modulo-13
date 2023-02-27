package program;

import pessoaFisica.Fisica;
import pessoaJuridica.Juridica;

public class Main {
	
	public static void main(String[]args) {
		
		Fisica pessoa = new Fisica();
		pessoa.setNome("Guilherme");
		pessoa.setCpf("10");
		
		Juridica pessoa2 = new Juridica();
		pessoa2.setNome("Matheus");
		pessoa2.setCnpj("11");
		
		pessoa.printNome();
		pessoa.printId(pessoa.getCpf());
		
		pessoa2.printNome();
		pessoa2.printId(pessoa2.getCnpj());
	}

}
