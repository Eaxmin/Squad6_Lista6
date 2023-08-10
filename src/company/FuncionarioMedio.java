package company;

public class FuncionarioMedio extends Funcionario {
	
	private String escola;

	public FuncionarioMedio() {
	}
	
	public FuncionarioMedio(String nome, int codigoFuncional, String escola, Comissao cargo) {
		super(nome, codigoFuncional, cargo);
		this.escola = escola;
	}

	public String getEscola() {
		return escola;
	}

	public void setEscola(String escola) {
		this.escola = escola;
	}
	
	@Override
	public double calcularRenda() {
		return super.calcularRenda() * 1.6;
	}
}
