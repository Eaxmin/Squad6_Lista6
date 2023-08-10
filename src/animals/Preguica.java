package animals;

public class Preguica extends Animal {
	
	public Preguica() {}
	
	public Preguica(String nome, int idade) {
		super(nome, idade);
	}
	
	@Override
	public String emitirSom() {
		return this.getNome() + " fez aaaa!";
	}
	
	public String subirArvore() {
		return this.getNome() + " subiu na árvore!";
	}
	
	}
